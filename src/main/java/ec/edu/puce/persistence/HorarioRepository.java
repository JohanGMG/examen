package ec.edu.puce.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.webmarket.restful.domain.Horario;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Long> { }
