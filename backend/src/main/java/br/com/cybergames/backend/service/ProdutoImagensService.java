package br.com.cybergames.backend.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.cybergames.backend.entity.Produto;
import br.com.cybergames.backend.entity.ProdutoImagens;
import br.com.cybergames.backend.repository.ProdutoImagensRepository;
import br.com.cybergames.backend.repository.ProdutoRepository;

@Service
public class ProdutoImagensService {
    
    @Autowired
    private ProdutoImagensRepository produtoImagensRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoImagens> buscarTodos(){
        return produtoImagensRepository.findAll();
    }
    
    public ProdutoImagens inserir(Long idProduto, MultipartFile file){
        Produto produto = produtoRepository.findById(idProduto).get();
        ProdutoImagens objeto = new ProdutoImagens();

        try {
			if (!file.isEmpty()) {
				byte[] bytes = file.getBytes();
                String nomeImagem = String.valueOf(produto.getId_produto()) + file.getOriginalFilename();
				Path caminho = Paths
						.get("c:/imagens/" +nomeImagem );
				Files.write(caminho, bytes);
                objeto.setNome_img(nomeImagem);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

        objeto.setProduto(produto);
        objeto.setDataCriacao(new Date());
        objeto = produtoImagensRepository.saveAndFlush(objeto);
        return objeto;

    }

    public ProdutoImagens  alterar( ProdutoImagens produtoImagens){
        produtoImagens.setDataAtualizacao(new Date());
        return produtoImagensRepository.saveAndFlush(produtoImagens);
    }

    public void excluir (Long id){
        ProdutoImagens produtoImagens = produtoImagensRepository.findById(id).get();
        produtoImagensRepository.delete(produtoImagens);

    }

}