package com.conferencedemo.service;

import com.conferencedemo.model.Employee;

import java.util.List;

/**
 * Created for training purpose.
 */

public interface EmployeeService {
    List<Employee> findAll();
    Employee save(Employee employee);
    //void delete(String employeeId);
    Employee update(Employee employee);
}
