package com.modulo5final.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modulo5final.modelo.Empleado;
import com.modulo5final.modelo.EmpleadoRepositorio;



@Service
public class EmpleadoServicioImpl implements EmpleadoServicio {
	@Autowired
	EmpleadoRepositorio er;

	@Override
	public Empleado findEmpleadoByrutempleado (int rutempleado) {
		return er.findOne(rutempleado);
	}

	@Override
	public List<Empleado> listarEmpleado() {
		return (List<Empleado>)er.findAll();
	}

	@Override
	public void agregarEmpleado(Empleado emp) {
		er.save(emp);

	}

	@Override
	public void eliminarEmpleado(int rutempleado) {
		er.delete(rutempleado);

	}

	@Override
	public void editarEmpleado(Empleado emp) {
		er.save(emp);

	}
}
