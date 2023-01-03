package com.yfhl.miportafolio.control.to;

import com.yfhl.miportafolio.control.model.enums.EstadoRespuestaEnum;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
@Getter @Setter
public class ResponseTo<T>  {


    private String status;
    private String summary;
    private String severity;
    private String message;
    private List<String> errorTrace;

    private T response;

    public ResponseTo(){
        super();
        this.status = EstadoRespuestaEnum.OK.getValue();
        this.severity = "success";
    }
    public ResponseTo(String summary) {
        super();
        this.status = EstadoRespuestaEnum.OK.getValue();
        this.severity = "success";
        this.summary = summary;
    }

    public void setStatus(String status) {
        this.severity = "success";

        if (status.equals(EstadoRespuestaEnum.INTERNAL_SERVER_ERROR.getValue())) {
            this.severity = "error";
        }
        if (status.equals(EstadoRespuestaEnum.NOT_FOUND.getValue())) {
            this.severity = "warn";
        }

        this.status = status;
    }
}
