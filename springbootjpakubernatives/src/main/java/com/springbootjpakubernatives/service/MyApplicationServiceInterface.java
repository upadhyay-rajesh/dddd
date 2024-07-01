package com.springbootjpakubernatives.service;

import java.util.List;

import com.springbootjpakubernatives.entity.Employee;

public interface MyApplicationServiceInterface {

	List<Employee> getAllEmployeeService();

	Employee createEmployeeService(Employee emp);

	Employee editEmployeeService(long uid, Employee emp);

	String deleteEmployeeService(long uid);

}
