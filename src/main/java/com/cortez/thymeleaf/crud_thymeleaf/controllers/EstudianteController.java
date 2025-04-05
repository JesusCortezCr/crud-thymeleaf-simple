package com.cortez.thymeleaf.crud_thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cortez.thymeleaf.crud_thymeleaf.entities.Estudiante;
import com.cortez.thymeleaf.crud_thymeleaf.services.EstudianteService;

@Controller
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @GetMapping({ "/estudiantes", "/" })
    public String listarEstudiantes(Model modelo) {
        modelo.addAttribute("estudiantes", service.listarTodosLosEstudiantes());
        return "estudiantes";
    }

    @GetMapping("/estudiantes/nuevo")
    public String mostrarFormularioRegistrarEstudiante(Model model) {
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);
        return "crear_estudiante";
    }

    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
        service.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("estudiante", service.obtenerEstudiantePorId(id));
        return "editar_estudiante";
    }

    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante,
            Model modelo) {
        Estudiante estudidanteExistente = service.obtenerEstudiantePorId(id);
        estudidanteExistente.setId(id);
        estudidanteExistente.setNombre(estudiante.getNombre());
        estudidanteExistente.setApellido(estudiante.getApellido());
        estudidanteExistente.setEmail(estudiante.getEmail());
        service.actualizarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/{id}")
    public String eliminarEstudiante(@PathVariable Long id) {
        service.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }

}
