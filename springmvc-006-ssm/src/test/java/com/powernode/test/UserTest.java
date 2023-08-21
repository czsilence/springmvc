package com.powernode.test;

import com.powernode.springmvc.pojo.User;
import com.powernode.springmvc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)  //启动spring容器
//需要导入spring的单元测试依赖，才能使用以下注解
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml",
        "classpath:applicationContext_service.xml"})
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSelectUserPage(){
        List<User> list =userService.selectUserPage("三","男",0);
        list.forEach(user -> {
            System.out.println(user);
        });
    }

    @Test
    public void testDeleteUserById(){
        int num = userService.deleteUserById("13526405892");
        System.out.println(num);
    }

    @Test
    public void testGetRowCount(){
        int rowCount = userService.getRowCount(null, "男");
        System.out.println(rowCount);
    }

    @Test
    public void testCreatUser(){
        User user =new User("17785964562","身份证","411526220145217895","小二","男","41","废品回收 ");
        int users = userService.creatUser(user);
        System.out.println(users);
    }

}
