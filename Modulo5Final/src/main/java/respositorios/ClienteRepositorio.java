package respositorios;

import org.springframework.data.repository.CrudRepository;

import modelos.Cliente;

public interface ClienteRepositorio extends CrudRepository<Cliente, Integer>  {

}