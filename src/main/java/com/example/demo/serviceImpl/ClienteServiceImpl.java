package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClienteDao;
import com.example.demo.entity.Cliente;
import com.example.demo.service.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDao dao;

	@Override
	public Cliente create(Cliente a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Cliente update(Cliente a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
