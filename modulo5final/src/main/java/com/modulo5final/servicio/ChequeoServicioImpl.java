package com.modulo5final.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modulo5final.modelo.Chequeo;
import com.modulo5final.modelo.ChequeoRepositorio;





@Service
public class ChequeoServicioImpl implements ChequeoServicio{
	
	@Autowired
	ChequeoRepositorio cher;

	@Override
	public Chequeo findChequeoById(int idchequeo) {
		return cher.findOne(idchequeo);
	}

	@Override
	public List<Chequeo> listarChequeo() {
		return (List<Chequeo>)cher.findAll();
	}

	@Override
	public void agregarChequeo(Chequeo che) {
		cher.save(che);

	}

	@Override
	public void eliminarChequeo(int idchequeo) {
		cher.delete(idchequeo);

	}

	@Override
	public void editarChequeo(Chequeo che) {
		cher.save(che);

	}
}