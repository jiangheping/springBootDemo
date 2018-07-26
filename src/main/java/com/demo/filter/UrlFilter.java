package com.demo.filter;

import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


//自定义过滤器
//@Configuration 将该类放入容器中，如果不加，将不会加载该类
@Configuration
@WebFilter(urlPatterns = "/*", filterName = "urlFilter")
public class UrlFilter implements Filter {

    //项目启动时执行该方法
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(" urlFilter init ---------- ");
    }

    //满足条件就会执行，会执行多次
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        System.out.println(" request url is " + request1.getRequestURL());
        chain.doFilter(request, response);
    }

    //项目容器结束时执行该方法
    @Override
    public void destroy() {
        System.out.println(" urlFilter destroy --------- ");
    }
}
