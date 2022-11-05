package com.constself.usercenter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;

@SpringBootTest
class UserCenterApplicationTests {
    @Test
    void md5(){
        String newPassword = DigestUtils.md5DigestAsHex(("G1ren"+"myaposs").getBytes());
        System.out.println(newPassword);
    }

    @Test
    void contextLoads() {
    }

}
