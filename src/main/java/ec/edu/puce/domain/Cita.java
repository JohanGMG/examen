package ec.edu.puce.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fechaHora;
    private String estado;
    private String motivo;
    
    @ManyToOne
    private Paciente paciente;
    
    @ManyToOne
    private Odontologo odontologo;
    
    @OneToOne
    private Horario horario;
}
