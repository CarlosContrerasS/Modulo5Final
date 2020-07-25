package ServiciosImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelos.Empleado;
import respositorios.EmpleadoRepositorio;
import servicios.EmpleadoServicio;



@Service
public class EmpleadoServicioImpl implements EmpleadoServicio {
	@Autowired
	EmpleadoRepositorio er;

	@Override
	public Empleado findEmpleadoByrutempleado (int RutEmpleado) {
		return er.findOne(RutEmpleado);
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
	public void eliminarEmpleado(int RutEmpleado) {
		er.delete(RutEmpleado);

	}

	@Override
	public void editarEmpleado(Empleado emp) {
		er.save(emp);

	}
}