package com.core.configuration.componentscan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.core.configuration.componentscan")
public class configuration 
{
	@Bean
	public user userbean()
	{
		user user1 = new user();
		return user1;
	}
	
}
