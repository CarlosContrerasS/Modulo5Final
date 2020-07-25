package servicios;

import java.util.List;

import modelos.Empleado;

public interface EmpleadoServicio {

	
	Empleado findEmpleadoByrutempleado(int RutEmpleado);
	List<Empleado> listarEmpleado();
	void agregarEmpleado(Empleado emp);
	void eliminarEmpleado(int RutEmpleado);
	void editarEmpleado(Empleado emp);

}
