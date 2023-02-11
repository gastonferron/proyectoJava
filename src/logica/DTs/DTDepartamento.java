package logica.DTs;

import logica.entidades.Actividad;

import java.util.ArrayList;
import java.util.List;

public class DTDepartamento {
    private String nombreDepartamento;
    private String descripcion;
    private String url;
    private List<Actividad> actividads;

    public DTDepartamento(String nombreDepartamento, String descripcion, String url) {
        actividads = new ArrayList<>();
        this.nombreDepartamento = nombreDepartamento;
        this.descripcion = descripcion;
        this.url = url;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUrl() {
        return url;
    }

    public List<Actividad> getActividads() {
        return actividads;
    }
}
