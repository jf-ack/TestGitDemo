package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @ApiOperation(value = "hello",notes = "notes")
    @RequestMapping("/hello")
    public String hello() throws Exception{
        return "HelloWorld";
    }
}
