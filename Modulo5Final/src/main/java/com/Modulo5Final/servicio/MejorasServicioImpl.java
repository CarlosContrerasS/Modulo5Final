package com.Modulo5Final.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Modulo5Final.dao.Mejoras;
import com.Modulo5Final.dao.MejorasRepositorio;


@Service
public class MejorasServicioImpl implements MejorasServicio {

	@Autowired
	MejorasRepositorio mej;
	
	
	@Override
	public Mejoras findMejorasById(int IDMejora) {
		return mej.findOne(IDMejora);
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
	public void eliminarMejoras(int IDMejoras) {
		mej.delete(IDMejoras);

	}

	@Override
	public void editarMejoras(Mejoras m) {
		mej.save(m);

	}

}
