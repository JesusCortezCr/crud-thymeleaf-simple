package com.cortez.thymeleaf.crud_thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cortez.thymeleaf.crud_thymeleaf.entities.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Long>{

}
