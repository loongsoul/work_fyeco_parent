package ltd.fyeco.soms.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import ltd.fyeco.soms.common.constants.MagicValueConst;

//import ltd.fyeco.soms.config.properties.SecurityProperties;
//import ltd.fyeco.soms.web.handler.AuthenticationFailureHandler;
//import ltd.fyeco.soms.web.handler.AuthenticationSuccessHandler;
//import org.springframework.security.web.authentication.

/**
 * 自定义安全配置
 *
 * @author Tian Xin
 */
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	private static final Logger logger = LogManager.getLogger(WebSecurityConfiguration.class);

//	@Autowired
//	private UsernamePasswordAuthenticationProvider usernamePasswordAuthenticationProvider;
//	
//	@Autowired
//	private MobileCodeAuthenticationProvider mobileCodeAuthenticationProvider;

	@Autowired
	UserDetailsService userDetailsService;

	/**
	 * HttpSecurity 配置
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		logger.debug("使用自定义配置（HttpSecurity）。将覆盖默认配置。");

		http.authorizeRequests()
				// 允许请求静态资源
				.antMatchers("/static/**", "/default/**").permitAll()
				// 允许请求开放页面
				.antMatchers("/user/signin").permitAll()//"/main", "/sign-in", "/sign-up", "/forgot-password", "/session_expired"
				// 其他请求需要验证权限
				.anyRequest().authenticated()
				// -
				.and()
				// 表单登录
				.formLogin().loginPage("/signin.html")
				// 登录请求处理映射
				 .loginProcessingUrl("/user/signin")
				// 自定义用户名和密码参数名称
				.usernameParameter("username").passwordParameter("password")
				// 登录成功后默认跳转
				.defaultSuccessUrl("/index.html")
				// 登录失败跳转
				.failureUrl("/signin.html?error")
				// -
				.permitAll().and()
				// 注销地址
				.logout().logoutUrl("/signout")
				// 注销成功后默认跳转
				.logoutSuccessUrl("/signin")
				// 清除 Cookies
				.deleteCookies("JSESSIONID")
				// 会话失效
				.invalidateHttpSession(true)
				// -
				.permitAll().and()
// 会话管理
				.sessionManagement()
//				.invalidSessionUrl("/session_expired")
				.maximumSessions(MagicValueConst.SESSION_MAX).maxSessionsPreventsLogin(true)
//				.expiredUrl("/session_expired")
		;
//
//		/** 编码过滤器 */
//		CharacterEncodingFilter filter = new CharacterEncodingFilter();
//		filter.setEncoding("UTF-8");
//		filter.setForceEncoding(true);
//		http.addFilterBefore(filter, CsrfFilter.class);
//
	}

	/**
	 * 认证管理器配置
	 * 
	 * @param auth
	 * @throws Exception
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	/**
	 * 口令加密算法器 BCryptPasswordEncoder
	 * 
	 * @return
	 */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
