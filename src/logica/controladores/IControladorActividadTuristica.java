package logica.controladores;

import logica.DTs.DTSalida;
import logica.excepeciones.ActividadExiste;
import logica.excepeciones.EntidadExiste;
import logica.excepeciones.EntidadNoExiste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface IControladorActividadTuristica {

    public void altaDepartamento(String nombre, String descripcion, String url) throws EntidadExiste;

    public void verDepartamento(String idDepartamento);

    public void verAllDepartamentos();

    public void altaActividad(String nombreActividad, String descripcion, String lugarSalida, String proveedor, int duracionHoras, int costo, String ciudad, LocalDate fechaAlta) throws ActividadExiste;

    public List<DTSalida> obtenerSalidas(String idActividades) throws EntidadNoExiste;

    public void obtenerTuristicas();

    public void inscripcionTuristicas(String nickname, String idSalida, int cantTuristicas, LocalDateTime fecha) throws EntidadExiste;

}
