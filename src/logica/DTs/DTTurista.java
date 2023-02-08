package logica.DTs;

import java.time.LocalDate;

public class DTTurista extends DTUsuario{

    private String nacionalidad;

    public DTTurista(String nickname, String nombreUsuario, String apellido, String email, LocalDate fechaNac, String nacionalidad) {
        super(nickname, nombreUsuario, apellido, email, fechaNac);
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
