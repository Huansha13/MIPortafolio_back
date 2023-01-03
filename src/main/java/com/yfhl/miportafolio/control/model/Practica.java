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
public class Practica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPractica;

    private Date fechaDeRegistro;
    private String empresas;
    private Date fecha;
    private String descripcion;
    private String lugar;

}
