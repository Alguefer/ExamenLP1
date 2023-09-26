package Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.EntityEmpleado.Empleado;
import Service.EmpleadoService;

@RestController
@RequestMapping

public class Controlador {
	@Autowired
	private EmpleadoService service;
	
	@GetMapping("/listar")
	public String listar (Empleado empleado)  {
		List<Empleado>empleados=service.listar();
		empleado.addAtribute("empleado", empleados);
		return "index";
	}
	
	


}
