package com.example.springEducation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@SpringBootApplication
public class SpringEducationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEducationApplication.class, args);

	}
}
