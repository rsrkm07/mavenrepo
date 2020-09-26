package com.dxc.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.di.HardDisk;
import com.di.KingstonHD;
import com.di.SamsungHD;

@Configuration
public class AppConfig {
	
	
	
	@Bean("hd")
	//@Primary
	public HardDisk getHD1() {
	  
	  
	  
	  return new SamsungHD();
	  
	  
	  }
	 	
	@Bean
	public HardDisk    getHD2() {
		
		
		
		return new KingstonHD();
		
		
	}
	
	
	
	
	
	
	
	
	
	  @Bean public Employee getEmp() {
	  
	  
	  return new Employee();
	  
	  
	  }
	  
	  @Bean public Address getAddr() {
	  
	  return new Address();
	  
	  }
	 
	

}
