package com.centroinformacion.service;

import java.util.List;

import com.centroinformacion.entity.Futbolista;


public interface FutbolistaService {
	public abstract List<Futbolista> listaFutbolista();

	public abstract List<Futbolista> listaFutbolistaId(int id);
}
