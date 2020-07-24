package com.Modulo5Final.servicio;

import java.util.List;

import com.Modulo5Final.dao.Capacitaciones;

public interface CapacitacionesServicio {


	Capacitaciones findCapacitacionesByIDCapacitacion(int IDCapacitacion);
	List<Capacitaciones> listarCapacitaciones();
	void agregarCapacitaciones(Capacitaciones cap);
	void eliminarCapacitaciones(int IDCapacitacion);
	void editarCapacitaciones(Capacitaciones cap);


}
