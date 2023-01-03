package com.yfhl.miportafolio.control.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity @Getter @Setter
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLink;

    private String url;
    private String icono;
    private String nombreLink;
    private Date fechaDeRegistro;
    private String abreviacion;
}
