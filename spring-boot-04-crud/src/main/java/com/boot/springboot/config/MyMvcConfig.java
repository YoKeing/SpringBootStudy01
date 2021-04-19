package com.boot.springboot.config;


import com.boot.springboot.component.LoginHandlerInterceptor;
import com.boot.springboot.component.MyLocaleResolver;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;


/**
 * @author Abyss
 */
//@EnableWebMvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurationSupport {

//    @Bean
//    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
//        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
//            @Override
//            public void customize(ConfigurableWebServerFactory factory) {
//                factory.setPort(8083);
//            }
//        };
//    }

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/boot").setViewName("success");
        registry.addViewController("/").setViewName("login");
//        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
//                .excludePathPatterns("/index.html", "/", "/user/login");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/asserts")
                .addResourceLocations("classpath:/templates/");
        super.addResourceHandlers(registry);
    }

    @Bean
    public WebMvcConfigurationSupport webMvcConfigurationSupport(){
        WebMvcConfigurationSupport webMvcConfigurationSupport = new WebMvcConfigurationSupport(){
            @Override
            protected void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/login").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/login.html").setViewName("login");
            }
        };

        return webMvcConfigurationSupport;

    }

    @Override
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }


}
