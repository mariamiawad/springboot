package com.javatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
//@ComponentScan(basePackages= {"com.javapoint"})
//@EntityScan("com.javapoint")
//@EnableJpaRepositories("com.javapoint")
public class StudentApplication   {

	public static void main(String... args) {
//		
		SpringApplication.run(StudentApplication.class,args);
	}
	
	
}