package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuario, Long> {
}
