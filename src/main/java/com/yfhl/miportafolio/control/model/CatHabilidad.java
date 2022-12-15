package com.yfhl.miportafolio.control.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class CatHabilidad {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private String LenguajeDeProgramacion;
	
	
	private String BaseDeDatos;
	private String SistemasOperativos;
	private String HerramientasDeMaquetacion;
	private String Otros;
	private String Idiomas; 
	
}

