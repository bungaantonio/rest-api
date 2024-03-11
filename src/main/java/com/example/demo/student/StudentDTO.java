package com.example.demo.student;

import com.example.demo.course.Course;
import lombok.Value;

import java.util.Date;

@Value
public class StudentDTO {
    private final StudentId id;
    private final String name;
    private final Course course;
    private final Date createdAt;

    public static StudentDTO fromStudent(Student student) {
        return new StudentDTO(student.getId(),
                student.getName(),
                student.getCourse(),
                student.getCreatedAt()
        );
    }
}
