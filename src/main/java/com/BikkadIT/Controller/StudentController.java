package com.BikkadIT.Controller;

import com.BikkadIT.Service.StudentService;

public class StudentController {
	
	public void control()
	{
		System.out.println("Controller class method");
		StudentService stuservice = new StudentService();
		stuservice.serviceMethod();
		
	}

}
