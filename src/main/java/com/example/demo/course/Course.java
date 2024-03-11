package com.example.demo.course;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Course(String curso) {
        this.name = curso;
    }

    public Course() {
    }

    public static Course convert(CursoDTO cursoDTO) {
        Course course = new Course();
        course.setName(cursoDTO.getName());
        return course;
    }

    public static String cursoToString(Course course) {
        return course.getName();
    }

}
