package com.yc.atcrowdfunding.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {
	 @Override
	 public void addInterceptors(InterceptorRegistry registry) {
        // 拦截所有请求，通过判断是否有 @LoginRequired 注解 决定是否需要登录
        registry.addInterceptor(LoginInterceptor()).addPathPatterns("/list");
        registry.addInterceptor(LoginInterceptor()).addPathPatterns("/add");
        registry.addInterceptor(LoginInterceptor()).addPathPatterns("/addHouse");
        registry.addInterceptor(LoginInterceptor()).addPathPatterns("/modify");
        registry.addInterceptor(LoginInterceptor()).addPathPatterns("/modifyHouse");
        registry.addInterceptor(LoginInterceptor()).addPathPatterns("/deleteHouse");
        registry.addInterceptor(LoginInterceptor()).addPathPatterns("/logout");
        registry.addInterceptor(LoginInterceptor()).addPathPatterns("/findAll");
        registry.addInterceptor(LoginInterceptor()).addPathPatterns("/findAllStreet");
	 }
	 
	 @Bean
	 public LoginInterceptor LoginInterceptor() {
		 return new LoginInterceptor();
	 }
	 
	 @Bean
	 public LoginInterceptor AuthorityInterceptor() {
		 return new LoginInterceptor();
	 }
}