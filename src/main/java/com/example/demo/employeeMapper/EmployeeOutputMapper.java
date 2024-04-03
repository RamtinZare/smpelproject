//package com.example.demo.employeeMapper;
//
//import com.example.demo.dto.Employee.EmployeeDto;
//import com.example.demo.entity.Employee;
//
//    public class EmployeeOutputMapper {
//        EmployeeDto employeeDto=new EmployeeDto();
//        public static EmployeeDto mapToEmployee(Employee employee)
//        {
//            return new EmployeeDto(
//                employee.getEmployeeId(),
//                employee.getEmployeeFirstName(),
//                employee.getEmployeeLastName(),
//                employee.getEmployeeEmail(),
//                employee.getEmployeeAge()
//            );
//        }
//        public static Employee mapToDto(EmployeeDto employeeDto)
//        {
//            return new Employee(
//                    employeeDto.getEmployeeId(),
//                    employeeDto.getEmployeeFirstName(),
//                    employeeDto.getEmployeeLastName(),
//                    employeeDto.getEmployeeEmail(),
//                    employeeDto.getEmployeeAge()
//            );
//        }
//    }
