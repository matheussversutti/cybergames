package br.com.cybergames.backend.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cybergames.backend.entity.Produto;
import br.com.cybergames.backend.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> buscarTodos(){
        return produtoRepository.findAll();
    }
    
    public Produto inserir(Produto produto){
        Produto produtoNovo = produtoRepository.saveAndFlush(produto);
        return produtoNovo;

    }

    public Produto alterar( Produto produto){
        return produtoRepository.saveAndFlush(produto);
    }

    public void excluir (Long id){
        Produto produto = produtoRepository.findById(id).get();
        produtoRepository.delete(produto);

    }

}
