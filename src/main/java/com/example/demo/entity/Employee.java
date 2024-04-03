package com.example.demo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("Employee")
public class Employee {
    @Id
    private String employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeEmail;
    private int employeeAge;

}
