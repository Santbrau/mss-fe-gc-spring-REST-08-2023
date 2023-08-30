package com.ta34.service;

import java.util.List;
import java.util.stream.Collectors;
import com.ta34.dao.EmpleadoDAO;
import com.ta34.dto.EmpleadoDTO;
import com.ta34.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService implements IEmpleadoService {

    @Autowired
    private EmpleadoDAO empleadoRepository;

    @Override
    public List<EmpleadoDTO> obtenerTodosLosEmpleados() {
        List<Empleado> empleados = empleadoRepository.findAll();
        return empleados.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado obtenerEmpleadoPorId(Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public Empleado actualizarEmpleado(Long id, Empleado empleado) {
        Empleado empleadoExistente = empleadoRepository.findById(id).orElse(null);
        if (empleadoExistente != null) {
            empleadoExistente.setNombre(empleado.getNombre());
            empleadoExistente.setTrabajo(empleado.getTrabajo());
            empleadoExistente.setSalario(empleado.getSalario());
            return empleadoRepository.save(empleadoExistente);
        }
        return null; 
    }

    @Override
    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }

    @Override
    public List<EmpleadoDTO> obtenerEmpleadosPorTrabajo(String trabajo) {
        List<Empleado> empleados = empleadoRepository.findByTrabajo(trabajo);
        return empleados.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private EmpleadoDTO convertToDTO(Empleado empleado) {
        EmpleadoDTO dto = new EmpleadoDTO();
        dto.setId(empleado.getId());
        dto.setNombre(empleado.getNombre());
        dto.setTrabajo(empleado.getTrabajo());
        dto.setSalario(empleado.getSalario());
        return dto;
    }
}
