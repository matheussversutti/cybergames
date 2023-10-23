package br.com.cybergames.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "produto")
@Data
public class Produto {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id_produto;
    private String nome_produto;
    private String desc_produto;
    private double avaliacao_produto;
    private double preco_produto;
    private int estoque_produto;

}
