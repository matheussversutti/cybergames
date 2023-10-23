package br.com.cybergames.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cybergames.backend.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}