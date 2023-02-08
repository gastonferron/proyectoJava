package presentacion;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        MetodosMain mm = new MetodosMain();
        boolean salida = false;

        while (!salida){
            System.out.println("Welcome wachin");
            System.out.println("Elija una opcion");

            System.out.println("Menu");
            System.out.println("Opcion 1: Alta de Usuario");
            System.out.println("Opcion 2: Consulta de Usuario");
            System.out.println("Opcion 3: Modificar Datos de Usuario");
            System.out.println("Opcion 4: Alta Actividad Turistica");
            System.out.println("Opcion 5: Consulta Actividad Turistica");
            System.out.println("Opcion 6: Alta Salida Turistica");
            System.out.println("Opcion 7: Consulta Salida Turistica");
            System.out.println("Opcion 8: Inscripcion Salida Turistica");
            System.out.println("Opcion 9: Alta Departamento");

            int opciones = consola.nextInt();

            switch (opciones){
                case 1:

                    break;
                case 2:
                    break;
                case 9:
                    mm.altaDepto();
                    break;
                default:
                    System.out.println("Elija una opcione valida");
                    break;
            }
        }
    }

    private static String ingresarString(String textoAMostrar){
        try (Scanner sc = new Scanner(System.in)){
           return sc.nextLine();
        } catch (Exception e){
            return null;
        }
    }
}
