package logica.controladores;

import logica.DTs.DTActividad;
import logica.DTs.DTDepartamento;
import logica.DTs.DTSalida;
import logica.entidades.Actividad;
import logica.entidades.Departamento;
import logica.entidades.Proveedor;
import logica.entidades.Salida;
import logica.excepeciones.ActividadExiste;
import logica.excepeciones.EntidadExiste;
import logica.excepeciones.EntidadNoExiste;
import logica.manejadores.ManejadorActividad;
import logica.manejadores.ManejadorDepartamento;
import logica.manejadores.ManejadorSalidaTuristica;
import logica.manejadores.ManejadorUsuario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ControladorActividadTuristica implements IControladorActividadTuristica{

    @Override
    public void altaActividad(String idActividad, String descripcion, String idProveedor, LocalTime duracionHoras, int costo, String ciudad, LocalDate fechaAlta, String idDepartamento) throws ActividadExiste {
        ManejadorActividad manejadorAct = ManejadorActividad.getInstanciaActividad();
        ManejadorDepartamento manejadorDepa = ManejadorDepartamento.getInstanciaDepartamento();
        ManejadorUsuario manejadorUsuario = ManejadorUsuario.getInstanciaUsuario();

        if (manejadorAct.existActividad(idActividad)){
            throw new ActividadExiste("La actividad ya ha sido creada");
        }
        else{
            Actividad actividad = new Actividad(idActividad, descripcion,duracionHoras, costo, ciudad, fechaAlta);
            manejadorAct.addActividad(actividad);
            manejadorDepa.getDepartamento(idDepartamento).addActividad(actividad);
            ( (Proveedor) manejadorUsuario.getUser ( idProveedor ) ).addActividad(actividad);
        }
    }

    public DTActividad obtenerActividad(String idActividad) throws EntidadNoExiste{

        ManejadorActividad mAct = ManejadorActividad.getInstanciaActividad();
        Actividad act = mAct.getActividad(idActividad);
        if (act == null){
            throw new EntidadNoExiste("No existe esa Actividad");
        }
        else{
            return act.obtenerDTActividad();
        }
    }

    public List<DTActividad> obtenerAllActividades(){

        ManejadorActividad mAct = ManejadorActividad.getInstanciaActividad();
        List<Actividad> lista = mAct.allActividad();
        List<DTActividad> listaAct = new ArrayList<>();

        for (Actividad actividad: lista) {
            listaAct.add(actividad.obtenerDTActividad());
        }
        return listaAct;
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
    public DTDepartamento obtenerDepartamento(String idDepartamento) throws EntidadNoExiste{
        ManejadorDepartamento manejadorDepa = ManejadorDepartamento.getInstanciaDepartamento();
        Departamento depa = manejadorDepa.getDepartamento(idDepartamento);
        if (depa == null){
            throw new EntidadNoExiste("No existe el Departamento");
        }
        return depa.obtenerDTDepartamento();
    }

    @Override
    public List<DTDepartamento> obtenerAllDepartamentos() {
        ManejadorDepartamento manejadorDepa = ManejadorDepartamento.getInstanciaDepartamento();
        List<Departamento> lista = manejadorDepa.getAllDepartamentos();
        List<DTDepartamento> listaDepartamentos = new ArrayList<>();

        for (Departamento depas:lista) {
            listaDepartamentos.add(depas.obtenerDTDepartamento());
        }
        return listaDepartamentos;
    }

    @Override
    public List<DTSalida> obtenerSalidas(String idActividades) throws EntidadNoExiste {
        ManejadorActividad mActvidades = ManejadorActividad.getInstanciaActividad();
        Actividad actividad = mActvidades.getActividad(idActividades);
        if (actividad == null){
            throw new EntidadNoExiste("La salida no existe");
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
        throw new EntidadExiste("a");
    }
}