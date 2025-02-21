package ec.edu.puce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.webmarket.restful.domain.Cita;
import ec.webmarket.restful.persistence.CitaRepository;

@Service
public class CitaService {
    @Autowired
    private CitaRepository citaRepository;

    public List<Cita> obtenerTodas() {
        return citaRepository.findAll();
    }

    public Cita guardar(Cita cita) {
        return citaRepository.save(cita);
    }

    public Optional<Cita> obtenerPorId(Long id) {
        return citaRepository.findById(id);
    }

    public void eliminar(Long id) {
        citaRepository.deleteById(id);
    }
}

