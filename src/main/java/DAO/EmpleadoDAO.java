package DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.EntityEmpleado.Empleado;

@Repository
public interface EmpleadoDAO extends JpaRepository<Empleado, Integer> {

}
