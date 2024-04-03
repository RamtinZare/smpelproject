package com.example.demo.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class EmployeeExeption {

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public static class Exeption extends RuntimeException
    {
        public Exeption(String massage)
        {
            super(massage);
        }
    }
}
