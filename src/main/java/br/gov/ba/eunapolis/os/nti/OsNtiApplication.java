package br.gov.ba.eunapolis.os.nti;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import orm.Usuarios;
import repository.UsuariosRepository;

@SpringBootApplication
public class OsNtiApplication implements CommandLineRunner {
	
	private final UsuariosRepository repository;
	
	public OsNtiApplication(UsuariosRepository repository) {
		this.repository = repository;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(OsNtiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuarios usuarios = new Usuarios();
		
		usuarios.setUser("anderson");
		usuarios.setPass("1234");
		usuarios.setName("Anderson");
		usuarios.setEmail("anderson.passos@yahoo.com.br");
		usuarios.setTipo(1);
		usuarios.setFkTecnico(1);
		usuarios.setCodigo("12345");
		usuarios.setStatus("ativo");
		usuarios.setDsTelefone("73 98127 1949");
//		usuarios.setDtNascimento(05/03/1985);
//		usuarios.setAcesso("05/02/2020");
		usuarios.setAnexo("Algum anexo");
		usuarios.setLocation("Eunapolis - NTI");
		
		repository.save(usuarios);
		
	}

}
