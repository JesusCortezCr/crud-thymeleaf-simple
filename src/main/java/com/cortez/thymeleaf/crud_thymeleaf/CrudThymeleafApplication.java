package com.cortez.thymeleaf.crud_thymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cortez.thymeleaf.crud_thymeleaf.entities.Estudiante;
import com.cortez.thymeleaf.crud_thymeleaf.repository.EstudianteRepository;

@SpringBootApplication
public class CrudThymeleafApplication implements CommandLineRunner {

	@Autowired
	private EstudianteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CrudThymeleafApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/**
		 * Estudiante estudiante1 = new Estudiante("Jesus", "Cortez",
		 * "jesus@gmail.com");
		 * repository.save(estudiante1);
		 * Estudiante estudiante2 = new Estudiante("Andre", "Carrillo",
		 * "andre@gmail.com");
		 * repository.save(estudiante2);
		 */

	}

}
