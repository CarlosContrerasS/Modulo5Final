package com.modulo5final.servicio;

import java.util.List;

import com.modulo5final.modelo.Empleado;

public interface EmpleadoServicio {

	
	Empleado findEmpleadoByrutempleado(int rutempleado);
	List<Empleado> listarEmpleado();
	void agregarEmpleado(Empleado emp);
	void eliminarEmpleado(int rutempleado);
	void editarEmpleado(Empleado emp);

}
