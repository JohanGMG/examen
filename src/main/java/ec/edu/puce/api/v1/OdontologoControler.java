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

import ec.edu.puce.domain.Odontologo;
import ec.edu.puce.service.OdontologoService;


@RestController
@RequestMapping("/api/odontologos")
public class OdontologoControler {
    @Autowired
    private OdontologoService odontologoService;

    @GetMapping
    public List<Odontologo> obtenerTodos() {
        return odontologoService.obtenerTodos();
    }

    @PostMapping
    public Odontologo guardar(@RequestBody Odontologo odontologo) {
        return odontologoService.guardar(odontologo);
    }

    @GetMapping("/{cedula}")
    public ResponseEntity<Odontologo> obtenerPorCedula(@PathVariable String cedula) {
        return odontologoService.obtenerPorCedula(cedula)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{cedula}")
    public ResponseEntity<Void> eliminar(@PathVariable String cedula) {
        odontologoService.eliminar(cedula);
        return ResponseEntity.ok().build();
    }
}

