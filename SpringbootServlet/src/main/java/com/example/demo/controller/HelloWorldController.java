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
        return "HelloWorld";
    }
    @ApiOperation(value = "hello",notes = "notes")
    @RequestMapping("/hello")
    @ResponseBody
    public String hello3() throws Exception{
        return "HelloWorld";
    }
}
