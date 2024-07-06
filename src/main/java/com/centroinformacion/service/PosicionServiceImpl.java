package com.centroinformacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centroinformacion.entity.Posicion;
import com.centroinformacion.repository.PocisionRepository;

@Service
public class PosicionServiceImpl implements PosicionService {

	@Autowired
	private PocisionRepository repository;
	
	@Override
	public List<Posicion> listarPosicion() {
		return repository.findByOrderByDescripcionAsc();
	}

}
