package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

@Repository
public class UserRepository {

	public void save(Usuario usuario) {
		if(usuario.getId() == null) {
			System.out.println("SAVE - Recebendo o usuário na camada de repositório");
		}else {
			System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
		}
		System.out.println(usuario);
	}
	public void deleteById(Integer id) {
		System.out.println(String.format("DELETE/id - Recebendo o id: %d para deletar", id ));
		System.out.println(id);
	}
	
	public List<Usuario> findAll(){
		System.out.println("LIST - Listando os usuários do sistema");
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Deivinson","password"));
		usuarios.add(new Usuario("Frank", "masterpass"));
		return usuarios;
	}
	
	public Usuario findById(Integer id) {
		System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar o usuário", id));
		return new Usuario("Deivinson", "password");
	}
	
	public Usuario findByUsername(String username) {
		System.out.println(String.format("FIND/username - Recebendo o username: %s para localisar um usuario", username));
		return new Usuario("Deivinson", "password");
	}
	
}
