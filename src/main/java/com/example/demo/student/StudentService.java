package com.example.demo.student;

import com.example.demo.course.Course;

import java.util.Date;

public interface StudentService {
    Student createStudent(String name, Course course, Date createdAt);
}
