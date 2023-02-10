package logica.controladores;

import logica.DTs.DTUsuario;
import logica.excepeciones.EntidadExiste;
import logica.excepeciones.EntidadNoExiste;

import java.time.LocalDate;
import java.util.List;

public interface IControladorUsuario {
    public void altaProveedor(String nickname, String nombre, String apellido, String email, String descrpicion, String url, LocalDate fechaNacimiento) throws EntidadExiste;

    public void altaTurista(String nickname, String nombre, String apellido, String email, LocalDate fechaNacimiento, String nacionalidad)throws EntidadExiste;

    public DTUsuario obtenerUsuario(String nickname) throws EntidadNoExiste;

    public List<DTUsuario> obtenerAllUsers();
}
