package logica.controladores;

public class Fabrica {

    private static Fabrica instanciaFabrica;

    private Fabrica() {
    }

    public static Fabrica getInstanciaFabrica(){
        if (instanciaFabrica == null){
            instanciaFabrica = new Fabrica();
        }
        return instanciaFabrica;
    }

    public IControladorActividadTuristica getIControladorActividadTuristica(){
        return new ControladorActividadTuristica();
    }
    public IControladorUsuario getIControladorUsuario(){
        return new ControladorUsuario();
    }
}
