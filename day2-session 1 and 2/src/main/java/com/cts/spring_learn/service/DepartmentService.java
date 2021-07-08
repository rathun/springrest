package com.cts.spring_learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.spring_learn.dao.DepartmentDao;
import com.cts.spring_learn.model.Department;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;
	
	public List<Department> getAllDepartments()
	{
		return departmentDao.getAllDepartments();
	}
	

}
