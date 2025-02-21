package ec.edu.puce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.webmarket.restful.domain.Paciente;
import ec.webmarket.restful.persistence.PacienteRepository;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> obtenerTodos() {
        return pacienteRepository.findAll();
    }

    public Paciente guardar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public Optional<Paciente> obtenerPorCedula(String cedula) {
        return pacienteRepository.findById(cedula);
    }

    public void eliminar(String cedula) {
        pacienteRepository.deleteById(cedula);
    }
}

