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
public class Resumen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResumen;

    private Date fechaDeRegistro;

    @JsonIgnoreProperties({"resumen", "hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resumen_id")
    private List<Educacion> educacion;

    @JsonIgnoreProperties({"resumen", "hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resumen_id")
    private List<Practica> practicas;

    @JsonIgnoreProperties({"resumen", "hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resumen_id")
    private List<Experiencia> experiencia;

    @JsonIgnoreProperties({"resumen", "hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resumen_id")
    private List<Competencia> competencia;

  /*  @JsonIgnoreProperties({"resumen", "hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name= "perfil_id")
    private Perfil perfil;*/
}
