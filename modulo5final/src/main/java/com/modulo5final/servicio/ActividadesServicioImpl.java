package com.modulo5final.servicio;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.modulo5final.modelo.Asesorias;
import com.modulo5final.modelo.AsesoriasRepositorio;
import com.modulo5final.modelo.Capacitaciones;
import com.modulo5final.modelo.CapacitacionesRepositorio;
import com.modulo5final.modelo.Chequeo;
import com.modulo5final.modelo.ChequeoRepositorio;
import com.modulo5final.modelo.Cliente;
import com.modulo5final.modelo.ClienteRepositorio;
import com.modulo5final.modelo.Empleado;
import com.modulo5final.modelo.EmpleadoRepositorio;
import com.modulo5final.modelo.Visitas;
import com.modulo5final.modelo.VisitasRepositorio;

@Service
public class ActividadesServicioImpl implements ActividadesServicio {
	@Autowired
	EmpleadoRepositorio emr;
	@Autowired
	ClienteRepositorio clr;
	@Autowired
	AsesoriasRepositorio asr;
	@Autowired
	ChequeoRepositorio chr;
	@Autowired
	CapacitacionesRepositorio car;
	@Autowired
	VisitasRepositorio vsr;


	
	@Override
	public List <Empleado> ListarEmpleados() {
		return (List<Empleado>) emr.findAll();
	}



	@Override
	public List<Cliente> ListarClientes() {
		return (List<Cliente>) clr.findAll();
	}


	@Override
	public List<Chequeo> ListarChequeos() {
		return (List<Chequeo>) chr.findAll();
	}



	@Override
	public List<Capacitaciones> ListarCapacitaciones() {
		return (List<Capacitaciones>) car.findAll();
	}



	@Override
	public List <Visitas> ListarVisitas() {
		return (List<Visitas>) vsr.findAll();
	}

	@Override
	public List<Asesorias> ListarAsesorias() {
		return (List<Asesorias>) asr.findAll();
	}

}
