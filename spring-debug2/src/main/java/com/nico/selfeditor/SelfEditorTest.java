package com.nico.selfeditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelfEditorTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("selfEditor.xml");
		Customer bean = ac.getBean(Customer.class);
		System.out.println(bean);
	}
}
