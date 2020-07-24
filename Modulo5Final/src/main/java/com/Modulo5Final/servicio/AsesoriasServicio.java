package com.Modulo5Final.servicio;

import java.util.List;

import com.Modulo5Final.dao.Asesorias;


public interface AsesoriasServicio {

	
	Asesorias findAsesoriasById(int IDAsesorias);
	List<Asesorias> listarAsesorias();
	void agregarAsesorias(Asesorias ase);
	void eliminarAsesorias(int IDAsesorias);
	void editarAsesorias(Asesorias ase);
	
	
	
}
