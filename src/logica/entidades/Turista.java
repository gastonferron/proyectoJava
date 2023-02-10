package logica.entidades;

import logica.DTs.DTTurista;
import logica.DTs.DTUsuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Turista extends Usuario{
    private String nacionalidad;

    private List<Inscripcion> inscripciones;
    private List<Compra> compras;

    public Turista() {
        super();
        inscripciones = new ArrayList<>();
        compras = new ArrayList<>();
    }

    @Override
    public DTUsuario obtenerDTUsuario() {
        return new DTTurista(nickname, nombreUsuario, apellido, email, fechaNac, nacionalidad);
    }

    public DTTurista obtenerDTTurista(){
        return (DTTurista)obtenerDTUsuario();
    }

    public Turista(String nickname, String nombreUsuario, String apellido, String email, LocalDate fechaNac, String nacionalidad) {
        super(nickname, nombreUsuario, apellido, email, fechaNac);
        inscripciones = new ArrayList<>();
        compras = new ArrayList<>();
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

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

}
