package logica.entidades;

import java.util.Date;

public class Compra {
    private Date fecha;
    private static int cantidadTuristas;
    private int costoTotal;
    private Date vencimiento;

    public Compra() {
    }

    public Compra(Date fecha, int costoTotal, Date vencimiento) {
        this.fecha = fecha;
        this.costoTotal = costoTotal;
        this.vencimiento = vencimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public static int getCantidadTuristas() {
        return cantidadTuristas;
    }

    public static void setCantidadTuristas(int cantidadTuristas) {
        Compra.cantidadTuristas = cantidadTuristas;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }
}
