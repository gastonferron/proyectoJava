package logica.manejadores;

import logica.entidades.Departamento;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManejadorDepartamento {
    private static ManejadorDepartamento instanciaDepartamento;

    private Map<String, Departamento> departamentos;

    private ManejadorDepartamento() {
        departamentos = new HashMap<>();
    }

    public static ManejadorDepartamento getInstanciaDepartamento(){
        if (instanciaDepartamento == null){
            instanciaDepartamento = new ManejadorDepartamento();
        }
        return instanciaDepartamento;
    }

    public void addDepartamento(Departamento departamento){
        departamentos.put(departamento.getNombreDepartamento(), departamento);
    }
    public Departamento getDepartamento(String idDepartamento){
        return departamentos.get(idDepartamento);
    }
    public List<Departamento> getAllDepartamentos(){
        return new ArrayList<>(departamentos.values());
    }
    public boolean existDepartamento(String idDepartamento){
        return departamentos.containsKey(idDepartamento);
    }
}
