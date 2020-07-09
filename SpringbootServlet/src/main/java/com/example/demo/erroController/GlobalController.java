package com.example.demo.erroController;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalController {

    /**
     * 方式二：
     *优势：可管控全局异常的抛出跳转。
     *劣势：代码冗长，重复代码过多，对每一种异常都需要一个方法来捕获处理
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
