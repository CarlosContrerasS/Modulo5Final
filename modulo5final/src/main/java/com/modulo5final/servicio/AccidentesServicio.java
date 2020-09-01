package com.modulo5final.servicio;

import java.util.List;

import com.modulo5final.modelo.Accidentes;



public interface AccidentesServicio {
	
	Accidentes findAccidenteById(int idaccidente);
	List<Accidentes> listarAccidentes();
	void agregarAccidente(Accidentes acc);
	void eliminarAccidente(int idaccidente);
	void editarAccidente(Accidentes acc);

}
