package com.ta34.repository;

import com.ta34.model.Empleado;
import com.ta34.model.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List; 

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    List<Empleado> findByTrabajo(Trabajo trabajo);
}
