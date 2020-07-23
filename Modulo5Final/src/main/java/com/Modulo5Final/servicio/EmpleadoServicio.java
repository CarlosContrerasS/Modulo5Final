package com.Modulo5Final.servicio;

import java.util.List;

import com.Modulo5Final.dao.Empleado;


public interface EmpleadoServicio {

		
		Empleado findEmpleadoByrutempleado(int RutEmpleado);
		List<Empleado> listarEmpleado();
		void agregarEmpleado(Empleado emp);
		void eliminarEmpleado(int RutEmpleado);
		void editarEmpleado(Empleado emp);

	}
