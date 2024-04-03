package com.example.demo.dto.employeeInputDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInputDto {

        private String employeeId;
        private String employeeFirstName;
        private String employeeLastName;
        private String employeeEmail;
        private int employeeAge;
}
