package logica.entidades;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombreDepartamento;
    private String descripcion;
    private String url;

    private List<Actividad> actividads;

    public Departamento() {
        actividads = new ArrayList<>();
    }

    public Departamento(String nombreDepartamento, String descripcion, String url) {
        actividads = new ArrayList<>();
        this.nombreDepartamento = nombreDepartamento;
        this.descripcion = descripcion;
        this.url = url;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Actividad> getActividads() {
        return actividads;
    }

    public void setActividads(List<Actividad> actividads) {
        this.actividads = actividads;
    }
}
