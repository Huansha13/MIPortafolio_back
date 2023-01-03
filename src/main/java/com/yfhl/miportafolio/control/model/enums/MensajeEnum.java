package com.yfhl.miportafolio.control.model.enums;

public enum MensajeEnum {

    RESP_OBTENER_PERFIL_BY_USER("Obtener perfil por usuario"),
    OBTENER_PERFIL_NULL("Obtener perfil es nulo"),
    RESPUESTA_NULL("No se encontro resgistros para esta consulta"),
    RESP_OBTENER_MENU("Obtener menus"),
    OBTENER_CATEGORIA_HABILIDADES("Obtener categoria hablididades"),
    OBTENER_PROYECTO("Obtener proyecto"),
    RESP_OBTENER_RESUMEN("Obtener resumen"),
    OBTENER_CONTACTO("Obtener contacto");

    private String value;

    private MensajeEnum(String value) {
        setValue(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
