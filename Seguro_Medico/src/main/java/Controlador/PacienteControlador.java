package Controlador;

import Servicio.PacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteControlador {
    @Autowired
    private PacienteServicio pacienteServicio;

    @GetMapping("/pacientes")
    public String verPacientes(Model model){
        model.addAttribute("verPacientes", pacienteServicio.listaPacientes());
        return "pacientes"; // nombre de la vista HTML
    }
}