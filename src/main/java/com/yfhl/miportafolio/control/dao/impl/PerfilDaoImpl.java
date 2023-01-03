package com.yfhl.miportafolio.control.dao.impl;

import com.yfhl.miportafolio.control.model.*;
import com.yfhl.miportafolio.control.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.yfhl.miportafolio.control.dao.PerfilDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
public class PerfilDaoImpl implements PerfilDao {

    @Autowired
    private PerfilRepository perfilRepository;

    @Autowired
    private MenuRepository menuRepository;
    @Autowired
    private CategoriaHabilidadRepository categoriaHabilidadRepository;

    @Autowired
    private ProyectoRepository proyectoRepository;

    @Autowired
    private HabilidadRepository habilidadRepository;

    @Autowired
    private MiServicioRepository miServicioRepository;

    @Autowired
    private CertificadoRepository certificadoRepository;

    @Autowired
    private ResumenRepository resumenRepository;

    @Autowired
    private EducacionRepository educacionRepository;

    @Autowired
    private PracticaRepository practicaRepository;

    @Autowired
    private ExperienciaRepository experienciaRepository;

    @Autowired
    private CompetenciaRepository competenciaRepository;

    @Autowired
    private ContactoRepository contactoRepository;
    @Override
    public Perfil obtenerPerfilByUser(String username) {
        return perfilRepository.findByUserName(username);
    }

    @Override
    public List<CategoriaHabilidad> obtenerCategoriaHabiidades() {
        return categoriaHabilidadRepository.findAll();
    }


    @Override
    public List<Proyecto> obtenerProyecto() {
        return proyectoRepository.findAll();
    }

    @Override
    public List<Habilidad> obtenerHabilidad() {
        return habilidadRepository.findAll();
    }

    @Override
    public List<MiServicio> obtenerMiServicio() {
        return miServicioRepository.findAll();

    }

    @Override
    public List<Certificado> obtenerCertificado() {
        return certificadoRepository.findAll();
    }

    @Override
    public List<Menu> obtenerMenu() {
        return menuRepository.findAll();
    }

    @Override
    public List<Resumen> obtenerResumen() {
        return resumenRepository.findAll();
    }

    @Override
    public List<Educacion> obtenerEducacion () {
        return educacionRepository.findAll();
    }

    @Override
    public List<Practica> obtenerPractica () {
        return practicaRepository.findAll();
    }

    @Override
    public List<Experiencia> obtenerExperiencia () {
        return experienciaRepository.findAll();
    }

    @Override
    public List<Competencia> obtenerCompetencia(){
        return competenciaRepository.findAll();
    }
    @Override
    public List<Contacto> obtenerContacto(){
        return contactoRepository.findAll();
    }



	/*@Override
	public List<CategoriaHab> obtenerCH() {
		return chRepository.findAll();		
	}*/


}
