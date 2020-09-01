package com.modulo5final.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modulo5final.modelo.Accidentes;
import com.modulo5final.modelo.AccidentesRepositorio;


@Service
public class AccidentesServicioImpl implements AccidentesServicio{

	@Autowired
	AccidentesRepositorio acci;

	@Override
	public Accidentes findAccidenteById(int idaccidente) {
		return acci.findOne(idaccidente);
	}

	@Override
	public List<Accidentes> listarAccidentes() {
		return (List<Accidentes>)acci.findAll();
	}

	@Override
	public void agregarAccidente(Accidentes acc) {
		acci.save(acc);

	}

	@Override
	public void eliminarAccidente(int idaccidente) {
		acci.delete(idaccidente);

	}

	@Override
	public void editarAccidente(Accidentes ac) {
		acci.save(ac);

	}
	
	

}