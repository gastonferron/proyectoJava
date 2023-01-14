package logica.entidades;

import java.util.ArrayList;
import java.util.List;

public class Turista extends Usuario{
    private String nacionalidad;

    private List<Inscripcion> inscripciones;

    public Turista() {
        super();
        inscripciones = new ArrayList<>();
    }

    public Turista(String nickname, String nombreUsuario, String apellido, String email, int fechaNac, String nacionalidad) {
        super(nickname, nombreUsuario, apellido, email, fechaNac);
        inscripciones = new ArrayList<>();
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }
}
