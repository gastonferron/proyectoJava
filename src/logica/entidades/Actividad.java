package logica.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Actividad {
    private String lugarSalida;
    private String proveedor;
    private String nombreActividad;
    private String descripcion;
    private int duracionHoras;
    private int costo;
    private String ciudad;
    private Date fechaALta;
    private List<Salida> salidas;
    private List<Paquete> paquetes;

    public Actividad() {
        salidas = new ArrayList<>();
        paquetes = new ArrayList<>();
    }

    public Actividad(String lugarSalida, String proveedor, String nombreActividad, String descripcion, int duracionHoras, int costo, String ciudad, Date fechaALta) {
        salidas = new ArrayList<>();
        paquetes = new ArrayList<>();
        this.lugarSalida = lugarSalida;
        this.proveedor = proveedor;
        this.nombreActividad = nombreActividad;
        this.descripcion = descripcion;
        this.duracionHoras = duracionHoras;
        this.costo = costo;
        this.ciudad = ciudad;
        this.fechaALta = fechaALta;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
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

    public Date getFechaALta() {
        return fechaALta;
    }

    public void setFechaALta(Date fechaALta) {
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
