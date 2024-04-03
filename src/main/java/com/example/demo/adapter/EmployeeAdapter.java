package com.example.demo.adapter;

import com.example.demo.dto.employeeInputDto.EmployeeInputDto;
import com.example.demo.dto.employeeOutputDto.EmployeeOutputDto;
import com.example.demo.dto.employeeOutputDto.EmployeeOutputDto;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Component;

@Component
public class EmployeeAdapter {
            private final EmployeeService employeeService;

        public EmployeeAdapter(EmployeeService employeeService) {
            this.employeeService = employeeService;
        }

        public EmployeeOutputDto creatEmployee (EmployeeInputDto employeeInputDto)
        {
            Employee employee = mapInputToEmployee(employeeInputDto);
            Employee createEmployee = employeeService.createEmployee(employee);
            return mapEmployeeToEmployeeOutputDto(createEmployee);
        }


        public EmployeeOutputDto mapEmployeeToEmployeeOutputDto (Employee employee)
            {
                EmployeeOutputDto employeeDto = new EmployeeOutputDto();
                employeeDto.setEmployeeId(employee.getEmployeeId());
                employeeDto.setEmployeeFirstName(employee.getEmployeeFirstName());
                employeeDto.setEmployeeLastName(employee.getEmployeeLastName());
                employeeDto.setEmployeeAge(employee.getEmployeeAge());
                employeeDto.setEmployeeEmail(employee.getEmployeeEmail());
                return employeeDto;
            };
            public Employee mapInputToEmployee(EmployeeInputDto employeeInputDto)
            {
                Employee employee=new Employee();
                employee.setEmployeeId(employeeInputDto.getEmployeeId());
                employee.setEmployeeFirstName(employeeInputDto.getEmployeeFirstName());
                employee.setEmployeeLastName(employeeInputDto.getEmployeeLastName());
                employee.setEmployeeAge(employeeInputDto.getEmployeeAge());
                employee.setEmployeeEmail(employeeInputDto.getEmployeeEmail());
                return employee;
            }

    }
