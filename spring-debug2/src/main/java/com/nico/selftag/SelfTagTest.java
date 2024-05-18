package com.nico.selftag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelfTagTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("selftag.xml");
		User user = (User) ac.getBean("msb");
		System.out.println(user.getEmail());
	}
}
