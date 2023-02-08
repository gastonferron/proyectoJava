package logica.DTs;

import logica.entidades.Actividad;

import java.time.LocalDate;
import java.util.List;

public class DTProveedor extends DTUsuario{
    private String descripcionGeneral;
    private String link;
    private List<Actividad> actividads;

    public DTProveedor(String nickname, String nombreUsuario, String apellido, String email, LocalDate fechaNac, String descripcionGeneral, String link, List<Actividad> actividads) {
        super(nickname, nombreUsuario, apellido, email, fechaNac);
        this.descripcionGeneral = descripcionGeneral;
        this.link = link;
        this.actividads = actividads;
    }

    public String getDescripcionGeneral() {
        return descripcionGeneral;
    }

    public String getLink() {
        return link;
    }

    public List<Actividad> getActividads() {
        return actividads;
    }
}
