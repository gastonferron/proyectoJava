package logica.entidades;

import logica.DTs.DTActividad;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Actividad {
    private String idActividad;
    private String descripcion;
    private LocalTime duracionHoras;
    private int costo;
    private String ciudad;
    private LocalDate fechaALta;
    private List<Salida> salidas;
    private List<Paquete> paquetes;

    public Actividad() {
        salidas = new ArrayList<>();
        paquetes = new ArrayList<>();
    }

    public Actividad(String idActividad, String descripcion, LocalTime duracionHoras, int costo, String ciudad, LocalDate fechaALta) {
        salidas = new ArrayList<>();
        paquetes = new ArrayList<>();
        this.idActividad = idActividad;
        this.descripcion = descripcion;
        this.duracionHoras = duracionHoras;
        this.costo = costo;
        this.ciudad = ciudad;
        this.fechaALta = fechaALta;
    }

    public DTActividad obtenerDTActividad(){
        return new DTActividad(idActividad, descripcion, duracionHoras, costo, ciudad, fechaALta);
    }

    public void addSalidas(Salida salida){
        salidas.add(salida);
    }

    public String getNombreActividad() {
        return idActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.idActividad = idActividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalTime getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(LocalTime duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFechaALta() {
        return fechaALta;
    }

    public void setFechaALta(LocalDate fechaALta) {
        this.fechaALta = fechaALta;
    }

    public List<Salida> getSalidas() {
        return salidas;
    }

    public void setSalidas(List<Salida> salidas) {
        this.salidas = salidas;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }
}
