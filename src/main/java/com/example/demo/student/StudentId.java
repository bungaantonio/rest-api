package com.example.demo.student;

import com.example.demo.student.infrastructure.jpa.AbstractLongEntityId;

public class StudentId extends AbstractLongEntityId {

    public StudentId(Long value) {
        super(value);
    }
}
