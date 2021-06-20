package mp.microserv.repositorio;

import org.springframework.data.repository.CrudRepository;

import mp.microserv.entidades.Productos;

public interface ProductosRepo extends CrudRepository<Productos, Long>{

}
