package Service;

import java.util.List;
import java.util.Optional;

import Entity.EntityEmpleado.Empleado;

public interface EmpleadoService {
	
	public List<Empleado>listar();
		
	public Optional<Empleado>listarId(int id);
	
	public Empleado save(Empleado empleado);
	
	public void deleteById(int Id);

	public List<Empleado> findAll();

	

}
