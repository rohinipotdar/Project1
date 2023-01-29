package com.BikkadIT.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.BikkadIT.Controller.StudentController;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiApplication.class, args);
		
		StudentController stu = new StudentController();
		stu.control();
	}

}
