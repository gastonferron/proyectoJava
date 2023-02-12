package logica.controladores;

import logica.DTs.DTDepartamento;
import logica.DTs.DTSalida;
import logica.excepeciones.ActividadExiste;
import logica.excepeciones.EntidadExiste;
import logica.excepeciones.EntidadNoExiste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public interface IControladorActividadTuristica {

    public void altaDepartamento(String nombre, String descripcion, String url) throws EntidadExiste;

    public DTDepartamento obtenerDepartamento(String idDepartamento) throws EntidadNoExiste;

    public List<DTDepartamento> obtenerAllDepartamentos();

    public void altaActividad(String idActividad, String descripcion, String idProveedor, LocalTime duracionHoras, int costo, String ciudad, LocalDate fechaAlta, String idDepartamento)  throws ActividadExiste;

    public List<DTSalida> obtenerSalidas(String idActividades) throws EntidadNoExiste;

    public void obtenerTuristicas();

    public void inscripcionTuristicas(String nickname, String idSalida, int cantTuristicas, LocalDateTime fecha) throws EntidadExiste;

}
