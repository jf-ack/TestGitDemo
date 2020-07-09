package com.example.demo;

import com.example.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testTime(){
        User user = new User();

        long startTime = System.currentTimeMillis();

        for(long i=0l;i<1000000000l;i++){
            user.getName();
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }


}
