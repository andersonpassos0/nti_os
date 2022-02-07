package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import orm.usuarios;

@Repository
public interface UsuariosRepository extends CrudRepository<usuarios, Integer>{
	

}
