package br.com.cybergames.backend.entity;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name="produto_imagens")
@Data
public class ProdutoImagens {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_produtoimg;
    private String nome_img;
    @ManyToOne
    @JoinColumn(name="idProduto")
    private Produto produto;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;


}
