package com.CitiBanamex.CajerosAPI.Persistence;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Answers {
    @NotNull(message = "Your Latitude cannot be empty")
    @NotBlank(message = "Your Latitude cannot be empty")
    private String GPS1;
    @NotNull(message = "Your Longitude cannot be empty")
    @NotBlank(message = "Your Longitude cannot be empty")
    private String GPS2;
    @NotNull(message = "Your CP cannot be empty")
    @NotBlank(message = "Your CP cannot be empty")
    private String CP;
    @NotNull(message = "Your State cannot be empty")
    @NotBlank(message = "Your State cannot be empty")
    private String Estado;
    @NotNull(message = "Your town cannot be empty")
    @NotBlank(message = "Your town cannot be empty")
    private String Delegacion;

    public Answers(String GPS1, String GPS2, String CP, String Estado, String Delegacion) {
        this.GPS1 = GPS1;
        this.GPS2 = GPS2;
        this.CP = CP;
        this.Estado = Estado;
        this.Delegacion = Delegacion;
    }

    public String getGPS1() {
        return GPS1;
    }

    public void setGPS1(String GPS1) {
        this.GPS1 = GPS1;
    }

    public String getGPS2() {
        return GPS2;
    }

    public void setGPS2(String GPS2) {
        this.GPS2 = GPS2;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getDelegacion() {
        return Delegacion;
    }

    public void setDelegacion(String delegacion) {
        Delegacion = delegacion;
    }
}
