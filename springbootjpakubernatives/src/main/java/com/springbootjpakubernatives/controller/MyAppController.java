package com.springbootjpakubernatives.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjpakubernatives.entity.Employee;
import com.springbootjpakubernatives.service.MyApplicationServiceInterface;

@RestController
public class MyAppController {
	
	@Autowired
	private MyApplicationServiceInterface mService;
	
	@GetMapping("allEmployee")
	public List<Employee> getAllEmployee() {
		return mService.getAllEmployeeService();
	}
	@PostMapping("createProfile")
	public Employee create(@RequestBody Employee emp) {
		return mService.createEmployeeService(emp);
	}
	@PutMapping("editProfile/{uid}")
	public Employee editProfile(@PathVariable("uid") long uid,@RequestBody Employee emp) {
		return mService.editEmployeeService(uid,emp);
	}
	@DeleteMapping("deleteProfile/{uid}")
	public String deleteEmployee(@PathVariable("uid") long uid) {
		return mService.deleteEmployeeService(uid);
	}

}
