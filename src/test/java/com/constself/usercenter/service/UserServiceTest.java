package com.constself.usercenter.service;


import com.constself.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


/**
 * 用户服务测试
 *
 * @author:G1ren
 */
@SpringBootTest
class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    void testAddUser() {
        User user = new User();
        user.setUsername("G1ren");
        user.setUserAccount("123");
        user.setAvatarUrl("https://plugins.jetbrains.com/files/10119/236224/icon/pluginIcon.svg");
        user.setGender(0);
        user.setUserPassword("12345678");
        user.setPhone("45677");
        user.setEmail("865");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertEquals(true, result);
    }


    @Test
    void userRegister() {
//        String userAccount = "constself";
//        String userPassword = "";
//        String checkPassword = "123456";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword );
//        Assertions.assertEquals(-1, result);
//        userAccount = "co";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        userAccount = "constself";
//        userPassword = "123456";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        userAccount = "const self";
//        userPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        checkPassword = "123456789";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        userAccount = "dogconstself";
//        checkPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        userAccount = "constself";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        String username = "张三";
        String userAccount = "constself";
        String userPassword = "12345678";
        String checkPassword = "12345678";
        String avatarUrl = "https://plugins.jetbrains.com/files/10119/236224/icon/pluginIcon.svg";
        String phone = "456156551";
        String email = "156165@qq.com";

//        userService.userRegister(userAccount, userPassword, checkPassword);
//        username = "李四";
//        userAccount = "fain";
//        userPassword = "87654321";
//        checkPassword = "87654321";
//        userService.userRegister(username, userAccount, userPassword, checkPassword);


//            String userAccount = "constself";
//            String userPassword = "";
//            String checkPassword = "123456";
//            long result = userService.userRegister(userAccount, userPassword, checkPassword);
//            Assertions.assertEquals(-1, result);
//            userAccount = "const";
//            result = userService.userRegister(userAccount, userPassword, checkPassword);
//            Assertions.assertEquals(-1, result);
//            userAccount = "constself";
//            userPassword = "123456";
//            result = userService.userRegister(userAccount, userPassword, checkPassword);
//            Assertions.assertEquals(-1, result);
//            userAccount = "const self";
//            userPassword = "12345678";
//            result = userService.userRegister(userAccount, userPassword, checkPassword);
//            Assertions.assertEquals(-1, result);
//            userAccount = "G1ren";
//            userPassword = "12345678";
//            result = userService.userRegister(userAccount, userPassword, checkPassword);
//            Assertions.assertEquals(-1, result);
//            userAccount = "constself";
//            result = userService.userRegister(userAccount, userPassword, checkPassword);
//            Assertions.assertEquals(-1, result);


    }
}