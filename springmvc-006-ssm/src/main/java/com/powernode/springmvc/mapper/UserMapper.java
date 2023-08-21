package com.powernode.springmvc.mapper;

import com.powernode.springmvc.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     *url  /user/selectUserPage?username=z&userSex=男&page=null
     * 参数
     *      username:表单中用户名称
     *      userSex：表单中用户姓名
     *      page:提交的页码（第一次访问为null）
     *     结果  有数据时:
     *     [{
     *     "userId":"1447859645",
     *     "cardType":"身份证"","
     *     ...
     *     ...
     *     ..},{...}]
     *      无参数时：
     *      []
     *
     *      分页公式：limit (当前页码-1)*每页条数，每页条数
     **/

    List<User> selectUserPage(
            @Param("username")
            String username,
            @Param("userSex")
            String userSex,
            @Param("startRow")  //算好的起始行的值
            int startRow);

    /**
     *增加
     **/
    int creatUser(User user);

    /**
     *删除
     **/
    int deleteUserById(String userId);

    /**
     *获取总行数
     **/
    int getRowCount(
            @Param("username")
            String username,
            @Param("userSex")
            String userSex);

}
