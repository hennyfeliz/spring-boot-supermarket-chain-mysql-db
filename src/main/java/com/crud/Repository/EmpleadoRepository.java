package com.crud.Repository;

import com.crud.Models.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleados, Integer> {
}
