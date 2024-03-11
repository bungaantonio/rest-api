package com.example.demo.student.web;

import com.example.demo.student.Student;
import com.example.demo.student.StudentDTO;
import com.example.demo.student.StudentId;
import com.example.demo.student.StudentService;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentRestController {

    private final StudentService service;

    public StudentRestController(StudentService service) {
        this.service = service;
    }

    @GetMapping("{id}")
    public StudentDTO getStudentInfo(@PathVariable("id") StudentId studentId) {
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public StudentDTO createStudent(@Valid @RequestBody CreateStudentParameters parameters) {
        Student student = service.createStudent(parameters.getName(),
                parameters.getCourse(),
                parameters.getCreatedAt());
        return StudentDTO.fromStudent(student);
    }
}
