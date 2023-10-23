package br.com.cybergames.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cybergames.backend.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
