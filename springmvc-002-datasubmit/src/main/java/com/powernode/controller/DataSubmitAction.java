package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DataSubmitAction {
    @RequestMapping("/one.action")
    public String one(String myname,int age){
        System.out.println("myname="+myname+",age="+(age+10));
        return "main";
    }


    @RequestMapping(value = "/two.action")
    public String two(String name,int age){
        System.out.println("name="+name+",age="+age);
        return "main";
    }


    @RequestMapping("/three/{uname}/{age}.action")
    public String three(
            @PathVariable("uname")
            String name,
            @PathVariable
            int age){
        System.out.println("name="+name+",age="+age);
        return "main";
    }


    @RequestMapping("/four.action")
    public String four(
            @RequestParam("name")
            String uname,
            @RequestParam("age")
            int uage){
        System.out.println("uname="+uname+",uage="+uage);
        return "main";
    }

    @RequestMapping("five.action")
    public String five(HttpServletRequest request){
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println("name="+name+",age="+age);
        return "main";
    }
}
