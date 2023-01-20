package logica.manejadores;

import logica.entidades.Paquete;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManejadorPaquete {
    private static ManejadorPaquete instanciaPaquete;

    private Map<String, Paquete> paquetes;

    private ManejadorPaquete() {
        paquetes = new HashMap<>();
    }

    public static ManejadorPaquete getInstanciaDepartamento(){
        if (instanciaPaquete == null){
            instanciaPaquete = new ManejadorPaquete();
        }
        return instanciaPaquete;
    }

    public void addPaquete(Paquete paquete){
        paquetes.put(paquete.getNombrePaquete(), paquete);
    }
    public Paquete getPaquete(String idPaquete){
        return paquetes.get(idPaquete);
    }
    public List<Paquete> getAllPaquetes(){
        return new ArrayList<>(paquetes.values());
    }
    public boolean existPaquete(String idPaquete){
        return paquetes.containsKey(idPaquete);
    }
}
