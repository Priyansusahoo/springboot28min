package com.priyansu.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.priyansu.learnspringframework.game.GameRunner;
import com.priyansu.learnspringframework.game.MarioGame;
import com.priyansu.learnspringframework.game.PacManGame;
import com.priyansu.learnspringframework.game.SuperGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1: Launch a Spring Context
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2: Configure the things that we want Spring to manage - @Configuration
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
//		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean(Address.class));
	}

}
