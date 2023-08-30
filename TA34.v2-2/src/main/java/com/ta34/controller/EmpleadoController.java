package com.ta34.controller;

import java.util.List;
import com.ta34.dto.EmpleadoDTO;
import com.ta34.model.Empleado;
import com.ta34.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/empleados")
    public List<EmpleadoDTO> listarEmpleados() {
        return empleadoService.obtenerTodosLosEmpleados();
    }

    @PostMapping("/empleados")
    public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.guardarEmpleado(empleado);
    }

    @GetMapping("/empleados/{id}")
    public Empleado obtenerEmpleadoPorId(@PathVariable Long id) {
        return empleadoService.obtenerEmpleadoPorId(id);
    }

    @PutMapping("/empleados/{id}")
    public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleado) {
        return empleadoService.actualizarEmpleado(id, empleado);
    }

    @DeleteMapping("/empleados/{id}")
    public void eliminarEmpleado(@PathVariable Long id) {
        empleadoService.eliminarEmpleado(id);
    }

    @GetMapping("/empleados/trabajo/{trabajo}")
    public List<EmpleadoDTO> obtenerEmpleadosPorTrabajo(@PathVariable String trabajo) {
        return empleadoService.obtenerEmpleadosPorTrabajo(trabajo);
    }
}

