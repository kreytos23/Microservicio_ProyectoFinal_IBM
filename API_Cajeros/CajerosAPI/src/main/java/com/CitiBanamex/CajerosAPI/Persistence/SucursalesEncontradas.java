package com.CitiBanamex.CajerosAPI.Persistence;

public class SucursalesEncontradas {
    private String TipoSucursal;
    private String Direccion;
    private String EntreCalles;
    private String Horario;
    private String ID;

    public SucursalesEncontradas(String tipoSucursal, String direccion, String entreCalles, String horario, String id) {
        TipoSucursal = tipoSucursal;
        Direccion = direccion;
        EntreCalles = entreCalles;
        Horario = horario;
        ID = id;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTipoSucursal() {
        return TipoSucursal;
    }

    public void setTipoSucursal(String tipoSucursal) {
        TipoSucursal = tipoSucursal;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getEntreCalles() {
        return EntreCalles;
    }

    public void setEntreCalles(String entreCalles) {
        EntreCalles = entreCalles;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }
}
