package ltd.fyeco.soms.config;

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

//import ltd.fyeco.soms.config.properties.SecurityProperties;
//import ltd.fyeco.soms.web.handler.AuthenticationFailureHandler;
//import ltd.fyeco.soms.web.handler.AuthenticationSuccessHandler;

/**
 * 自定义安全配置
 *
 * @author Tian Xin
 */
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsService userDetailsService;

//
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
//				/** 允许请求开放页面 */
				.antMatchers("/default/**", "/static/default/**", "/templates/default/**").permitAll()
//				.antMatchers("/main", "/sign-in", "/sign-up", "/forgot-password", "/session_expired").permitAll()
//				/** 其他请求需要验证权限 */
				.anyRequest().authenticated().and()
//				/** 表单登录 */
				.formLogin().loginPage("/signin.html").loginProcessingUrl("/user/signin")
//				/** 自定义用户名和密码参数名称 */
//				.usernameParameter("username").passwordParameter("password")
//				/** 登录成功后默认跳转 */
//				.defaultSuccessUrl("/main/dashboard/metrics")
//				/** 登录失败跳转 */
				.failureUrl("/signin.html?error").permitAll().and()
//				/** 注销地址 */
				.logout()
//				.logoutUrl("/sign-out")
//				/** 注销成功后默认跳转 */
//				.logoutSuccessUrl("/sign-in")

				.permitAll().and().httpBasic().disable();
//
//		/** 编码过滤器 */
//		CharacterEncodingFilter filter = new CharacterEncodingFilter();
//		filter.setEncoding("UTF-8");
//		filter.setForceEncoding(true);
//		http.addFilterBefore(filter, CsrfFilter.class);
//
	}
//

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
