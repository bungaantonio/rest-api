package com.example.demo.student.web;

import com.example.demo.course.Course;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;
import java.util.StringJoiner;

// @Data
public class CreateStudentParameters {
    @NotNull
    @Size(min = 2, max = 1000)
    private String name;

    @NotNull
    private Course course;

    @NotNull
    private Date createdAt;

    @JsonCreator
    public CreateStudentParameters(@JsonProperty("name") String name, @JsonProperty("course") Course course,
            @JsonProperty("createdAt") Date createdAt) {
        this.name = name;
        this.course = course;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public Course getCourse() {
        return course;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CreateStudentParameters.class.getSimpleName() + "[", "]")
                .add(String.format("name=%s", name))
                .add(String.format("course=%s", course))
                .add(String.format("createdAt=%s", createdAt))
                .toString();
    }
}
