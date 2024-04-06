package com.example.demo.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInputDto {
    private String id;
    private String firstName;
    private String lastName;
    private String age;
    private String Phone;
}
