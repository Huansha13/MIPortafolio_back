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
public class Certificado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCertificado;

    private String nombre;
    private String icono;
    private Date   fecha;
    private String logo;
    private String descripcion;
    private String url;
    private String fechaDeRegistro;
}
