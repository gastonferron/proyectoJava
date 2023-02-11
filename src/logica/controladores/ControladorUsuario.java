package logica.controladores;


import logica.DTs.DTProveedor;
import logica.DTs.DTUsuario;
import logica.entidades.Proveedor;
import logica.entidades.Turista;
import logica.entidades.Usuario;
import logica.excepeciones.EntidadExiste;
import logica.excepeciones.EntidadNoExiste;
import logica.manejadores.ManejadorUsuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    public void altaTurista(String nickname, String nombre, String apellido, String email, LocalDate fechaNacimiento, String nacionalidad) throws EntidadExiste {
        ManejadorUsuario manejador = ManejadorUsuario.getInstanciaUsuario();
        if (manejador.existUser(nickname)){
            throw new EntidadExiste("El turista ya ha sido creado");
        }
        else{
            Turista turista = new Turista(nickname,nombre,apellido,email,fechaNacimiento,nacionalidad);
            manejador.addUser(turista);
        }
    }
    public DTUsuario obtenerUsuario(String nickname) throws EntidadNoExiste {
        ManejadorUsuario manejador = ManejadorUsuario.getInstanciaUsuario();
        Usuario user = manejador.getUser(nickname);
        if (user == null){
            throw new EntidadNoExiste("El usuario no existe");
        }
        return user.obtenerDTUsuario();
    }

    public List<DTUsuario> obtenerAllUsers() {
        ManejadorUsuario manejador = ManejadorUsuario.getInstanciaUsuario();
        List<Usuario> lista = manejador.getAllUsers();
        List<DTUsuario> listaUsuarios = new ArrayList<>();
        for (Usuario user: lista) {
            listaUsuarios.add(user.obtenerDTUsuario());
        }
        return listaUsuarios;
    }
    public List<DTProveedor> obtenerAllProveedores(){
        ManejadorUsuario manejador = ManejadorUsuario.getInstanciaUsuario();
        List<Usuario> lista = manejador.getAllUsers();
        List<DTProveedor> listaProveedores = new ArrayList<>();
        for (Usuario user: lista) {
            if (user instanceof Proveedor){
                listaProveedores.add(((Proveedor) user).obtenerDTProveedor());
            }
        }
        return listaProveedores;
    }
}
