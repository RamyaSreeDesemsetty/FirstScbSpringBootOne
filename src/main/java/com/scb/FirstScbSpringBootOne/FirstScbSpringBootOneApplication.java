package com.scb.FirstScbSpringBootOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.controller.MyTutorials;

@SpringBootApplication
// @PropertySource(value = {"classpath:new.properties"})

@ComponentScan(basePackages = "com.springboot.controller")
public class FirstScbSpringBootOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstScbSpringBootOneApplication.class, "Ramya");
		MyTutorials mybean = context.getBean(MyTutorials.class);
		System.out.println(mybean);
	}
	/*
	 * @Bean public Mayatutorials getTutorials() { return new Mayatutorials(); }
	 */

}
