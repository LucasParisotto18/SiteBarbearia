package com.Projeto.Barbearia.DTO.Usuario;
import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import com.Projeto.Barbearia.DTO.Endereco.EnderecoCreateRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;



public class UsuarioCreateRequest {
    
    @NotBlank
    private String nome;

    @NotBlank
    @Pattern(regexp = "\\d{11}", message = "O CPF deve conter 11 dígitos numéricos.")
    @CPF
    private String cpf;

    @NotBlank
    @Email(message = "Email inválido.")
    private String email;

    @NotBlank
    private String telefone;

    @NotBlank
    @Past(message = "A data de nascimento deve ser uma data passada.")
    private LocalDate dataNascimento;

    @NotBlank
    private String username; 

    @NotBlank
    @Size(min = 8, message = "A senha deve ter pelo menos 8 caracteres")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message = "A senha deve conter pelo menos uma letra maiúscula, uma minúscula e um número.")
    private String senha;

    @NotNull
    @Valid
    private EnderecoCreateRequest endereco;

    // se true cria registro em cliente tbm
    private Boolean criarComoCliente = false;

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public EnderecoCreateRequest getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoCreateRequest endereco) {
        this.endereco = endereco;
    }

    public Boolean getCriarComoCliente() {
        return criarComoCliente;
    }

    public void setCriarComoCliente(Boolean criarComoCliente) {
        this.criarComoCliente = criarComoCliente;
    }
}
