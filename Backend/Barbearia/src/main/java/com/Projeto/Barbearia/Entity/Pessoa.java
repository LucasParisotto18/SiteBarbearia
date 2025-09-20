package com.Projeto.Barbearia.Entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa")
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
    
    @ManyToOne
    @JoinColumn(name = "id_enderecoFK", nullable = false)
    private Endereco enderecoFK;

    public Long getIdPessoa() {
      return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
      this.idPessoa = idPessoa;
    }

    public String getNmPessoa() {
      return nmPessoa;
    }

    public void setNmPessoa(String nmPessoa) {
      this.nmPessoa = nmPessoa;
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

    public LocalDate getDtNascimento() {
      return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
      this.dtNascimento = dtNascimento;
    }

    public Endereco getEnderecoFK() {
      return enderecoFK;
    }

    public void setEnderecoFK(Endereco enderecoFK) {
      this.enderecoFK = enderecoFK;
    }
}
