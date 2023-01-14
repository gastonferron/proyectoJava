package logica.entidades;

public class Paquete {
    private String nombrePaquete;
    private String descripcion;
    private String actividadesTuristicas[];
    private int descuento;

    public Paquete() {
    }

    public Paquete(String nombrePaquete, String descripcion, String[] actividadesTuristicas, int descuento) {
        this.nombrePaquete = nombrePaquete;
        this.descripcion = descripcion;
        this.actividadesTuristicas = actividadesTuristicas;
        this.descuento = descuento;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getActividadesTuristicas() {
        return actividadesTuristicas;
    }

    public void setActividadesTuristicas(String[] actividadesTuristicas) {
        this.actividadesTuristicas = actividadesTuristicas;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
