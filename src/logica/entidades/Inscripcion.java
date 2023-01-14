package logica.entidades;

import java.util.Date;

public class Inscripcion {
    private Date fechaInscripcion;
    private static int cantidadTuristas;
    private int costo;

    public Inscripcion() {
    }

    public Inscripcion(Date fechaInscripcion, int costo) {
        this.fechaInscripcion = fechaInscripcion;
        this.costo = costo;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public static int getCantidadTuristas() {
        return cantidadTuristas;
    }

    public static void setCantidadTuristas(int cantidadTuristas) {
        Inscripcion.cantidadTuristas = cantidadTuristas;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
