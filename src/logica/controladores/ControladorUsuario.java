package logica.controladores;

import logica.entidades.Proveedor;
import logica.entidades.Turista;
import logica.excepeciones.EntidadExiste;
import logica.manejadores.ManejadorUsuario;
import java.time.LocalDate;

public class ControladorUsuario implements IControladorUsuario{

    @Override
    public void altaProveedor(String nickname, String nombre, String apellido, String email, String descrpicion, String url, LocalDate fechaNacimiento) throws EntidadExiste {
        ManejadorUsuario manejador = ManejadorUsuario.getInstanciaUsuario();
        if (manejador.existUser(nickname)){
            throw new EntidadExiste("El proveedor ya ha sido creado");
        }
        else{
            Proveedor proveedor = new Proveedor (nickname,nombre,apellido, email, fechaNacimiento, descrpicion, url);
            manejador.addUser(proveedor);
        }
    }
    public void AltaTurista(String nickname, String nombre, String apellido, String email, LocalDate fechaNacimiento, String nacionalidad) throws EntidadExiste {
        ManejadorUsuario manejador = ManejadorUsuario.getInstanciaUsuario();
        if (manejador.existUser(nickname)){
            throw new EntidadExiste("El turista ya ha sido creado");
        }
        else{
            Turista turista = new Turista(nickname,nombre,apellido,email,fechaNacimiento,nacionalidad);
            manejador.addUser(turista);
        }
    }
    public void verUsuario(String nickname){
        ManejadorUsuario manejador = ManejadorUsuario.getInstanciaUsuario();
        manejador.getUser(nickname);
    }

    public void verAllUsers(){
        ManejadorUsuario manejador = ManejadorUsuario.getInstanciaUsuario();
        manejador.getAllUsers();
    }

}
