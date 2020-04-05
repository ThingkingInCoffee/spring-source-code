package com.hzy.demo.test;

import com.hzy.demo.MyComponentScan;
import com.hzy.demo.bean.MyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyComponentScan.class);
		MyBean bean = context.getBean(MyBean.class);
		System.out.println(bean);
	}
}
