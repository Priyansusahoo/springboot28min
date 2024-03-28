package com.priyansu.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.priyansu.learnspringframework.game.GameRunner;
import com.priyansu.learnspringframework.game.MarioGame;
import com.priyansu.learnspringframework.game.PacManGame;
import com.priyansu.learnspringframework.game.SuperGame;
/**
 * @author Priyansu Sahoo
 */
public class App02HelloWorldSpring {

	public static void main(String[] args) {
		/*
		1: Launch a Spring Context
		2: Configure the things that we want Spring to manage - @Configuration
		*/
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person1"));
		System.out.println(context.getBean("address2")); // 1
		/*
		* 1 & 2 are same as "address2" cause there is only one method of "Address" type.
		*/
		System.out.println(context.getBean(Address.class)); // 2
	}

}
