package com.powernode.springmvc.service.impl;

import com.powernode.springmvc.mapper.UserMapper;
import com.powernode.springmvc.pojo.User;
import com.powernode.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserPage(String userName, String userSex, int startRow) {

        return userMapper.selectUserPage(userName,userSex,startRow);
    }

    @Override
    public int creatUser(User user) {
        return userMapper.creatUser(user);
    }

    @Override
    public int deleteUserById(String userId) {
        return userMapper.deleteUserById(userId);
    }

    @Override
    public int getRowCount(String userName, String userSex) {

        return userMapper.getRowCount(userName,userSex);
    }
}
