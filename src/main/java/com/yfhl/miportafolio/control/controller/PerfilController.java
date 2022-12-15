package com.yfhl.miportafolio.control.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yfhl.miportafolio.control.service.PerfilService;

@RestController
@RequestMapping("/api/perfil")
@CrossOrigin(origins = { "*" })
public class PerfilController {
	@Autowired
	private PerfilService perfilService; 
	
	@GetMapping("/obtenerPerfilByUsername/{username}")
	ResponseEntity<?> obtenerPerfilByUsername(@PathVariable String username){
		return ResponseEntity.ok(perfilService.obtenerPerfilByUser(username));
	}; 

}
