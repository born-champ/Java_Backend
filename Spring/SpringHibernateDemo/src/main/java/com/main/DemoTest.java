package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Trainer;
import com.service.TrainerService;

public class DemoTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
		Trainer t1=(Trainer)ac.getBean("trainer");
		t1.setTid(1);
		t1.setTname("Raj");
		t1.setTech("Java");
		TrainerService ts=(TrainerService)ac.getBean("trainerService");
		String res=ts.storeTrainer(t1);
		System.out.println(res);
		
		
		

	}

}
