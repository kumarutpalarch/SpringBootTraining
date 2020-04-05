package com.conferencedemo.repository;

import com.conferencedemo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created for training purpose.
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {

    @Override
    List<Employee> findAll();           // find all Employee
	
	//@Query(value = "{ 'employeeName' : ?0 }") 
	//List<Employee> findByEmployeeName(String name); // find employee by name
	  
	//Employee findByEmployeeId(String id); // find
	  
	//void delete(String s); // delete by ID
	  
	//String findOne(String employeeId);
	 
}