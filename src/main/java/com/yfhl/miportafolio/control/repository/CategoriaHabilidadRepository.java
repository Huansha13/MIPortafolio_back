package com.yfhl.miportafolio.control.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yfhl.miportafolio.control.model.CategoriaHabilidad;

public interface CategoriaHabilidadRepository extends JpaRepository<CategoriaHabilidad, Long>{

	
	CategoriaHabilidad findByUserName(String userName); 

}
