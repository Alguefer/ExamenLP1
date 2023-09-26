package Entity;


import java.util.List;
import java.util.Optional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class EntityEmpleado {
	

	@Entity
	@Table(name = "empleado")
	public class Empleado {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "IdEmpleado")
	    private int idEmpleado;

	    @Column(name = "Apellidos")
	    private String apellidos;

	    @Column(name = "Nombres")
	    private String nombres;

	    @Column(name = "Edad")
	    private int edad;
	    
	    @Column(name = "Sexo")
	    private char sexo;

	    @Column(name = "Salario")
	    private double salario;

	    public Empleado(int idEmpleado, String apellidos, String nombres, int edad, char sexo, double salario) {
			super();
			this.idEmpleado = idEmpleado;
			this.apellidos = apellidos;
			this.nombres = nombres;
			this.edad = edad;
			this.sexo = sexo;
			this.salario = salario;
		}

		public int getIdEmpleado() {
			return idEmpleado;
		}

		public void setIdEmpleado(int idEmpleado) {
			this.idEmpleado = idEmpleado;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getNombres() {
			return nombres;
		}

		public void setNombres(String nombres) {
			this.nombres = nombres;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		

		public Empleado obtenerEmpleado(String empleado) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<Empleado> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		public Optional<Empleado> findById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			
		}

		public Object save(Empleado empleado) {
			// TODO Auto-generated method stub
			return null;
		}

		public void addAtribute(String string, List<Empleado> empleados) {
			// TODO Auto-generated method stub
			
		}

}
}