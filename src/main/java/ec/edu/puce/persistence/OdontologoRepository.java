package ec.edu.puce.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.webmarket.restful.domain.Odontologo;

@Repository
public interface OdontologoRepository extends JpaRepository<Odontologo, String> { }

