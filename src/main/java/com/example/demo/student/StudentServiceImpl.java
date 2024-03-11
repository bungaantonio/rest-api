package com.example.demo.student;

import com.example.demo.course.Course;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student createStudent(String name, Course course, Date createdAt) {
        Student student = Student.createStudent(name, course, createdAt);
        return repository.save(student);
    }
}
