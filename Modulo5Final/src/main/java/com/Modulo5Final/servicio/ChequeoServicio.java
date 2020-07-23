package com.Modulo5Final.servicio;

import java.util.List;

import com.Modulo5Final.dao.Chequeo;


public interface ChequeoServicio {

	Chequeo findChequeoById(int IDChequeo);
	List<Chequeo> listarChequeo();
	void agregarChequeo(Chequeo che);
	void eliminarChequeo(int IDChequeo);
	void editarChequeo(Chequeo che);


}
