package com.cortez.thymeleaf.crud_thymeleaf.services;

import java.util.List;

import com.cortez.thymeleaf.crud_thymeleaf.entities.Estudiante;

public interface EstudianteService {
    public List<Estudiante> listarTodosLosEstudiantes();
    public Estudiante guardarEstudiante(Estudiante estudiante);
    public Estudiante obtenerEstudiantePorId(Long id);
    public Estudiante actualizarEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(Long id);

}
