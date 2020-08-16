package com.kandpal.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.kandpal.SpringAnno")
public class AppConfig {
	
	
// Bean tags are replacement for .xml based tags as a annotation based tag
	
//	@Bean
//	public Samsung getPhone() {
//		
//		return new Samsung();
//		
//	}
//	
//	
//	@Bean
//	public MobileProcessor getProcessor() {
//		
//		return new Snapdragon();
//	
//	}
	

}
