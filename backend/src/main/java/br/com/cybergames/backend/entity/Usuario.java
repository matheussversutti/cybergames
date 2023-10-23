package br.com.cybergames.backend.entity;



import br.com.cybergames.enuns.GrupoUsuario;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id_usuario;

    private String nome_usuario;

    
    private String cpf_usuario;
    private String email_usuario;
    
    @Enumerated(EnumType.STRING)
    private GrupoUsuario grupo_usuario;
   
    private String senha_usuario;

}
