package com.powernode.springmvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        //是否登陆过的判断
        if (request.getSession().getAttribute("users")==null) {
            //此时没有登录，返回到登录页面，并给出提示
            request.setAttribute("msg","您还没有登录，请先去登录");
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
            return false;
        }
        return true; //放行请求
    }
}
