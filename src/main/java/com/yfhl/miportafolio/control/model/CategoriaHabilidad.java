package com.yfhl.miportafolio.control.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class CategoriaHabilidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idCategoria;
	
	private String icono;
	private String nombre;

	
	@JsonIgnoreProperties({"categoriaHabilidad", "hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "categoriaHabilidad_id")
	private List<Habilidad>habilidades;

	
	
}




