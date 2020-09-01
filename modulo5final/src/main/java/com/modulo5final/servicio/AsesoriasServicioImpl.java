package com.modulo5final.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modulo5final.modelo.Asesorias;
import com.modulo5final.modelo.AsesoriasRepositorio;





@Service
public class AsesoriasServicioImpl implements AsesoriasServicio {

	
	@Autowired
	AsesoriasRepositorio ase;
	
	@Override
	public Asesorias findAsesoriasById(int idasesorias) {
		return ase.findOne(idasesorias);
		
	}

	@Override
	public List<Asesorias> listarAsesorias() {
		return (List<Asesorias>)ase.findAll();
		
	}

	@Override
	public void agregarAsesorias(Asesorias a) {
		ase.save(a);

	}

	@Override
	public void eliminarAsesorias(int idasesorias) {
		ase.delete(idasesorias);

	}

	@Override
	public void editarAsesorias(Asesorias a) {
		ase.save(a);

	}

}
