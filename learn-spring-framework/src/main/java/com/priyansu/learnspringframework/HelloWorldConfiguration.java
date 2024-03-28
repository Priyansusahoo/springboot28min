package com.priyansu.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author Priyansu Sahoo
 */
record Person (String name, int age) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Priyansu";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	
	@Bean(name = "person1")
	public Person person() {
		return new Person("Thanos", 21);
	}
	
	@Bean(name="address2")
	public Address address() {
		return new Address("Old Town", "Bhubaneswar");
	}
}
