package ServiciosImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelos.Visitas;
import respositorios.VisitasRepositorio;
import servicios.VisitasServicio;
	
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
