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
@CrossOrigin(origins = {"*"})
public class PerfilController {
    @Autowired
    private PerfilService perfilService;

    @GetMapping("/obtenerPerfilByUsername/{username}")
    ResponseEntity<?> obtenerPerfilByUsername(@PathVariable String username) {
        return ResponseEntity.ok(perfilService.obtenerPerfilByUser(username));
    }

    @GetMapping("/obtenerCategoriaHabilidades")
    ResponseEntity<?> obtenerCategoriaHabilidades() {
        return ResponseEntity.ok(perfilService.obtenerCategoriaHabiidades());
    }

    @GetMapping("/obtenerProyectos")
    ResponseEntity<?> obtenerproyectos() {
        return ResponseEntity.ok(perfilService.obtenerProyectos());
    }

    @GetMapping("/obtenerMiServicio")
    ResponseEntity<?> obtenerMiServicio() {
        return ResponseEntity.ok(perfilService.obtenerMiServicio());
    }

    @GetMapping("/obtenerCertificados")
    ResponseEntity<?> obtenerCertificados() {
        return ResponseEntity.ok(perfilService.obtenerCertificado());
    }

    @GetMapping("/obtenerMenu")
    ResponseEntity<?> obtenerMenu() {
        return ResponseEntity.ok(perfilService.obtenerMenu());
    }

        @GetMapping("/obtenerResumen")
        ResponseEntity<?> obtenerResumen() {
            return ResponseEntity.ok(perfilService.obtenerResumen());
        }
    @GetMapping("/obtenerContacto")
    ResponseEntity<?> obtenerContacto() {
        return ResponseEntity.ok(perfilService.obtenerContacto());
    }

}
