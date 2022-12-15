package com.yfhl.miportafolio.control.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yfhl.miportafolio.control.dao.PerfilDao;
import com.yfhl.miportafolio.control.model.Perfil;
import com.yfhl.miportafolio.control.repository.CategoriaHabilidadRepository;
import com.yfhl.miportafolio.control.repository.PerfilRepository;

@Component
public class PerfilDaoImpl implements PerfilDao{
	
	@Autowired
	private PerfilRepository perfilRepository;
	

	@Override
	public Perfil obtenerPerfilByUser(String username) {
		return perfilRepository.findByUserName(username);
		}	
	
	
 
	@Autowired
	private CategoriaHabilidadRepository categoriaHabilidadRepository;
	

		//}
	
    
	
	
	
	/*@Override
	public List<CategoriaHab> obtenerCH() {
		return chRepository.findAll();		
	}*/
	

}
