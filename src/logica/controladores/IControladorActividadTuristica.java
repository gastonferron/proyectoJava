package logica.controladores;

import logica.excepeciones.EntidadExiste;

public interface IControladorActividadTuristica {

    public void altaDepartamento(String nombre, String descripcion, String url) throws EntidadExiste;

}
