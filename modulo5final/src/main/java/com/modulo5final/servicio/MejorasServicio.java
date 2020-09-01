package com.modulo5final.servicio;

import java.util.List;

import com.modulo5final.modelo.Mejoras;

public interface MejorasServicio {

	Mejoras findMejorasById(int idmejora);
	List<Mejoras> listarMejoras();
	void agregarMejoras(Mejoras mej);
	void eliminarMejoras(int idmejora);
	void editarMejoras(Mejoras mej);
	
	
	
	
}

