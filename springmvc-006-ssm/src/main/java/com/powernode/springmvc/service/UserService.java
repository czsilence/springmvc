package com.powernode.springmvc.service;

import com.powernode.springmvc.pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectUserPage(String userName,String userSex,int startRow);


    /**
     *增加
     **/
    int creatUser(User user);

    /**
     *删除
     **/
    int deleteUserById(String userId);

    /**
     *计算总行数
     **/
    int getRowCount(String userName,String userSex);
}
