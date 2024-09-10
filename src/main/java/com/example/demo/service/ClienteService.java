package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Cliente;

public interface ClienteService {
	
	Cliente create(Cliente a);
	Cliente update(Cliente a);
	void delete(Long id);
	Optional<Cliente>read(Long id);
	List<Cliente>readAll();
}
