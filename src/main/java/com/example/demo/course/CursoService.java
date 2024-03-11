package com.example.demo.course;

import java.util.List;

public interface CursoService {
    CursoDTO save(CursoDTO cursoDTO);

    List<CursoDTO> getCursos();

}
