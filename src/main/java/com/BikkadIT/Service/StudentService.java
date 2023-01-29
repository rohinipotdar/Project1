package com.BikkadIT.Service;

import com.BikkadIT.Dao.StudentDao;

public class StudentService {
	
	public void serviceMethod()
	{
		System.out.println("SErvice class method");
		
		StudentDao studDao = new StudentDao();
		studDao.Daolayer();
		
	}

}
