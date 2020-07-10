package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @ApiOperation(value = "hello",notes = "notes")
    @RequestMapping("/hello")
    public String hello() throws Exception{
        return "HelloWorld";
    }

    @ApiOperation(value = "hello",notes = "notes")
    @RequestMapping("/hello")
    @ResponseBody
    public String hello2() throws Exception{
        System.out.println("故意产生冲突");
        System.out.println("故意产生冲突1");
        System.out.println("故意产生冲突2");
        System.out.println("故意产生冲突3");
        System.out.println("故意产生冲突4");
        System.out.println("故意产生冲突5");
        return "HelloWorld";
    }
    @ApiOperation(value = "hello",notes = "notes")
    @RequestMapping("/hello")
    @ResponseBody
    public String hello3() throws Exception{
        System.out.println("哈哈");
        return "HelloWorld";
    }
}
