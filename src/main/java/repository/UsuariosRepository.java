package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import orm.Usuarios;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuarios, Integer>{
	

}
