package com.dxc.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.di.HardDisk;

public class User {

	public static void main(String[] args) {

	
	ApplicationContext factory =new	AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp =	factory.getBean(Employee.class);
		
		System.out.println(emp);
		
		Address addr =				factory.getBean(Address.class);
		
		System.out.println(addr);
		
		
		
			HardDisk hd =			factory.getBean(HardDisk.class);
		
		//HardDisk hd =		(HardDisk)	factory.getBean("hd");
		
		System.out.println(hd);
				
		
		
		
		
		
	}

}
