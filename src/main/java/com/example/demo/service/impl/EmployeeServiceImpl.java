package com.example.demo.service.impl;

import com.example.demo.entity.Employee;
import com.example.demo.exeption.EmployeeExeption;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return employee1;
    }

    @Override
    public List<Employee> searchAllEmployee(Employee employee) {
         List<Employee> employee1=employeeRepository.findAll();
        return employee1;
    }

    @Override
    public Employee searchByIdEmployee(String id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() ->new EmployeeExeption.Exeption("not found id"+id));
        return employee;
    }

    @Override
    public Employee UpdateEmployee(String id, Employee employee) {
        Employee employee2 = employeeRepository.findById(id).orElseThrow(() ->new EmployeeExeption.Exeption("not found id"+id));
        employee2.setEmployeeId(employee.getEmployeeId());
        employee2.setEmployeeFirstName(employee.getEmployeeFirstName());
        employee2.setEmployeeLastName(employee.getEmployeeLastName());
        employee2.setEmployeeEmail(employee.getEmployeeEmail());
        employee2.setEmployeeAge(employee.getEmployeeAge());
        return employee2;
    }

    @Override
    public void deleteByIdEmployee(String id) {
        Employee entity = employeeRepository.findById(id).orElseThrow(()-> new EmployeeExeption.Exeption("id not found"+id));
    }
}
