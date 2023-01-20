package presentacion;

import logica.controladores.ControladorUsuario;
import logica.entidades.Usuario;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean salida = false;
        String teclado;
        ControladorUsuario usuario = new ControladorUsuario();

        while (!salida){
            System.out.println("Welcome wachin");
            System.out.println("Elige una opcion");

            System.out.println("Opcion 1: Alta proveedor");
            System.out.println("Opcion 2: Alta Turista");
            System.out.println("Opcion 3: Ver Usuarios");

            teclado = consola.nextLine();

            switch (teclado){
                case 1:
                    usuario.altaProveedor(teclado, teclado, teclado, teclado, teclado, teclado,teclado);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Elija una de las 3 opciones");
                    break;
            }
        }
    }
}
