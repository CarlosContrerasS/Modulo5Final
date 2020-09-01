package com.modulo5final.servicio;

import java.util.List;

import com.modulo5final.modelo.Asesorias;

public interface AsesoriasServicio {

	
	Asesorias findAsesoriasById(int idasesorias);
	List<Asesorias> listarAsesorias();
	void agregarAsesorias(Asesorias ase);
	void eliminarAsesorias(int idasesorias);
	void editarAsesorias(Asesorias ase);
	
	
	
}