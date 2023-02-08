package logica.controladores;

import logica.excepeciones.EntidadExiste;

import java.time.LocalDate;

public interface IControladorUsuario {
    public void altaProveedor(String nickname, String nombre, String apellido, String email, String descrpicion, String url, LocalDate fechaNacimiento) throws EntidadExiste;

    public void altaTurista(String nickname, String nombre, String apellido, String email, LocalDate fechaNacimiento, String nacionalidad)throws EntidadExiste;

    public void verUsuario(String nickname);

    public void verAllUsers();
}
