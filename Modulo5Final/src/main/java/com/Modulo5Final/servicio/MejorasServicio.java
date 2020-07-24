package com.Modulo5Final.servicio;

import java.util.List;


import com.Modulo5Final.dao.Mejoras;

public interface MejorasServicio {

	Mejoras findMejorasById(int IDMejora);
	List<Mejoras> listarMejoras();
	void agregarMejoras(Mejoras mej);
	void eliminarMejoras(int IDMejora);
	void editarMejoras(Mejoras mej);
	
	
	
	
}


