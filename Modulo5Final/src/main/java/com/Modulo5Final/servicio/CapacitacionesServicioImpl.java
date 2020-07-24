package com.Modulo5Final.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Modulo5Final.dao.Capacitaciones;
import com.Modulo5Final.dao.CapacitacionesRepositorio;


	@Service
	public class CapacitacionesServicioImpl implements CapacitacionesServicio{
		
		@Autowired
		CapacitacionesRepositorio capr;

		@Override
		public Capacitaciones findCapacitacionesByIDCapacitacion(int IDCapacitacion) {
			return capr.findOne(IDCapacitacion);
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
		public void eliminarCapacitaciones(int IDCapacitacion) {
			capr.delete(IDCapacitacion);

		}

		@Override
		public void editarCapacitaciones(Capacitaciones cap) {
			capr.save(cap);

		}
}
