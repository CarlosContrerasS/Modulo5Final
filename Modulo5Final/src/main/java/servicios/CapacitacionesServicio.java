package servicios;

import java.util.List;

import modelos.Capacitaciones;

public interface CapacitacionesServicio {


	Capacitaciones findCapacitacionesByIDCapacitacion(int IDCapacitacion);
	List<Capacitaciones> listarCapacitaciones();
	void agregarCapacitaciones(Capacitaciones cap);
	void eliminarCapacitaciones(int IDCapacitacion);
	void editarCapacitaciones(Capacitaciones cap);


}
