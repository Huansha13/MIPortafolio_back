package com.yfhl.miportafolio.control.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yfhl.miportafolio.control.dao.PerfilDao;
import com.yfhl.miportafolio.control.model.Perfil;
import com.yfhl.miportafolio.control.service.PerfilService;

@Service
public class PerfilServiceImpl implements PerfilService {

	@Autowired
	 private PerfilDao perfilDao;
	@Override
	public Perfil obtenerPerfilByUser(String username) {
	
		return perfilDao.obtenerPerfilByUser(username);
	}

}
