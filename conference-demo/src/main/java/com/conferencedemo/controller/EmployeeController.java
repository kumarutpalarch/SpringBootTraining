package com.conferencedemo.controller;

import com.conferencedemo.model.Employee;
import com.conferencedemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created for training purpose.
 */
@RestController     // for rest response
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // list of all employee
    @RequestMapping(value = "list",method = RequestMethod.GET)   // or use @GetMapping
    public java.util.List<Employee> listEmployee() {
        return employeeService.findAll();
    }
    
	// to add new employee
	@RequestMapping(value = "save",method = RequestMethod.POST) // or user @GetMapping
	public Employee save(Employee employee){ 
	    return employeeService.save(employee); 
	}
	  
	// to update employee
	@RequestMapping(value = "update",method = RequestMethod.POST) // or user @GetMapping 
	public Employee update(Employee employee){ 
	    return employeeService.update(employee); 
	}
	  
	/*
	 * // delete specific employee using employee id
	 * 
	 * @RequestMapping(value = "delete", method = RequestMethod.DELETE) // or
	 * use @DeleteMapping public void delete(@RequestParam("id")String id){
	 * employeeService.delete(id); }
	 */ 
}