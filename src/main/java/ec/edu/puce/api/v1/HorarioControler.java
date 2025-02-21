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

import ec.edu.puce.domain.Horario;
import ec.edu.puce.service.HorarioService;


@RestController
@RequestMapping("/api/horarios")
public class HorarioControler {
    @Autowired
    private HorarioService horarioService;

    @GetMapping
    public List<Horario> obtenerTodos() {
        return horarioService.obtenerTodos();
    }

    @PostMapping
    public Horario guardar(@RequestBody Horario horario) {
        return horarioService.guardar(horario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Horario> obtenerPorId(@PathVariable Long id) {
        return horarioService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        horarioService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
