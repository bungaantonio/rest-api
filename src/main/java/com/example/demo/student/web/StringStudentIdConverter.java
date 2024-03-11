package com.example.demo.student.web;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.student.StudentId;

@Component
public class StringStudentIdConverter implements Converter<String, StudentId> {

    @Override
    public StudentId convert(String s) {
        return new StudentId(Long.parseLong(s));
    }

}
