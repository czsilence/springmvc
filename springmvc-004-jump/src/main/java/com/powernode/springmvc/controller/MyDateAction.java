package com.powernode.springmvc.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class MyDateAction {

    SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd ");
   /* @RequestMapping("/mydate.action")
    public String date(
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            Date mydate){
        System.out.println(sf.format(mydate));
        return "show";
    }*/



    //注册一个全局日期的处理注解
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        dataBinder.registerCustomEditor(Date.class,new CustomDateEditor(sf,true));
    }
    @RequestMapping("/mydate.action")
    public String date(Date mydate){
        System.out.println(sf.format(mydate));
        return "show";
    }

}
