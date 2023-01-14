package logica.entidades;

public class Turista extends Usuario{
    private String nacionalidad;

    public Turista() {

    }

    public Turista(String nickname, String nombreUsuario, String apellido, String email, int fechaNac, String nacionalidad) {
        super(nickname, nombreUsuario, apellido, email, fechaNac);
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
