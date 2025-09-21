package com.Projeto.Barbearia.Controller;

import java.net.URI;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Projeto.Barbearia.DTO.Usuario.UsuarioCreateRequest;
import com.Projeto.Barbearia.DTO.Usuario.UsuarioCreateResponse;
import com.Projeto.Barbearia.Entity.Usuario;
import com.Projeto.Barbearia.Service.UsuarioService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // POST Criar Usuario
    @PostMapping("/criar")
    public ResponseEntity<UsuarioCreateResponse> criarUsuario(@Valid @RequestBody UsuarioCreateRequest dto) {

        UsuarioCreateResponse usuarioCriado = usuarioService.criarUsuario(dto); //ainda precisa criar o metodo
        URI location = URI.create("/api/usuarios/" + usuarioCriado.getIdUsuario());
        return ResponseEntity.created(location).body(usuarioCriado);
    }
}
