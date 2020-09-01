package com.modulo5final.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modulo5final.modelo.Visitas;
import com.modulo5final.modelo.VisitasRepositorio;
	
	@Service
	public class VisitasServicioImpl implements VisitasServicio {
		
		@Autowired
		VisitasRepositorio vr;

		@Override
		public Visitas findVisitasByIDVisita(int idvisita) {
			return vr.findOne(idvisita);
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
		public void eliminarVisitas(int idvisita) {
			vr.delete(idvisita);

		}

		@Override
		public void editarVisitas(Visitas v) {
			vr.save(v);

		}

		
}
