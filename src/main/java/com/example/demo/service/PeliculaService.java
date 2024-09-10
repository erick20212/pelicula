package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Pelicula;

public interface PeliculaService {
	Pelicula create(Pelicula a);
	Pelicula update(Pelicula a);
	void delete(Long id);
	Optional<Pelicula>read(Long id);
	List<Pelicula>readAll();
}
