package com.Modulo5Final.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Modulo5Final.dao.Chequeo;
import com.Modulo5Final.dao.ChequeoRepositorio;



@Service
public class ChequeoServicioImpl implements ChequeoServicio{
	
	@Autowired
	ChequeoRepositorio cher;

	@Override
	public Chequeo findChequeoById(int IDChequeo) {
		return cher.findOne(IDChequeo);
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
	public void eliminarChequeo(int IDChequeo) {
		cher.delete(IDChequeo);

	}

	@Override
	public void editarChequeo(Chequeo che) {
		cher.save(che);

	}
}