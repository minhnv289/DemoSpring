package com.example.demostart.filter;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.LogRecord;

@Component
@Order(2)
public class MyFilter_1 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter_1 call......");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
