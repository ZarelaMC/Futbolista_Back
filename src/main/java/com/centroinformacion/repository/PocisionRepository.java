package com.centroinformacion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.entity.Posicion;

public interface PocisionRepository extends JpaRepository<Posicion, Integer> {
	public abstract List<Posicion> findByOrderByDescripcionAsc();
}
