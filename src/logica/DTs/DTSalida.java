package logica.DTs;

import java.time.LocalDateTime;

public class DTSalida {

    private String nombreSalida;
    private static int cantidadMaximaTuristas;
    private LocalDateTime fechayHoraAlta;
    private LocalDateTime fechayHoraSalida;
    private String lugarSalida;

    public DTSalida(String nombreSalida, LocalDateTime fechayHoraAlta, LocalDateTime fechayHoraSalida, String lugarSalida) {
        this.nombreSalida = nombreSalida;
        this.fechayHoraAlta = fechayHoraAlta;
        this.fechayHoraSalida = fechayHoraSalida;
        this.lugarSalida = lugarSalida;
    }

    public String getNombreSalida() {
        return nombreSalida;
    }

    public static int getCantidadMaximaTuristas() {
        return cantidadMaximaTuristas;
    }

    public LocalDateTime getFechayHoraAlta() {
        return fechayHoraAlta;
    }

    public LocalDateTime getFechayHoraSalida() {
        return fechayHoraSalida;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }
}
