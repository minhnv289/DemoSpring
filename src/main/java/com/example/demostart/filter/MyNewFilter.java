package com.example.demostart.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyNewFilter  implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("New Filter call......");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
