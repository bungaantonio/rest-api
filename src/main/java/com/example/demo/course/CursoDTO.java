package com.example.demo.course;

import javax.validation.constraints.NotNull;

public class CursoDTO {

    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static CursoDTO convert(Course curso) {
        CursoDTO cursoDTO = new CursoDTO();
        cursoDTO.setName(curso.getName());
        return cursoDTO;
    }
}
