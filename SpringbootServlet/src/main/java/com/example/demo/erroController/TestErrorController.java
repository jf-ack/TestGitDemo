package com.example.demo.erroController;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestErrorController implements ErrorController {
    @Override
    public String getErrorPath() {
        return null;
    }

    @RequestMapping
    public Map<String,Object> handleError(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",404);
        map.put("msg","不存在");
        return map;
    }

    @RequestMapping("/ok")
    public Map<String,Object> noError(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",200);
        map.put("msg","正常，这是测似乎页面");
        return map;
    }

    @RequestMapping(value = "",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String errorHtml404(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        return "404错误，不存在";
    }

    @RequestMapping(value = "",consumes = "application/json;charset=UTF-8",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String,Object> errorjson(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("code",40334);
        map.put("msg","不存在");
        return map;
    }
}
