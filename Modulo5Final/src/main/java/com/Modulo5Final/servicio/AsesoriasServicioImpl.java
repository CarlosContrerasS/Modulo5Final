package com.Modulo5Final.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Modulo5Final.dao.Asesorias;
import com.Modulo5Final.dao.AsesoriasRepositorio;



@Service
public class AsesoriasServicioImpl implements AsesoriasServicio {

	
	@Autowired
	AsesoriasRepositorio ase;
	
	@Override
	public Asesorias findAsesoriasById(int IDAsesorias) {
		return ase.findOne(IDAsesorias);
		
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
	public void eliminarAsesorias(int IDAsesorias) {
		ase.delete(IDAsesorias);

	}

	@Override
	public void editarAsesorias(Asesorias a) {
		ase.save(a);

	}

}
