package ec.edu.puce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.webmarket.restful.domain.Horario;
import ec.webmarket.restful.persistence.HorarioRepository;

@Service
public class HorarioService {
    @Autowired
    private HorarioRepository horarioRepository;

    public List<Horario> obtenerTodos() {
        return horarioRepository.findAll();
    }

    public Horario guardar(Horario horario) {
        return horarioRepository.save(horario);
    }

    public Optional<Horario> obtenerPorId(Long id) {
        return horarioRepository.findById(id);
    }

    public void eliminar(Long id) {
        horarioRepository.deleteById(id);
    }
}

