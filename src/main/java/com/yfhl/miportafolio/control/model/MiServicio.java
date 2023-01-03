package com.yfhl.miportafolio.control.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class MiServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMiServicio;

    private String icono;
    private String nombre;
    private String descripcion;
    private Date fechaDeRegistro;
}



