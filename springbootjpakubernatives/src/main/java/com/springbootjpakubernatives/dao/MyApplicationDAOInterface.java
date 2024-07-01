package com.springbootjpakubernatives.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootjpakubernatives.entity.Employee;

@Repository
public interface MyApplicationDAOInterface extends JpaRepository<Employee, Long>{

}
