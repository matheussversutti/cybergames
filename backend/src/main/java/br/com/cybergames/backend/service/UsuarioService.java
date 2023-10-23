package br.com.cybergames.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.cybergames.backend.entity.Usuario;
import br.com.cybergames.backend.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }
    
    public Usuario inserir(Usuario usuario){
        Usuario usuarioNovo = usuarioRepository.saveAndFlush(usuario);
        return usuarioNovo;

    }

    public Usuario alterar( Usuario usuario){
        return usuarioRepository.saveAndFlush(usuario);
    }

    public void excluir (Long id){
        Usuario usuario = usuarioRepository.findById(id).get();
        usuarioRepository.delete(usuario);

    }

}
