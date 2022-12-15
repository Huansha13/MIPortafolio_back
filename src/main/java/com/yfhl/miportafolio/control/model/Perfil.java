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
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPerfil;
	
	private String userName;
	private String nombre;
	private String sobreMi;
	private Integer edad;
	private String ubicacion;
	private String stackPreferido;
	private String intereses;
	private String competencias;
	private String fotoPerfil; 
	private String curriculumVitae;
	private String logo01;
	private String imagen01;
	private String info01;
	private String info02;
	
	
	@JsonIgnoreProperties({"perfil", "hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "perfil_id")
	private List<RedSocial> redesSociales; 
	
	@JsonIgnoreProperties({"perfil", "hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "perfil_id")
	private List<CategoriaHabilidad> categoriahabilidades;
	
	
}
