package com.example.demo.dto.employeeOutputDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeOutputDto {
    private String employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeEmail;
    private int employeeAge;
}
