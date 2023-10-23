package br.com.cybergames.backend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cybergames.backend.entity.Usuario;
import br.com.cybergames.backend.service.UsuarioService;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("/")
    public List<Usuario> buscarTodos(){
        return usuarioService.buscarTodos();
    }

    @PostMapping("/")
    public Usuario inserir(@RequestBody Usuario usuario){
        return usuarioService.inserir(usuario);
    }

    @PutMapping("/")
    public Usuario alterar( @RequestBody Usuario usuario){
        return usuarioService.alterar(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        usuarioService.excluir(id);
        return ResponseEntity.ok().build();
    }

}
