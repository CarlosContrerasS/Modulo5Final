package com.modulo5final.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modulo5final.modelo.Mejoras;
import com.modulo5final.modelo.MejorasRepositorio;


@Service
public class MejorasServicioImpl implements MejorasServicio {

	@Autowired
	MejorasRepositorio mej;
	
	
	@Override
	public Mejoras findMejorasById(int idmejora) {
		return mej.findOne(idmejora);
	}

	@Override
	public List<Mejoras> listarMejoras() {
		return (List<Mejoras>)mej.findAll();
	}

	@Override
	public void agregarMejoras(Mejoras m) {
		mej.save(m);

	}

	@Override
	public void eliminarMejoras(int idmejoras) {
		mej.delete(idmejoras);

	}

	@Override
	public void editarMejoras(Mejoras m) {
		mej.save(m);

	}

}
