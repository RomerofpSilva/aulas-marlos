package com.senai.demo.controllers;


import com.senai.demo.dtos.RespostaDto;
import com.senai.demo.dtos.UsuarioDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // sinaliza para o spring que seria uma API REST
public class MainController {

    //-- METODO DE SAUDE DA APLICAÇÃO PARA SABER SE A APP ESTA RO
    @GetMapping()
    public ResponseEntity<String> responder(){
    return ResponseEntity.ok().body("Hello World");

    }

    @PostMapping()
    public ResponseEntity<RespostaDto> criarUsuario(UsuarioDto dto){
        System.out.println("Nome: " + dto.getNome());
        System.out.println("email: " + dto.getEmail());
        System.out.println("Senha: " + dto.getSenha());

        RespostaDto resposta = new RespostaDto();
        resposta.setNome(dto.getNome());
        resposta.setEmail(dto.getEmail());
        resposta.setSucesso(true);
        return ResponseEntity.ok().body(resposta);
    }

}
