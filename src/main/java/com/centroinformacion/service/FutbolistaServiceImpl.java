package com.centroinformacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centroinformacion.entity.Futbolista;
import com.centroinformacion.repository.FutbolistaRepository;

@Service
public class FutbolistaServiceImpl implements FutbolistaService{

	
	@Autowired
	private FutbolistaRepository repository;
	
	@Override
	public List<Futbolista> listaFutbolista() {
		return repository.findByOrderByNombresAsc();
	}

	@Override
	public List<Futbolista> listaFutbolistaId(int id) {
		return repository.listarFutbolistaLikeId(id);
	}

}
