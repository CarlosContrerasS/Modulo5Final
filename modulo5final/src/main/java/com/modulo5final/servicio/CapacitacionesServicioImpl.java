package com.modulo5final.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modulo5final.modelo.Capacitaciones;
import com.modulo5final.modelo.CapacitacionesRepositorio;




	@Service
	public class CapacitacionesServicioImpl implements CapacitacionesServicio{
		
		@Autowired
		CapacitacionesRepositorio capr;

		@Override
		public Capacitaciones findCapacitacionesByIDCapacitacion(int idcapacitacion) {
			return capr.findOne(idcapacitacion);
		}

		@Override
		public List<Capacitaciones> listarCapacitaciones() {
			return (List<Capacitaciones>)capr.findAll();
		}

		@Override
		public void agregarCapacitaciones(Capacitaciones cap) {
			capr.save(cap);

		}

		@Override
		public void eliminarCapacitaciones(int idcapacitacion) {
			capr.delete(idcapacitacion);

		}

		@Override
		public void editarCapacitaciones(Capacitaciones cap) {
			capr.save(cap);

		}
}
