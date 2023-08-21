package com.powernode.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WebInfAction {

    @RequestMapping("/showIndex")
    public String show(){
        System.out.println("访问index.jsp");
        return "index";
    }

    @RequestMapping("/showMain")
    public String show2(){
        System.out.println("访问main.jsp");
        return "main";
    }

    @RequestMapping("/showLogin")
    public String show3(){
        System.out.println("访问login.jsp");
        return "login";
    }

    //登陆的业务判断

    @RequestMapping("/login")
    public String show4(String name, String pwd, HttpServletRequest request){
        if("zar".equalsIgnoreCase(name)&&"123".equalsIgnoreCase(pwd)){
            //如果登录成功，在session中存储用户的信息，用于进行权限验证
            request.getSession().setAttribute("users",name);
            return "main";
        }else {
            request.setAttribute("msg","用户名或密码不正确！");
            return "login";
        }

    }
}
