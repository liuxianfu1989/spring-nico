package com.nico.shouldSkip;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Conditional({MacCondition.class})
@Configuration
public class BeanConfig {

	@Bean(name = "apple")
	public Person person1() {
		return new Person("Apple", 55);
	}

	@Conditional({LinuxCondition.class})
	@Bean("linus")
	public Person person2() {
		return new Person("Linus", 48);
	}

	@Conditional({WindowsCondition.class})
	@Bean("bill")
	public Person person3() {
		return new Person("Bill Gates", 62);
	}
}
