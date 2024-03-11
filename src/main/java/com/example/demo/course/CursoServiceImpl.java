package com.example.demo.course;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


@Service
public class CursoServiceImpl implements CursoService {

    private final CursoRepository repository;

    public CursoServiceImpl(CursoRepository repository) {
        this.repository = repository;
    }

    @Override
    public CursoDTO save(CursoDTO cursoDTO) {
        Course course = repository.save(Course.convert(cursoDTO));
        return CursoDTO.convert(course);
    }

    @Override
    public List<CursoDTO> getCursos() {
        List<Course> courses = repository.findAll();
        return courses
                .stream()
                .map(CursoDTO::convert)
                .collect(Collectors.toList());
    }

}
