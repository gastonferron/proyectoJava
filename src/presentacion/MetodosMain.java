package presentacion;

import logica.controladores.Fabrica;
import logica.controladores.IControladorActividadTuristica;
import logica.controladores.IControladorUsuario;
import logica.excepeciones.EntidadExiste;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class MetodosMain {

    public void altaDepto(){

        Scanner entrada = new Scanner(System.in);

        Fabrica fabrica = Fabrica.getInstanciaFabrica();
        IControladorActividadTuristica icAct = fabrica.getIControladorActividadTuristica();

        System.out.println("Ingrese nombre del Departamento");
        String nomDep = entrada.nextLine();

        System.out.println("Ingrese la descripcion del Departamento");
        String descDep = entrada.nextLine();

        System.out.println("Ingrese el URL del Departamento");
        String url = entrada.nextLine();

        try {
            icAct.altaDepartamento(nomDep, nomDep,url);
        }catch (EntidadExiste e){
            System.out.println("Ya existe el Departamento");
        }
    }

    public void altaUsuario(){

        Scanner entrada = new Scanner(System.in);
        Fabrica fabrica = Fabrica.getInstanciaFabrica();
        IControladorUsuario iCU = fabrica.getIControladorUsuario();

        System.out.println("Ingrese que tipo de usuario quiere dar de alta");
        System.out.println("Opcion 1: Alta de Turista");
        System.out.println("Opcion 2: Alta de Proveedor");
        int opcion = entrada.nextInt();
        switch (opcion){
            case 1:
                altaTurista();
                break;
            case 2:
                altaProveedor();
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }

    }
    public void altaTurista(){
        Scanner entrada = new Scanner(System.in);
        Fabrica fabrica = Fabrica.getInstanciaFabrica();
        IControladorUsuario iCU = fabrica.getIControladorUsuario();

        System.out.println("Ingrese el nombre de usuario (nickname) del Turista");
        String nickname = entrada.nextLine();

        System.out.println("Ingrese el nombre del turista");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido");
        String apellido = entrada.nextLine();

        System.out.println("Ingrese email");
        String email = entrada.nextLine();

        System.out.println("Ingrese su nacionalidad");
        String nacionalidad = entrada.nextLine();

        System.out.println("Ingrese su fecha de nacimiento");

        System.out.println("Ingrese el año");
        int anio = entrada.nextInt();

        System.out.println("Ingrese el mes");
        int mes = entrada.nextInt();

        System.out.println("Ingrese el dia");
        int dia = entrada.nextInt();

        LocalDate fechanac = LocalDate.of(anio , mes , dia);

        try{
            iCU.altaTurista(nickname, nombre, apellido, email, LocalDate.parse(fechanac.toString()), nacionalidad);
        }catch (EntidadExiste e){
            System.out.println("Ese usuario ya esta ingresado");
        }
    }
    public void altaProveedor(){
        Scanner entrada = new Scanner(System.in);
        Fabrica fabrica = Fabrica.getInstanciaFabrica();
        IControladorUsuario iCU = fabrica.getIControladorUsuario();

        System.out.println("Ingrese el nombre de usuario (nickname) del Proveedor");
        String nickname = entrada.nextLine();

        System.out.println("Ingrese el nombre");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido");
        String apellido = entrada.nextLine();

        System.out.println("Ingrese email");
        String email = entrada.nextLine();

        System.out.println("Ingrese una descripcion");
        String desc = entrada.nextLine();

        System.out.println("Ingrese la url");
        String url = entrada.nextLine();

        System.out.println("Ingrese su fecha de nacimiento");

        System.out.println("Ingrese el año");
        int anio = entrada.nextInt();

        System.out.println("Ingrese el mes");
        int mes = entrada.nextInt();

        System.out.println("Ingrese el dia");
        int dia = entrada.nextInt();

        LocalDate fechanac = LocalDate.of(anio , mes , dia);

        try {
            iCU.altaProveedor(nickname, nombre, apellido, email, desc, url, fechanac);
        }catch (EntidadExiste e){
            System.out.println("Ese Proveedor ya existe");
        }
    }
}
