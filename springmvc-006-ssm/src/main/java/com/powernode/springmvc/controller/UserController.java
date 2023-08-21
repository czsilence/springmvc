package com.powernode.springmvc.controller;

import com.powernode.springmvc.pojo.User;
import com.powernode.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin    //在服务器端支持跨域访问
@RestController     //如果本类中全是ajax请求，则使用此注解，方法上的 @ResponseBody可以不写
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    public static final int PAGE_SIZE=5;

    @RequestMapping("/selectUserPage")
   /* @ResponseBody   */  /*使用Ajax请求就需要用该注释*/
    public List<User> selectUserPage(String userName,String userSex,Integer page){
        //根据页码计算起始行
        int startRow=0;
        if (page!=null) {
            startRow=(page-1)*PAGE_SIZE;
        }
        return userService.selectUserPage(userName,userSex,startRow);
    }

    @RequestMapping("/getRowCount")
   /* @ResponseBody*/
    public int getRowCount(String userName,String userSex){
        return userService.getRowCount(userName,userSex);
    }

    @RequestMapping("/deleteUserById")
    /*@ResponseBody*/
    public int deleteUserById(String userId){
        return userService.deleteUserById(userId);
    }

    @RequestMapping("/creatUser")
   /* @ResponseBody*/
    public int creatUser(User user){
        String userId=System.currentTimeMillis()+"";
        user.setUserId(userId);
        return userService.creatUser(user);
    }
}
