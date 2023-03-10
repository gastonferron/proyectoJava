package logica.entidades;

import logica.DTs.DTUsuario;

import java.time.LocalDate;

public abstract class Usuario {
    protected String nickname;
    protected String nombreUsuario;
    protected String apellido;
    protected String email;
    protected LocalDate fechaNac;

    public Usuario() {
    }

    public Usuario(String nickname, String nombreUsuario, String apellido, String email, LocalDate fechaNac) {
        this.nickname = nickname;
        this.nombreUsuario = nombreUsuario;
        this.apellido = apellido;
        this.email = email;
        this.fechaNac = fechaNac;
    }

    public abstract DTUsuario obtenerDTUsuario();

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
}