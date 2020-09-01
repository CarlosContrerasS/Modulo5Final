package com.modulo5final.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modulo5final.modelo.Accidentes;
import com.modulo5final.modelo.AccidentesRepositorio;
import com.modulo5final.modelo.Asesorias;
import com.modulo5final.modelo.AsesoriasRepositorio;
import com.modulo5final.modelo.Capacitaciones;
import com.modulo5final.modelo.CapacitacionesRepositorio;
import com.modulo5final.modelo.Cliente;
import com.modulo5final.modelo.ClienteRepositorio;
import com.modulo5final.modelo.Empleado;
import com.modulo5final.modelo.EmpleadoRepositorio;
import com.modulo5final.modelo.Mejoras;
import com.modulo5final.modelo.MejorasRepositorio;
import com.modulo5final.modelo.Pagos;
import com.modulo5final.modelo.PagosRepositorio;
import com.modulo5final.modelo.Visitas;
import com.modulo5final.modelo.VisitasRepositorio;

@Service
public class ReporteServicioImpl implements ReporteServicio {

	@Autowired
	ClienteRepositorio clr;
	@Autowired
	AccidentesRepositorio acr;
	@Autowired
	VisitasRepositorio vsr;
	@Autowired
	AsesoriasRepositorio asr;
	@Autowired
	CapacitacionesRepositorio car;
	@Autowired
	MejorasRepositorio mer;
	@Autowired
	PagosRepositorio par;
	
	@Autowired
	EmpleadoRepositorio emr;
	
	@Override
	public long ContarClientes() {
		return  clr.count();
	}
	
	@Override
	public List <Accidentes> ListarAccidentes() {
		return (List<Accidentes>) acr.findAll();
	}
	
	@Override
	public List <Visitas> ListarVisitas() {
		return (List<Visitas>) vsr.findAll();
	}
	
	@Override
	public List <Asesorias> ListarAsesorias() {
		return (List<Asesorias>) asr.findAll();
	}
	
	@Override
	public List <Capacitaciones> ListarCapacitaciones() {
		return (List<Capacitaciones>) car.findAll();
	}
	
	@Override
	public List<Mejoras> ListarMejoras() {
		return (List<Mejoras>) mer.findAll();
	}

	@Override
	public List<Pagos> ListarPagos() {
		return (List<Pagos>) par.findAll();
	}

	@Override
	public List<Cliente> ListarClientes() {
		return (List<Cliente>) clr.findAll();
	}

	@Override
	public Cliente findClienteByRut(int rut) {
		return clr.findOne(rut);
	}

	@Override
	public Long ContarAccidentes() {
		return acr.count();
	}

	@Override
	public Long ContarVisitas() {
		return vsr.count();
	}

	@Override
	public Long ContarAsesorias() {
		return asr.count();
	}

	@Override
	public Long ContarCapacitaciones() {
		return car.count();
	}

	@Override
	public Long ContarMejoras() {
		return mer.count();
	}

	@Override
	public Empleado findEmpleadoByRut(int rutempleado) {
		return emr.findOne(rutempleado);
	}
}
