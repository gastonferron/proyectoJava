package logica.DTs;

import logica.entidades.Paquete;
import logica.entidades.Salida;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DTActividad {
    private String idActividad;
    private String descripcion;
    private LocalTime duracionHoras;
    private int costo;
    private String ciudad;
    private LocalDate fechaALta;
    private List<Salida> salidas;
    private List<Paquete> paquetes;

    public DTActividad(String idActividad, String descripcion, LocalTime duracionHoras, int costo, String ciudad, LocalDate fechaALta) {
        salidas = new ArrayList<>();
        paquetes = new ArrayList<>();
        this.idActividad = idActividad;
        this.descripcion = descripcion;
        this.duracionHoras = duracionHoras;
        this.costo = costo;
        this.ciudad = ciudad;
        this.fechaALta = fechaALta;
    }

    public String getIdActividad() {
        return idActividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalTime getDuracionHoras() {
        return duracionHoras;
    }

    public int getCosto() {
        return costo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public LocalDate getFechaALta() {
        return fechaALta;
    }

    public List<Salida> getSalidas() {
        return salidas;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }
}
