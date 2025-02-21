package ec.edu.puce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.webmarket.restful.domain.Odontologo;
import ec.webmarket.restful.persistence.OdontologoRepository;

@Service
public class OdontologoService {
    @Autowired
    private OdontologoRepository odontologoRepository;

    public List<Odontologo> obtenerTodos() {
        return odontologoRepository.findAll();
    }

    public Odontologo guardar(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }

    public Optional<Odontologo> obtenerPorCedula(String cedula) {
        return odontologoRepository.findById(cedula);
    }

    public void eliminar(String cedula) {
        odontologoRepository.deleteById(cedula);
    }
}

