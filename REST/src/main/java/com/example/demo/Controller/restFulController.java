package com.example.demo.Controller;

import com.example.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class restFulController {

    /**
     *接收前端传来的url中用/testREST/testValue
     *接收的值是基本数据类型和String类型时，使用@PathVariable注解
     * 注解@RequestMapping形参中的{}内的内容是占位符，用来替换前端传来的数据，占位符的名字随便都行但是
     * 要和@RequestMapping注解的形参的{}内的占位符一样，个数和前端传来的数据个数一致。
     */
    @RequestMapping("/testREST/{testVa}")
    public String test1(@PathVariable("testVa") String testV){
        System.out.println(testV);
        return "success";
    }

    @Test
    public void TestDemo(){
        test1("jf");
    }

    /**
     *不需要@PathVariable注解
     */
    @RequestMapping(value = "/testREST", method = RequestMethod.POST)
    public String test2(User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping(value = "/testREST", method = RequestMethod.PUT)
    public String test3(){
        System.out.println("PUT");
        return "success";
    }

    @RequestMapping(value = "/testREST", method = RequestMethod.DELETE)
    public String test4(){
        log.info("DELETE");
        return "success";
    }


}
