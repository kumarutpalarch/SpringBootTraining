package com.conferencedemo.service;

import com.conferencedemo.repository.EmployeeRepository;
import com.conferencedemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created for training purpose.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

	@Override 
	public Employee save(Employee employee) { 
		return employeeRepository.save(employee); 
	}
	  	  
	@Override 
	public Employee update(Employee employee) { 
		return employeeRepository.save(employee); 
	}
	
	/*
	 * @Override public void delete(String employeeId) {
	 * employeeRepository.delete(employeeRepository.findOne(employeeId)); }
	 */

	 
}