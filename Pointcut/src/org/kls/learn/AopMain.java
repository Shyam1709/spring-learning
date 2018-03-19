package org.kls.learn;

import org.kls.learn.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
     ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
     ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
     shapeService.getCircle().setName("Dummy name");
     System.out.print(shapeService.getCircle().getName());
	}

}
