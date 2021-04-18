package com.example.demostart.config;

import com.example.demostart.filter.MyNewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfig {
    @Bean
    public FilterRegistrationBean<MyNewFilter> registrationBean() {
        FilterRegistrationBean<MyNewFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyNewFilter());
        registrationBean.addUrlPatterns("/customers/getCustomers/*");
        return registrationBean;
    }
}
