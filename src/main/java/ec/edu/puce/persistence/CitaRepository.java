package ec.edu.puce.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.webmarket.restful.domain.Cita;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> { }

