package logica.entidades;

import java.util.Date;

public class Actividad {
    private String lugarSalida;
    private String proveedor;
    private String nombreActividad;
    private String descripcion;
    private int duracionHoras;
    private int costo;
    private String ciudad;
    private Date fechaALta;

    public Actividad() {
    }

    public Actividad(String lugarSalida, String proveedor, String nombreActividad, String descripcion, int duracionHoras, int costo, String ciudad, Date fechaALta) {
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
}
