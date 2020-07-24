package com.Modulo5Final.servicio;

import java.util.List;

import com.Modulo5Final.dao.Visitas;

public interface VisitasServicio {
	Visitas findVisitasByIDVisita(int IDVisita);
	List<Visitas> listarVisitas();
	void agregarVisitas(Visitas v);
	void eliminarVisitas(int IDVisita);
	void editarVisitas(Visitas v);

}




	
