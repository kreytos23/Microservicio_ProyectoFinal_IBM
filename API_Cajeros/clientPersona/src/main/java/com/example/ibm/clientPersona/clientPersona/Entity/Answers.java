package com.example.ibm.clientPersona.clientPersona.Entity;

public class Answers {
    //Indice 15
    private String GPS1;
    //Indice 16
    private String GPS2;
    //Indice 4
    private String CP;
    //Indice 17
    private String Estado;
    //Indice 2
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
