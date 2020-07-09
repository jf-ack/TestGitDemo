package com.example.demo.erroController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowErroConroller {

    @RequestMapping("/show1")
    public ModelAndView showNullPointerException(){
        String str = null;
        str.length();
        System.out.println("******");
        return new ModelAndView();
    }

    @RequestMapping("/show2")
    public ModelAndView showArithmeticException(){
        int a = 10 / 0;
        return new ModelAndView();
    }


    /**
     *处理方式一：@ExceptionHandler
     * 优势：具有特殊性，针对性强。
     * 劣势：只对当前Controller的异常有效，全局无效
     */
    @ExceptionHandler(value = {NullPointerException.class})
    public ModelAndView nullPointerException(Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("error", e.toString());
        mv.setViewName("error1");
        return mv;
    }

    @ExceptionHandler(value = {ArithmeticException.class})
    public ModelAndView arithmeticException(Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("error", e.toString());
        mv.setViewName("error2");
        return mv;
    }
}
