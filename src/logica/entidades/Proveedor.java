package logica.entidades;

public class Proveedor extends Usuario{
    private String descripcionGeneral;
    private String link;

    public Proveedor() {

    }

    public Proveedor(String nickname, String nombreUsuario, String apellido, String email, int fechaNac, String descripcionGeneral, String link) {
        super(nickname, nombreUsuario, apellido, email, fechaNac);
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
}
