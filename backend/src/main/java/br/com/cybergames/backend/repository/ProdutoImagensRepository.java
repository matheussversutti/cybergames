package br.com.cybergames.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cybergames.backend.entity.ProdutoImagens;

public interface ProdutoImagensRepository extends JpaRepository<ProdutoImagens, Long> {
    
}
