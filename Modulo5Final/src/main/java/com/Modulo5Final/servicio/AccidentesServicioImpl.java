package com.Modulo5Final.servicio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Modulo5Final.dao.Accidentes;
import com.Modulo5Final.dao.AccidentesRepositorio;

@Service
public class AccidentesServicioImpl implements AccidentesServicio{

	@Autowired
	AccidentesRepositorio acci;

	@Override
	public Accidentes findAccidenteById(int IdAccidente) {
		return acci.findOne(IdAccidente);
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
	public void eliminarAccidente(int IdAccidente) {
		acci.delete(IdAccidente);

	}

	@Override
	public void editarAccidente(Accidentes ac) {
		acci.save(ac);

	}

}
