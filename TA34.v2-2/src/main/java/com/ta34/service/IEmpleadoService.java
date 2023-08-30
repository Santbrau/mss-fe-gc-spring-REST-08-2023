package com.ta34.service;

import java.util.List;
import com.ta34.dto.EmpleadoDTO;
import com.ta34.model.Empleado;

public interface IEmpleadoService {

    List<EmpleadoDTO> obtenerTodosLosEmpleados();

    Empleado guardarEmpleado(Empleado empleado);

    Empleado obtenerEmpleadoPorId(Long id);

    Empleado actualizarEmpleado(Long id, Empleado empleado);

    void eliminarEmpleado(Long id);

    List<EmpleadoDTO> obtenerEmpleadosPorTrabajo(String trabajo);
}
