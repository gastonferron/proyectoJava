package logica.entidades;

public class Departamento {
    private String nombreDepartamento;
    private String descripcion;
    private String url;

    public Departamento() {
    }

    public Departamento(String nombreDepartamento, String descripcion, String url) {
        this.nombreDepartamento = nombreDepartamento;
        this.descripcion = descripcion;
        this.url = url;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
