package servicios;

import java.util.List;

import modelos.Visitas;

public interface VisitasServicio {
	
	Visitas findVisitasByIDVisita(int IDVisita);
	List<Visitas> listarVisitas();
	void agregarVisitas(Visitas v);
	void eliminarVisitas(int IDVisita);
	void editarVisitas(Visitas v);

}
