package com.Projeto.Barbearia.DTO.Endereco;

import com.Projeto.Barbearia.DTO.Municipio.MunicipioCreateRequest;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public class EnderecoCreateRequest {
    @NotBlank
    private String bairro;
    @NotBlank
    private String logradouro;
    private String numero;
    private String complemento;
    @NotBlank
    @Pattern(regexp="\\d{8}", message="CEP deve ter 8 dígitos")
    private String cep;

    @Valid
    private MunicipioCreateRequest municipio;

    // Getters e Setters
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public MunicipioCreateRequest getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioCreateRequest municipio) {
        this.municipio = municipio;
    }
}
