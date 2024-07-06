package com.centroinformacion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Posicion")
public class Posicion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPosicion;
	private String descripcion;
}
