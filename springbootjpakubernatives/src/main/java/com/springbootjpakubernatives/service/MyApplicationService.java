package com.springbootjpakubernatives.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springbootjpakubernatives.dao.MyApplicationDAOInterface;
import com.springbootjpakubernatives.entity.Employee;

@Service
@Transactional
public class MyApplicationService implements MyApplicationServiceInterface{
	
	@Autowired
	private MyApplicationDAOInterface mdao;

	@Override
	public List<Employee> getAllEmployeeService() {
		// TODO Auto-generated method stub
		return mdao.findAll();
	}

	@Override
	public Employee createEmployeeService(Employee emp) {
		// TODO Auto-generated method stub
		return mdao.save(emp);
	}

	@Override
	public Employee editEmployeeService(long uid, Employee emp) {
		emp.setEmpid(uid);
		// TODO Auto-generated method stub
		return mdao.saveAndFlush(emp);
	}

	@Override
	public String deleteEmployeeService(long uid) {
		// TODO Auto-generated method stub
		mdao.deleteById(uid);
		return "deleted";
	}

}
