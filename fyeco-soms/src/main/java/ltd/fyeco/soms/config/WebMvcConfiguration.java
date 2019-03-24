package ltd.fyeco.soms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * 自定义MVC配置
 *
 * @author Tian Xin
 */
@Configuration
@EnableWebMvc
public class WebMvcConfiguration implements WebMvcConfigurer {

	/**
	 * 添加视图控制器
	 *
	 * @param registry reg
	 */
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/main").setViewName("main");
//        registry.addViewController("/sign-up").setViewName("sign-up");
//        registry.addViewController("/sign-in").setViewName("sign-in");
//        registry.addViewController("/forgot-password").setViewName("forgot-password");
//        registry.addViewController("/dashboard").setViewName("dashboard");
//    }

	/**
	 * 添加资源处理程序
	 *
	 * @param registry
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**")
//		"/META-INF/resources/","classpath:/resources/",
				.addResourceLocations("classpath:/static/", "classpath:/public/");
//		registry.addResourceHandler("/default/**")
//		.addResourceLocations("classpath:/static/default");
//        registry.addResourceHandler("/templates/**")
//		.addResourceLocations("classpath:/templates/");
//        registry.addResourceHandler("/public/**")
//		.addResourceLocations("classpath:/public/");
	}

	/**
	 * 添加拦截器
	 * 
	 * @param registry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(new ResourceInterceptor())
//		// 添加拦截规则
//		.addPathPatterns("/**")
//		// 排除拦截规则
//		// "/templates/**", "/public/**", 
//		.excludePathPatterns("/static/**", "/default/**");
	}

}