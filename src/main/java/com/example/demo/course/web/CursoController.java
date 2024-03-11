package com.example.demo.course.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.course.CursoDTO;
import com.example.demo.course.CursoServiceImpl;

import javax.validation.Valid;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoServiceImpl service;

    public CursoController(CursoServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/curso")
    public List<CursoDTO> getCursos() {
        List<CursoDTO> list = service.getCursos();
        return list;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public CursoDTO newAluno(@Valid @RequestBody CursoDTO formData) {
        return service.save(formData);
    }

}
