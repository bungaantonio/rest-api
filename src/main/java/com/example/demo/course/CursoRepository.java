package com.example.demo.course;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Course, Long> {
    Optional<Course> queryByNameLike(String name);

}
