package com.demo.springbootbook.config;

import com.demo.springbootbook.interceptor.LogIntercepter;
import com.demo.springbootbook.interceptor.TimeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {
    @Autowired
    private LogIntercepter logIntercepter;
    @Autowired
    private TimeInterceptor timeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logIntercepter);
        registry.addInterceptor(timeInterceptor);
    }

}
