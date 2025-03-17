package com.example.springEducation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringEducationApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml"
		);

		Person me = context.getBean("student", Person.class);
		SpringApplication.run(SpringEducationApplication.class, args);
		System.out.println(me);

		WeaponShow weaponShow = context.getBean("weaponShow", WeaponShow.class);
		weaponShow.show();
		context.close();
		context.close();
	}
}
