package com.example.sebastian.semillarosdeinvestigacion.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sebastian on 19/10/17.
 */

public class Semillero {

    @SerializedName("coordinador_de_investigacion")
    @Expose
    private String coordinadorDeInvestigacion;
    @SerializedName("facultad")
    @Expose
    private String facultad;
    @SerializedName("linea_de_investigacion")
    @Expose
    private String lineaDeInvestigacion;
    @SerializedName("no")
    @Expose
    private String no;
    @SerializedName("semillero_de_investigacion")
    @Expose
    private String semilleroDeInvestigacion;

    public String getCoordinadorDeInvestigacion() {
        return coordinadorDeInvestigacion;
    }

    public void setCoordinadorDeInvestigacion(String coordinadorDeInvestigacion) {
        this.coordinadorDeInvestigacion = coordinadorDeInvestigacion;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getLineaDeInvestigacion() {
        return lineaDeInvestigacion;
    }

    public void setLineaDeInvestigacion(String lineaDeInvestigacion) {
        this.lineaDeInvestigacion = lineaDeInvestigacion;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSemilleroDeInvestigacion() {
        return semilleroDeInvestigacion;
    }

    public void setSemilleroDeInvestigacion(String semilleroDeInvestigacion) {
        this.semilleroDeInvestigacion = semilleroDeInvestigacion;
    }
}
