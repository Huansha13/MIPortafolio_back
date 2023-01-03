package com.yfhl.miportafolio.control.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity @Getter @Setter
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProyecto;

    private String portadas;
    private Date fechaDeProyecto;
    private String nombreDeProyecto;
    private Date fechaDeRegistro;

    @JsonIgnoreProperties({"proyecto", "hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "proyecto_id")
    private List<Herramienta> herramientas;

    @JsonIgnoreProperties({"proyecto", "hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "proyecto_id")
    private List<Link> links;

}
