package com.modulo5final.servicio;

import java.util.List;

import com.modulo5final.modelo.Visitas;

public interface VisitasServicio {
	
	Visitas findVisitasByIDVisita(int idvisita);
	List<Visitas> listarVisitas();
	void agregarVisitas(Visitas v);
	void eliminarVisitas(int idvisita);
	void editarVisitas(Visitas v);

}
