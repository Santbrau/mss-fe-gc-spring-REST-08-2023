package com.ta34.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ta34.model.Empleado;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmpleadoDAO extends JpaRepository<Empleado, Long> {
	public List<Empleado> findByTrabajo(String nombre);
}
