package com.nico.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nico.selftag")
public class MyComponentScan {

	@ComponentScan("com.nico.selftag")
	@Configuration
	class InnerClass {

	}
}
