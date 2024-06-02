package com.nico.shouldSkip;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// 获取ioc使用的beanFactory
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		// 获取类加载器
		ClassLoader classLoader = context.getClassLoader();
		// 获取当前环境信息
		Environment environment = context.getEnvironment();
		// 获取bean定义的注册类
		BeanDefinitionRegistry registry = context.getRegistry();
		// 获得当前系统名
		String property = environment.getProperty("os.name");
		// 包含Windows则说明是Windows系统，返回true
		if (property.contains("Windows")) {
			return true;
		}
		return false;
	}
}
