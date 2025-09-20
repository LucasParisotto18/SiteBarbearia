package com.Projeto.Barbearia.Controller;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Projeto.Barbearia.Entity.Usuario;

@RestController
public class UsuarioController {
   
    @PostMapping("/usuario/criar")
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
        
        return ResponseEntity.ok(usuario);
    }
}
