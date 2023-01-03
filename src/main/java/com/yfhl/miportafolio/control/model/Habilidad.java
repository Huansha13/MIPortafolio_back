package com.yfhl.miportafolio.control.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity @Getter @Setter
public class Habilidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHabilidad;
	
	private String icono;
	private String nombre;
	private String color;
	private String descripcion;
	private Integer porcentaje;
	private Date   fechaDeRegistro;

}
