package com.nico.test;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertySources");
		getEnvironment().setRequiredProperties("user.name");
	}

	@Override
	public void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowCircularReferences(false);
		super.setAllowBeanDefinitionOverriding(false);
		super.customizeBeanFactory(beanFactory);
//		super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("=======> 扩展实现postProcessBeanFactory方法");
	}
}
