package com.yfhl.miportafolio.control.service;

import com.yfhl.miportafolio.control.model.*;
import com.yfhl.miportafolio.control.to.ResponseTo;

import java.util.List;

public interface PerfilService {
	
	ResponseTo<Perfil> obtenerPerfilByUser(String username);
	ResponseTo<List<CategoriaHabilidad>> obtenerCategoriaHabiidades();
	ResponseTo<List<Proyecto>> obtenerProyectos();

	ResponseTo<List<MiServicio>> obtenerMiServicio();

	ResponseTo<List<Certificado>> obtenerCertificado();
	ResponseTo<List<Menu>> obtenerMenu();

	ResponseTo<List<Resumen>> obtenerResumen();

	ResponseTo<List<Contacto>> obtenerContacto();

}
