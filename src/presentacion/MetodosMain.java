package presentacion;

import logica.DTs.*;
import logica.controladores.Fabrica;
import logica.controladores.IControladorActividadTuristica;
import logica.controladores.IControladorUsuario;
import logica.excepeciones.ActividadExiste;
import logica.excepeciones.EntidadExiste;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class MetodosMain {

    public void altaDepartamento(){

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
            icAct.altaDepartamento(nomDep, descDep,url);
        }catch (EntidadExiste e){
            System.out.println("Ya existe el Departamento");
        }
    }

    public void altaUsuario(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese que tipo de usuario quiere dar de alta");
        System.out.println("Opcion 1: Alta de Turista");
        System.out.println("Opcion 2: Alta de Proveedor");
        int opcion = entrada.nextInt();
        if (opcion == 1){
            altaTurista();
        } else if (opcion == 2) {
            altaProveedor();
        }else {
            System.out.println("Opcion no valida");
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

    public List<DTUsuario>  consultaUsuario (){

        Scanner entrada = new Scanner(System.in);
        Fabrica fabrica = Fabrica.getInstanciaFabrica();
        IControladorUsuario iCU = fabrica.getIControladorUsuario();
        List<DTUsuario> allUsers = iCU.obtenerAllUsers();

        int contador = 0;
        System.out.println("Lista de todos los usuarios");
        for (DTUsuario dtu: allUsers) {
            System.out.println("[" + contador + "]" + " : " + dtu.getNickname());
            contador ++;
        }
        System.out.println("Elija a uno de los usuarios");

        int eleccion = entrada.nextInt();

        DTUsuario usuario = allUsers.get(eleccion);

        System.out.println("Usuario " + usuario.getNickname());
        System.out.println("Nombre " + usuario.getNombreUsuario());
        System.out.println("Apellido " + usuario.getApellido());
        System.out.println("Email " + usuario.getEmail());
        System.out.println("Fecha de nacimiento " + usuario.getFechaNac());

        if(usuario instanceof DTProveedor){
            System.out.println("Descripcion " + ((DTProveedor) usuario).getDescripcionGeneral());
            System.out.println("Link: " + ((DTProveedor) usuario).getLink());
            System.out.println("Actividades a la que pertenece" + ((DTProveedor) usuario).getActividads());
        } else if (usuario instanceof DTTurista) {
            System.out.println("Nacionalidad" + ((DTTurista) usuario).getNacionalidad());
        }else{
            System.out.println("El tipo de usuario no esta definido corractamente");
        }return null;
    }

    public void modificarDatosUsuario(){}
    public void altaDeActividadTuristica(){

        Scanner entrada = new Scanner(System.in);
        Fabrica fabrica = Fabrica.getInstanciaFabrica();
        IControladorUsuario iCU = fabrica.getIControladorUsuario();
        List<DTProveedor> allProveedores = iCU.obtenerAllProveedores();
        IControladorActividadTuristica iCAT = fabrica.getIControladorActividadTuristica();
        List<DTDepartamento> allDepartamentos = iCAT.obtenerAllDepartamentos();

        int contador = 0;
        System.out.println("Lista de todos los Proveedores");
        for (DTProveedor dtp: allProveedores) {
            System.out.println("[" + contador + "]" + " : " + dtp.getNickname());
            contador ++;
        }
        System.out.println("Elija un Proveedor");
        int eleccion = entrada.nextInt();
        DTProveedor proveedor = allProveedores.get(eleccion);

        contador = 0;
        System.out.println("Lista de todos los Departamentos");
        for (DTDepartamento dtd: allDepartamentos) {
            System.out.println("[" + contador + "]" + " : " + dtd.getNombreDepartamento());
            contador ++;
        }
        System.out.println("Elija un Departamento");
        eleccion = entrada.nextInt();
        DTDepartamento departamento = allDepartamentos.get(eleccion);

        System.out.println("Ingrese el nombre de la actividad");
        String idActividad = entrada.nextLine();

        System.out.println("Ingrese la descripcion de la actividad");
        String desc = entrada.nextLine();

        System.out.println("Ingrese cuanto va a durar la actividad (horas)");
        int hora = entrada.nextInt();

        LocalTime duracionHoras = LocalTime.of(hora , 0);

        System.out.println("Ingrese cuanto va a costar");
        int costo = entrada.nextInt();

        System.out.println("Ingrese la ciudad en la que se va a realizar la actividad");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese el año");
        int anio = entrada.nextInt();

        System.out.println("Ingrese el mes");
        int mes = entrada.nextInt();

        System.out.println("Ingrese el dia");
        int dia = entrada.nextInt();

        LocalDate fechaAlta = LocalDate.of(anio , mes , dia);

        try {
            iCAT.altaActividad(idActividad , desc, proveedor.getNickname(), duracionHoras, costo, ciudad, fechaAlta, departamento.getNombreDepartamento());
        }catch (ActividadExiste e){
            System.out.println("La actividad ya ha sido creada");
        }
    }

    public void altaSalidaTuristica(){
        Scanner entrada = new Scanner(System.in);
        Fabrica fabrica = Fabrica.getInstanciaFabrica();
        IControladorActividadTuristica iCAT = fabrica.getIControladorActividadTuristica();
        List<DTActividad> allDepartamentos = iCAT.obtenerAllActividades();
    }

    public void inscripcionSalida(){

    }

}