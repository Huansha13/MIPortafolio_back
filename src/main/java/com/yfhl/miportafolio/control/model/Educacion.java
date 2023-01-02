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
public class Educación {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEducación;

    private String fechaDeRegistro;
    private String gradoDeEstudio;
    private Date   fecha;


}
