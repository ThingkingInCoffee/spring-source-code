package com.hzy.demo.test;

import com.hzy.demo.bean.ClassPathBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		ClassPathBean  classPathBean = (ClassPathBean)applicationContext.getBean("classPathBean");
		System.out.println(classPathBean.getName());
	}
}
