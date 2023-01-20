package logica.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Proveedor extends Usuario{
    private String descripcionGeneral;
    private String link;

    private List<Actividad> actividads;

    public Proveedor() {
        super();
        actividads = new ArrayList<>();
    }

    public Proveedor(String nickname, String nombreUsuario, String apellido, String email, LocalDate fechaNac, String descripcionGeneral, String link) {
        super(nickname, nombreUsuario, apellido, email, fechaNac);
        actividads = new ArrayList<>();
        this.descripcionGeneral = descripcionGeneral;
        this.link = link;
    }

    public String getDescripcionGeneral() {
        return descripcionGeneral;
    }

    public void setDescripcionGeneral(String descripcionGeneral) {
        this.descripcionGeneral = descripcionGeneral;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Actividad> getActividads() {
        return actividads;
    }

    public void setActividads(List<Actividad> actividads) {
        this.actividads = actividads;
    }
}
