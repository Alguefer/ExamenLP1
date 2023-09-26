package Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.EntityEmpleado.Empleado;

@Service
public class EmpleadoImplements implements EmpleadoService {
	
	@Autowired
	private EmpleadoService data;

	@Override
	public List<Empleado> listar() {
		
		return (List<Empleado>)data.findAll();
	}

	@Override
	public Optional<Empleado> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Empleado save(Empleado empleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empleado> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
