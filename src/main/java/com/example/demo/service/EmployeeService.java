package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> searchAllEmployee(Employee employee);
    Employee searchByIdEmployee(String id);
    Employee UpdateEmployee(String id , Employee employee);
    void deleteByIdEmployee(String id);

}
