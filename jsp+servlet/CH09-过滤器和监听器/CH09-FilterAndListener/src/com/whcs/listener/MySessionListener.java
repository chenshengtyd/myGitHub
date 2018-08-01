package com.whcs.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
@WebListener
public class MySessionListener implements HttpSessionIdListener, HttpSessionListener {

    public MySessionListener() {
    	System.out.println("这是我的Session监听器初始化方法");
    }

    public void sessionCreated(HttpSessionEvent arg0)  { 
    	System.out.println("this is create method");
    }

    public void sessionIdChanged(HttpSessionEvent arg0, String arg1)  { 
    	System.out.println("this is change method");
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("this is destory method");
    }
	
}
