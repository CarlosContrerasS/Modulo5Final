package com.modulo5final.servicio;

import java.util.List;

import com.modulo5final.modelo.Capacitaciones;

public interface CapacitacionesServicio {


	Capacitaciones findCapacitacionesByIDCapacitacion(int idcapacitacion);
	List<Capacitaciones> listarCapacitaciones();
	void agregarCapacitaciones(Capacitaciones cap);
	void eliminarCapacitaciones(int idcapacitacion);
	void editarCapacitaciones(Capacitaciones cap);


}
