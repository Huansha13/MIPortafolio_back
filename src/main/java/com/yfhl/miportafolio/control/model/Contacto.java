package com.yfhl.miportafolio.control.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DatabindException;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity @Getter @Setter
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContacto;

    private Date fecahDeRegistro;
    private Integer numeroDeContacto;
    private String coreoElectroncio;
    private String ubicacion;
    private String abreviacion;
    private String imagen;

    /* @JsonIgnoreProperties({"contacto", "hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name= "perfil_id")
    private  Perfil perfil; */
}
