package com.yfhl.miportafolio.control.dao;

import com.yfhl.miportafolio.control.model.*;

import java.util.List;

public interface PerfilDao {
	Perfil obtenerPerfilByUser(String username);

	List<CategoriaHabilidad> obtenerCategoriaHabiidades();

	List<Habilidad> obtenerHabilidad();

	List<Proyecto> obtenerProyecto();

	List<MiServicio> obtenerMiServicio();

	List<Certificado> obtenerCertificado();

	List<Menu> obtenerMenu();

	List<Resumen> obtenerResumen();

	List<Educacion> obtenerEducacion();

	List<Practica> obtenerPractica();

	List<Experiencia> obtenerExperiencia();

	List<Competencia> obtenerCompetencia();
	List<Contacto> obtenerContacto();


}
