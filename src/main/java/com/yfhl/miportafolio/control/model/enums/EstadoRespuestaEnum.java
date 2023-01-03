package com.yfhl.miportafolio.control.model.enums;

public enum EstadoRespuestaEnum {

    OK("200"),
    NOT_FOUND("404"),
    NOT_CREATE("300"),
    INTERNAL_SERVER_ERROR("500");

    private String value;

    private EstadoRespuestaEnum(String value) {
        setValue(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
