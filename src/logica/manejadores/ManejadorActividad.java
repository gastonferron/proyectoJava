package logica.manejadores;

import logica.entidades.Actividad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManejadorActividad {
    private static ManejadorActividad instanciaActividad;

    private Map<String, Actividad> actividades;

    private ManejadorActividad (){
        actividades = new HashMap<>();
    }

    public static ManejadorActividad getInstanciaActividad(){
        if (instanciaActividad == null){
            instanciaActividad = new ManejadorActividad();
        }
        return instanciaActividad;
    }

    public void addActividad(Actividad actividad){
        actividades.put(actividad.getNombreActividad(), actividad);
    }
    public Actividad getActividad(String idActividad){
        return actividades.get(idActividad);
    }
    public List<Actividad> allActividad(){
        return new ArrayList<>(actividades.values());
    }
    public boolean existActividad(String idActividad){
        return actividades.containsKey(idActividad);
    }
}
