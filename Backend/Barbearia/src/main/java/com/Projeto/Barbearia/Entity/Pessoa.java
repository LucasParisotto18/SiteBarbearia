package com.Projeto.Barbearia.Entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pessoa")
      private Long idPessoa;

    @Column(name = "nm_pessoa", nullable = false, length = 40)
    private String nmPessoa;

    @Column(name = "cpf", nullable = false, length = 11, unique = true)
    private String cpf;

    @Column(name = "email", nullable = false, length = 70, unique = true)
    private String email;

    @Column(name = "telefone", nullable = false, length = 15)
    private String telefone;

    @Column(name = "dt_nascimento", nullable = false)
    private LocalDate dtNascimento;
    
    @Column(name = "id_enderecoFK", nullable = false)
    private Long idEnderecoFK;

}
