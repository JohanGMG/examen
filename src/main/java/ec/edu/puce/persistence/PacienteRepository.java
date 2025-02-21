package ec.edu.puce.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.webmarket.restful.domain.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, String> { }

