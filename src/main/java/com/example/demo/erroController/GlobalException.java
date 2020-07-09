package com.example.demo.erroController;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GlobalException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        if (e instanceof NullPointerException) {
            mv.setViewName("error1");
        } else if (e instanceof ArithmeticException) {
            mv.setViewName("error2");
        }
        mv.addObject("error", e.toString());
        return mv;
    }
}
