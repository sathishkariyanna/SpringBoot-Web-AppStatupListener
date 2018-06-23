package com.sathish.tutorials.springboot.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 * 
 * @author KARIYSA
 * @date 2018/06/22 This AppContextListener Class implements
 *       ServletContextListener, so ServletContextListener should be registered
 *       before we can use we can register using @Bean (refer
 *       WebAppStatupListenerApplication), @WebListener or in adding listener in
 *       web.xml
 */
public class AppContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		// TODO Auto-generated method stub
		System.out.println("************************Starting up****************!");
		System.out.println("****************Timer tasks or other initializer class goes here*******!");

	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		// TODO Auto-generated method stub
		System.out.println("************************Shutting down************************!");

	}
}