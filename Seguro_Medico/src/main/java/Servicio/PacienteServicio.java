package Servicio;

import Entidad.Paciente;
import Repositorio.PacienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServicio {

    @Autowired
    private PacienteRepositorio pacienteRepositorio;

    public List<Paciente> listaPacientes(){
        return pacienteRepositorio.findAll();
    }
}
