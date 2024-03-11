package com.example.demo.student;

import com.example.demo.course.Course;
import com.example.demo.student.infrastructure.jpa.Entity;

import javax.persistence.*;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

@javax.persistence.Entity
public class Student implements Entity<StudentId> {

    @Embedded
    @GenericGenerator(name = "assigned-sequence", strategy = "com.example.demo.student.StudentIdIdentifierGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.CONFIG_SEQUENCE_PER_ENTITY_SUFFIX, value = "true"),

            @Parameter(name = SequenceStyleGenerator.CONFIG_SEQUENCE_PER_ENTITY_SUFFIX, value = "_SEQUENCE") })

    @GeneratedValue(generator = "assigned-sequence", strategy = GenerationType.SEQUENCE)
    private StudentId id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private Course course;

    private Date createdAt;

    public Student(String name, Course course, Date createdAt) {
        this.name = name;
        this.course = course;
        this.createdAt = createdAt;
    }

    public static Student createStudent(String name,
            Course course,
            Date createdAt) {
        return new Student(name, course, createdAt);
    }

    public StudentId getId() {
        return id;
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

}
