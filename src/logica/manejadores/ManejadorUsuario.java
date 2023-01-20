package logica.manejadores;

import logica.entidades.Usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManejadorUsuario {
    private static ManejadorUsuario instanciaUsuario;

    private Map<String, Usuario> usuarios;

    private ManejadorUsuario() {
        usuarios = new HashMap<>();
    }

    public static ManejadorUsuario getInstanciaUsuario(){
        if (instanciaUsuario == null){
            instanciaUsuario = new ManejadorUsuario();
        }
        return instanciaUsuario;
    }

    public void addUser(Usuario user){
        usuarios.put(user.getNickname(), user);
    }
    public Usuario getUser(String nickname){
        return usuarios.get(nickname);
    }
    public List<Usuario> getAllUsers(){
        return new ArrayList<>(usuarios.values());
    }
    public boolean existUser(String nickname){
        return usuarios.containsKey(nickname);
    }
}