package com.modulo5final.servicio;

import java.util.List;

import com.modulo5final.modelo.Chequeo;

public interface ChequeoServicio {

	Chequeo findChequeoById(int idchequeo);
	List<Chequeo> listarChequeo();
	void agregarChequeo(Chequeo che);
	void eliminarChequeo(int idchequeo);
	void editarChequeo(Chequeo che);


}