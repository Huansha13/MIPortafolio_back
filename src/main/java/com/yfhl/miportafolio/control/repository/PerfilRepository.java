package com.yfhl.miportafolio.control.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yfhl.miportafolio.control.model.Perfil;


public interface PerfilRepository extends JpaRepository<Perfil, Long>{

	Perfil findByUserName(String userName);
}
