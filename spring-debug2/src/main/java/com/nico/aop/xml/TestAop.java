package com.nico.aop.xml;

import com.nico.aop.xml.service.MyCalculator;
import com.nico.aop.xml.util.LogUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

	public static void main(String[] args) throws NoSuchMethodException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
		MyCalculator bean = ac.getBean(MyCalculator.class);
		System.out.println(bean.toString());
		bean.add(1, 1);

		LogUtil bean2 = ac.getBean(LogUtil.class);
		System.out.println(bean);
	}
}
