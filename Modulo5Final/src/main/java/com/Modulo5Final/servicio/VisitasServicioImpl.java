package com.Modulo5Final.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Modulo5Final.dao.Visitas;
import com.Modulo5Final.dao.VisitasRepositorio;

	
	@Service
	public class VisitasServicioImpl implements VisitasServicio {
		
		@Autowired
		VisitasRepositorio vr;

		@Override
		public Visitas findVisitasByIDVisita(int IDVisita) {
			return vr.findOne(IDVisita);
		}

		@Override
		public List<Visitas> listarVisitas() {
			return (List<Visitas>)vr.findAll();
		}

		@Override
		public void agregarVisitas(Visitas v) {
			vr.save(v);

		}

		@Override
		public void eliminarVisitas(int IDVisita) {
			vr.delete(IDVisita);

		}

		@Override
		public void editarVisitas(Visitas v) {
			vr.save(v);

		}

		
}


