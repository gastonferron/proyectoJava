package logica.entidades;

import java.util.Date;

public class Salida {
    private String nombreSalida;
    private String actividadAsociada[];
    private static int cantidadMaximaTuristas;
    private Date fechaAlta;
    private Date fecha;
    private Date hora;
    private String lugarSalida;

    public Salida() {
    }

    public Salida(String nombreSalida, String[] actividadAsociada, Date fechaAlta, Date fecha, Date hora, String lugarSalida) {
        this.nombreSalida = nombreSalida;
        this.actividadAsociada = actividadAsociada;
        this.fechaAlta = fechaAlta;
        this.fecha = fecha;
        this.hora = hora;
        this.lugarSalida = lugarSalida;
    }

    public String getNombreSalida() {
        return nombreSalida;
    }

    public void setNombreSalida(String nombreSalida) {
        this.nombreSalida = nombreSalida;
    }

    public String[] getActividadAsociada() {
        return actividadAsociada;
    }

    public void setActividadAsociada(String[] actividadAsociada) {
        this.actividadAsociada = actividadAsociada;
    }

    public static int getCantidadMaximaTuristas() {
        return cantidadMaximaTuristas;
    }

    public static void setCantidadMaximaTuristas(int cantidadMaximaTuristas) {
        Salida.cantidadMaximaTuristas = cantidadMaximaTuristas;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }
}
