package com.powernode.springmvc.controller;

import com.powernode.springmvc.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class DataAction {
    @RequestMapping("/data.action")
    public String data(HttpServletRequest request,
                       HttpServletResponse response,
                       HttpSession session,
                       Model model,
                       Map map,
                       ModelMap modelMap){

        //做一个数据，传到main.jsp页面
        Users users =new Users("张三",22);

        //传递数据
        request.setAttribute("requestUsers",users);
        session.setAttribute("sessionUsers",users);
        model.addAttribute("modelUsers",users);
        map.put("mapUsers",users);
        modelMap.addAttribute("modelMapUsers",users);

       // return "main"; //转发方式跳转

        return "redirect:/admin/main.jsp"; //重定向跳转，只有Httpsession的数据存在，其他都不存在
    }
}
