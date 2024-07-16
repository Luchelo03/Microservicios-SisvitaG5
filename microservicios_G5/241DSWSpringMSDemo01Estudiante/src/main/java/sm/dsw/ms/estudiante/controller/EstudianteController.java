package sm.dsw.ms.estudiante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import sm.dsw.ms.estudiante.model.Estudiante;
import sm.dsw.ms.estudiante.service.EstudianteService;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/all")
    public ResponseEntity<List<Estudiante>> findAll() {
        return ResponseEntity.ok(estudianteService.findAll());
    }

    @PostMapping("/add")
    public ResponseEntity<Estudiante> addEstudiante(@RequestBody Estudiante estudiante) {
        return ResponseEntity.ok(estudianteService.save(estudiante));
    }

    @PutMapping("/update")
    public ResponseEntity<Estudiante> updateEstudiante(@RequestBody Estudiante estudiante) {
        return ResponseEntity.ok(estudianteService.save(estudiante));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEstudiante(@PathVariable Integer id) {
        estudianteService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/codigo/{codigoEstudiante}")
    public ResponseEntity<List<Estudiante>> getEstudiantesByCodigoEstudiante(@PathVariable String codigoEstudiante) {
        List<Estudiante> estudiantes = estudianteService.findByCodigoEstudiante(codigoEstudiante);
        return ResponseEntity.ok().body(estudiantes);
    }
}