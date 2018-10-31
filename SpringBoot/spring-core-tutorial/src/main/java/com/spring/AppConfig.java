package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
public class AppConfig 
{
	@Bean
	public String greeting() {
		return "World";
	}
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        String text = (String)context.getBean("greeting");
    	System.out.println( "Hello " +text+"!");
    }
}
