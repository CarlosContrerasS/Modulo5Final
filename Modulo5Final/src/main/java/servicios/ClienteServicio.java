package servicios;

import java.util.List;

import modelos.Cliente;

public interface ClienteServicio {
	
	Cliente findclienteByrut(int rut);
	List<Cliente> listarCliente();
	void agregarCliente(Cliente c);
	void eliminarCliente(int rut);
	void editarCliente(Cliente c);

}
