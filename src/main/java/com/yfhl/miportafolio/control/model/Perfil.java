package com.yfhl.miportafolio.control.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

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
	private Date fechaDeRegistro;


	@JsonIgnoreProperties({"perfil", "hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "perfil_id")
	private List<RedSocial> redesSociales;

	@JsonIgnoreProperties({"perfil", "hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "perfil_id")
	private List<CategoriaHabilidad> categoriahabilidades;

	@JsonIgnoreProperties({"perfil", "hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "perfil_id")
	private List<Proyecto> proyectos;

	@JsonIgnoreProperties({"perfil", "hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "perfil_id")
	private List<MiServicio> miServicio;

	@JsonIgnoreProperties({"perfil", "hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "perfil_id")
	private List<Certificado> certificado;

	@JsonIgnoreProperties({"perfil", "hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "perfil_id")
	private List<Menu> menu;

	@JsonIgnoreProperties({"perfil", "hibernateLazyInitializer", "handler"})
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "contacto_id")
	private Contacto contacto;

	@JsonIgnoreProperties({"perfil", "hibernateLazyInitializer", "handler"})
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "resumen_id")
	private Resumen resumen;




}
