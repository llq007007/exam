package com.qst.examsystem.controller.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 验证用户是否登录过滤器
 */
@WebFilter(filterName = "SessionCheckFilter",urlPatterns ={"/admin/adminmain.jsp" ,"/teacher/teachermain.jsp","/student/studentmain.jsp"})
public class SessionCheckFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * 说明：HttpServletRequest接口继承ServletRequest接口
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //过滤请求或拦截请求
        //判断用户有没有登录
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        HttpSession session=request.getSession();//获取当前会话
        if (session.getAttribute("user")==null){
            //用户未登录,重定向到登录页面
            response.sendRedirect("/index.jsp");
        }else{
            //通过验证
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
