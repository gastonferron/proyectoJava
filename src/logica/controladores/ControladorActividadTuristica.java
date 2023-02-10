package logica.controladores;

import logica.DTs.DTSalida;
import logica.entidades.Actividad;
import logica.entidades.Departamento;
import logica.entidades.Salida;
import logica.excepeciones.ActividadExiste;
import logica.excepeciones.EntidadExiste;
import logica.excepeciones.EntidadNoExiste;
import logica.manejadores.ManejadorActividad;
import logica.manejadores.ManejadorDepartamento;
import logica.manejadores.ManejadorSalidaTuristica;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ControladorActividadTuristica implements IControladorActividadTuristica{

    @Override
    public void altaActividad(String nombreActividad, String descripcion, String lugarSalida, String proveedor, int duracionHoras, int costo, String ciudad, LocalDate fechaAlta) throws ActividadExiste {
        ManejadorActividad manejadorAct = ManejadorActividad.getInstanciaActividad();
        if (manejadorAct.existActividad(nombreActividad)){
            throw new ActividadExiste("La actividad ya ha sido creada");
        }
        else{
            Actividad actividad = new Actividad(lugarSalida, proveedor, nombreActividad, descripcion,duracionHoras, costo, ciudad, fechaAlta);
            manejadorAct.addActividad(actividad);
        }
    }

    @Override
    public void altaDepartamento(String nombre, String descripcion, String url) throws EntidadExiste {

        ManejadorDepartamento manejadorDepa = ManejadorDepartamento.getInstanciaDepartamento();

        if (manejadorDepa.existDepartamento(nombre)){
            throw new EntidadExiste("El departamento ya ha sido creado");
        }
        else {
            Departamento depa = new Departamento(nombre, descripcion,url);
            manejadorDepa.addDepartamento(depa);
        }
    }

    @Override
    public void verDepartamento(String idDepartamento) {
        ManejadorDepartamento manejadorDepa = ManejadorDepartamento.getInstanciaDepartamento();
        manejadorDepa.getDepartamento(idDepartamento);
    }

    @Override
    public void verAllDepartamentos() {
        ManejadorDepartamento manejadorDepa = ManejadorDepartamento.getInstanciaDepartamento();
        manejadorDepa.getAllDepartamentos();
    }

    @Override
    public List<DTSalida> obtenerSalidas(String idActividades) throws EntidadNoExiste {
        ManejadorActividad mActvidades = ManejadorActividad.getInstanciaActividad();
        Actividad actividad = mActvidades.getActividad(idActividades);
        if (actividad == null){
            throw new EntidadNoExiste();
        }
        List<Salida> salidasAsociadas = actividad.getSalidas();
        List<DTSalida> listaDTSalidas = new ArrayList<>();
        for (Salida salida: salidasAsociadas) {
            listaDTSalidas.add(salida.obtenerDTSalida());
        }
        return listaDTSalidas;
    }

    @Override
    public void obtenerTuristicas() {
        ManejadorSalidaTuristica mSalturistica = ManejadorSalidaTuristica.getInstanciaTuristica();
        mSalturistica.allSalidas();
    }

    @Override
    public void inscripcionTuristicas(String nickname, String idSalida, int cantTuristicas, LocalDateTime fecha) throws EntidadExiste {

    }
}