package logica.entidades;

import logica.DTs.DTDepartamento;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombreDepartamento;
    private String descripcion;
    private String url;
    private List<Actividad> actividades;

    public Departamento() {
        actividades = new ArrayList<>();
    }

    public DTDepartamento obtenerDTDepartamento(){
        return new DTDepartamento(nombreDepartamento, descripcion, url);
    }

    public Departamento(String nombreDepartamento, String descripcion, String url) {
        actividades = new ArrayList<>();
        this.nombreDepartamento = nombreDepartamento;
        this.descripcion = descripcion;
        this.url = url;
    }

    public void addActividad(Actividad actividad){
        actividades.add(actividad);
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
        return actividades;
    }

    public void setActividads(List<Actividad> actividads) {
        this.actividades = actividads;
    }
}
