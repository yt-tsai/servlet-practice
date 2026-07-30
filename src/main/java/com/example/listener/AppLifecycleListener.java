package com.example.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppLifecycleListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("Application Started");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("Application Stopped");
    }

}