package com.yfhl.miportafolio.control.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExperiencia;

    private String empresa;
    private String lugar;
    private String descripcion;
    private Date fechaDeRegistro;
}
