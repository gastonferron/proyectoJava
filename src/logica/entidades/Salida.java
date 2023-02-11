package logica.entidades;

import logica.DTs.DTSalida;

import java.time.LocalDateTime;

public class Salida {
    private String nombreSalida;
    private static int cantidadMaximaTuristas;
    private LocalDateTime fechayHoraAlta;
    private LocalDateTime fechayHoraSalida;
    private String lugarSalida;

    public Salida() {
    }

    public Salida(String nombreSalida, LocalDateTime fechayHoraAlta, LocalDateTime fechayHoraSalida, String lugarSalida) {
        this.nombreSalida = nombreSalida;
        this.fechayHoraAlta = fechayHoraAlta;
        this.fechayHoraSalida = fechayHoraSalida;
        this.lugarSalida = lugarSalida;
    }

    public DTSalida obtenerDTSalida(){
        return new DTSalida(nombreSalida, fechayHoraAlta, fechayHoraSalida,lugarSalida);
    }

    public String getNombreSalida() {
        return nombreSalida;
    }

    public void setNombreSalida(String nombreSalida) {
        this.nombreSalida = nombreSalida;
    }

    public static int getCantidadMaximaTuristas() {
        return cantidadMaximaTuristas;
    }

    public static void setCantidadMaximaTuristas(int cantidadMaximaTuristas) {
        Salida.cantidadMaximaTuristas = cantidadMaximaTuristas;
    }

    public LocalDateTime getFechayHoraAlta() {
        return fechayHoraAlta;
    }

    public void setFechayHoraAlta(LocalDateTime fechayHoraAlta) {
        this.fechayHoraAlta = fechayHoraAlta;
    }

    public LocalDateTime getFechayHoraSalida() {
        return fechayHoraSalida;
    }

    public void setFechayHoraSalida(LocalDateTime fechayHoraSalida) {
        this.fechayHoraSalida = fechayHoraSalida;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }
}
