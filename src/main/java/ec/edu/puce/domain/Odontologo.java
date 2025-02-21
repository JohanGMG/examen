package ec.edu.puce.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Odontologo {
    @Id
    private String cedula;
    private String nombre;
    private String apellido;
    private String especialidad;
    private String telefono;
    private String email;
}
