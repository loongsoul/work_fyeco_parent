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
public class WebMvcConfig extends WebMvcConfigurationSupport {//} WebMvcConfigurer {

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
     * 添加资源处理程序，处理来自Web应用程序根目录下特定位置的静态资源文件，如图像、JS和CSS
     *
     * @param registry reg
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
        .addResourceLocations("classpath:/static/");

//        registry.addResourceHandler("/templates/**");
//        registry.addResourceHandler("/public/**");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor())
//                .addPathPatterns("**")
//                .excludePathPatterns("/static/**");
    }

}