package com.ta34.controller;

import com.ta34.model.Empleado;
import com.ta34.model.Trabajo;
import com.ta34.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        Trabajo trabajo = empleado.getTrabajo();
        empleado.setSalario(trabajo.getSalario());
        return empleadoRepository.save(empleado);
    }

    @GetMapping
    public List<Empleado> obtenerEmpleados() {
        return empleadoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable Long id) {
        Optional<Empleado> empleado = empleadoRepository.findById(id);
        return empleado.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleadoActualizado) {
        Optional<Empleado> empleadoExistente = empleadoRepository.findById(id);
        if (empleadoExistente.isPresent()) {
            Empleado empleado = empleadoExistente.get();
            empleado.setNombre(empleadoActualizado.getNombre());
            empleado.setTrabajo(empleadoActualizado.getTrabajo());
            empleado.setSalario(empleadoActualizado.getTrabajo().getSalario()); // Actualizar salario si cambia el trabajo
            empleadoRepository.save(empleado);
            return ResponseEntity.ok(empleado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEmpleado(@PathVariable Long id) {
        empleadoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/trabajo/{trabajo}")
    public List<Empleado> obtenerEmpleadosPorTrabajo(@PathVariable Trabajo trabajo) {
        return empleadoRepository.findByTrabajo(trabajo);
    }
}
