package com.yfhl.miportafolio.control.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity @Getter @Setter
public class Herramienta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHerramienta;

    private String nombreDeHerramienta;
    private String icono;
    private String color;
    private Date  fechaDeRegistro;
}
