package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ClienteDao;
import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;

@Component
public class ClienteDaoImpl implements ClienteDao{

	@Autowired
	private ClienteRepository repository;
	@Override
	public Cliente create(Cliente a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Cliente update(Cliente a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
