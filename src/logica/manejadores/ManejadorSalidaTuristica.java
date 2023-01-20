package logica.manejadores;

import logica.entidades.Salida;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManejadorSalidaTuristica {
    private static ManejadorSalidaTuristica instanciaTuristica;

    private Map<String, Salida> salidas;

    private ManejadorSalidaTuristica (){
        salidas = new HashMap<>();
    }

    public static ManejadorSalidaTuristica getInstanciaTuristica(){
        if (instanciaTuristica == null){
            instanciaTuristica = new ManejadorSalidaTuristica();
        }
        return instanciaTuristica;
    }

    public void addSalida(Salida salida){
        salidas.put(salida.getNombreSalida(), salida);
    }
    public Salida getActividad(String idSalida){
        return salidas.get(idSalida);
    }
    public List<Salida> allSalidas(){
        return new ArrayList<>(salidas.values());
    }
    public boolean existActividad(String idSalida){
        return salidas.containsKey(idSalida);
    }
}
