package com.sathish.tutorials.springboot;

import javax.servlet.ServletContextListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.sathish.tutorials.springboot.listner.AppContextListener;
import com.sathish.tutorials.springboot.servlet.AppServlet;
/**
 * 
 * @author KARIYSA
 *
 */
@SpringBootApplication
public class WebAppStatupListenerApplication {
	
	 // Register ServletContextListener
	  @Bean
	  public ServletListenerRegistrationBean<ServletContextListener> listenerRegistrationBean() {
	    ServletListenerRegistrationBean<ServletContextListener> bean = 
	        new ServletListenerRegistrationBean<>();
	    bean.setListener(new AppContextListener());
	    System.out.println("************************Register ServletContextListener ***********************!");
	    return bean;

	  }

	  // Register Servlet
	  @Bean
	  public ServletRegistrationBean servletRegistrationBean() {
	    ServletRegistrationBean bean = new ServletRegistrationBean(
	        new AppServlet(), "/appServlet");
	    return bean;
	  }
	public static void main(String[] args) {		
		SpringApplication.run(WebAppStatupListenerApplication.class, args);
	}
}
