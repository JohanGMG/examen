package ec.edu.puce.api.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.puce.domain.Paciente;
import ec.edu.puce.service.PacienteService;


@RestController
@RequestMapping("/api/pacientes")
public class PacienteControler {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> obtenerTodos() {
        return pacienteService.obtenerTodos();
    }

    @PostMapping
    public Paciente guardar(@RequestBody Paciente paciente) {
        return pacienteService.guardar(paciente);
    }

    @GetMapping("/{cedula}")
    public ResponseEntity<Paciente> obtenerPorCedula(@PathVariable String cedula) {
        return pacienteService.obtenerPorCedula(cedula)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{cedula}")
    public ResponseEntity<Void> eliminar(@PathVariable String cedula) {
        pacienteService.eliminar(cedula);
        return ResponseEntity.ok().build();
    }
}
