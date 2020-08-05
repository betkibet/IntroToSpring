package com.clc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Members {

	public static void main(String[] args) {
//		Resource r = new ClassPathResource("spring.xml");
//		BeanFactory factory = new XmlBeanFactory(r);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Hello h = (Hello) context.getBean("hello");
		Hello h1 = (Hello) context.getBean("hello");
		Hello h2 = (Hello) context.getBean("hello");
		h.sayHello();
		System.out.println(h==h1);

	}

}
