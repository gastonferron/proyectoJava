package logica.DTs;

import java.time.LocalDate;

public class DTUsuario {
    protected String nickname;
    protected String nombreUsuario;
    protected String apellido;
    protected String email;
    protected LocalDate fechaNac;

    public  DTUsuario (String nickname, String nombreUsuario, String apellido, String email, LocalDate fechaNac) {
        this.nickname = nickname;
        this.nombreUsuario = nombreUsuario;
        this.apellido = apellido;
        this.email = email;
        this.fechaNac = fechaNac;
    }

    public String getNickname() {
        return nickname;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }
}
