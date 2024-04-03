package com.example.demo.controller;

import com.example.demo.adapter.EmployeeAdapter;
import com.example.demo.dto.employeeInputDto.EmployeeInputDto;
import com.example.demo.dto.employeeOutputDto.EmployeeOutputDto;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class EmployeeController {
    private final EmployeeService employeeService;
    private final EmployeeAdapter employeeAdapter;

    public EmployeeController(EmployeeAdapter employeeAdapter, EmployeeService employeeService) {
        this.employeeAdapter = employeeAdapter;
        this.employeeService = employeeService;
    }
    @PostMapping("/create")
    public ResponseEntity<EmployeeOutputDto> createEmployee(@RequestBody EmployeeInputDto employeeInputDto)
    {
        Employee employee = employeeAdapter.mapInputToEmployee(employeeInputDto);
        Employee employee1 = employeeService.createEmployee(employee);
        return new ResponseEntity<>(employeeAdapter.mapEmployeeToEmployeeOutputDto(employee1),HttpStatus.OK);
    }
    @GetMapping("/searchAll")
    public ResponseEntity<List<Employee>> SearchAll(EmployeeInputDto employeeInputDto)
    {
        Employee employee = employeeAdapter.mapInputToEmployee(employeeInputDto);
        List<Employee> employee1=employeeService.searchAllEmployee(employee);
        return new ResponseEntity<>(employee1,HttpStatus.OK);
    }
    @GetMapping("/searchById/{id}")
    public ResponseEntity<EmployeeOutputDto> searchById (@PathVariable("id") String id)
    {
        //Employee employee = employeeAdapter.mapTOEmployee(employeeDto);
        Employee employee1 = employeeService.searchByIdEmployee(id);
        EmployeeOutputDto employee = employeeAdapter.mapEmployeeToEmployeeOutputDto(employee1);
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeOutputDto> updateEmployee(@RequestBody EmployeeInputDto employeeInputDto ,@PathVariable("id") String id)
    {
        Employee employee1 =employeeAdapter.mapInputToEmployee(employeeInputDto);
        Employee employee=employeeService.UpdateEmployee(id,employee1);
        EmployeeOutputDto employee2= employeeAdapter.mapEmployeeToEmployeeOutputDto(employee);
        return new ResponseEntity<>(employee2,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") String id)
    {
        employeeService.deleteByIdEmployee(id);
    }
}
