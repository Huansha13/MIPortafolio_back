package com.yfhl.miportafolio.control.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class RedSocial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idRed;
	
	private String icono;
	private String url;
	private String nombre;

}
