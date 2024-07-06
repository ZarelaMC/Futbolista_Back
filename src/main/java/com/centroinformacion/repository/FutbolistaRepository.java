package com.centroinformacion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.centroinformacion.entity.Futbolista;

public interface FutbolistaRepository extends JpaRepository<Futbolista, Integer> {
	public abstract List<Futbolista> findByOrderByNombresAsc();
	
	@Query("select f from Futbolista f where f.idFutbolista = ?1")
	public abstract List<Futbolista> listarFutbolistaLikeId(int id);
}
