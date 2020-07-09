package com.example.demo.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class listenerDemo implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent){
        System.out.println("初始化");
        System.out.println(servletContextEvent.getServletContext().getServerInfo());
    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent){
        System.out.println("ServletContext销毁");
    }
}
