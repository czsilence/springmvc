package com.powernode.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpAction {
    @RequestMapping("/one.action")
    public String one(){
        System.out.println("这是请求转发页面跳转.....");
        return "main";  //默认是请求转发，使用视图解析器拼接前缀后缀进行页面跳转
    }

    @RequestMapping("/two.action")
    public String two(){
        System.out.println("这是请求转发action跳转.....");
        //forward:这组字符串可以屏蔽前缀和后缀的拼接，实现请求转发跳转
        return "forward:/other.action";  //默认是请求转发，使用视图解析器拼接前缀后缀进行页面跳转
    }

    @RequestMapping("/three.action")
    public String three(){
        System.out.println("这是重定向页面跳转.....");
        //redirect: 这组字符串可以屏蔽前缀和后缀的拼接，实现重定向跳转
        return "redirect:/admin/main.jsp";
    }

    @RequestMapping("/four.action")
    public String four(){
        System.out.println("这是重定向action跳转.....");

        return "redirect:/other.action";
    }

    @RequestMapping("/five.action")
    public String five(){
        System.out.println("随便跳.....");
        return "forward:/fore/login.jsp";
    }
}
