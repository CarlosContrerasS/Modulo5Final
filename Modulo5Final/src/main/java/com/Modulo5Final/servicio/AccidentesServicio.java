package com.Modulo5Final.servicio;

import java.util.List;

import com.Modulo5Final.dao.Accidentes;


public interface AccidentesServicio {
	Accidentes findAccidenteById(int IdAccidente);
	List<Accidentes> listarAccidentes();
	void agregarAccidente(Accidentes acc);
	void eliminarAccidente(int IdAccidente);
	void editarAccidente(Accidentes acc);

}
