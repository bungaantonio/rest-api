package com.example.demo.student;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(StudentId studentId) {
        super(String.format("Could not find user with id %s", studentId.asString()));
    }
}
