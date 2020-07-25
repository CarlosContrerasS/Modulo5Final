package ServiciosImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelos.Capacitaciones;
import respositorios.CapacitacionesRepositorio;
import servicios.CapacitacionesServicio;




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
