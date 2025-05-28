package com.umg.empleados.repository;

import com.umg.empleados.model.UEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UEmpleadoRepository extends JpaRepository<UEmpleado, String> {
}
