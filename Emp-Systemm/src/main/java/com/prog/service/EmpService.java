package com.prog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.entity.Employee;
import com.prog.repository.EmpRepo;

@Service
public class EmpService 
{
	@Autowired
	private EmpRepo repo;
	public void addEmp(Employee e)
	{
		repo.save(e);
	}
}
