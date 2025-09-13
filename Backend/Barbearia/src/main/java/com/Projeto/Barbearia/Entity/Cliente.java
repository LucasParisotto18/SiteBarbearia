package com.Projeto.Barbearia.Entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "dt_cadastro", nullable = false)
    private LocalDate dataCadastro;
    @Column(name = "dt_ultimo_corte")
    private LocalDate dataUltimoCorte;
    @Column(name = "ind_ativo", nullable = false)
    private boolean ativo;

    @OneToOne
    @JoinColumn(name = "id_pessoaFK", referencedColumnName = "id_pessoa", nullable = false)
    private Pessoa idPessoaFK;


    public Long getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataUltimoCorte() {
        return dataUltimoCorte;
    }
    public void setDataUltimoCorte(LocalDate dataUltimoCorte) {
        this.dataUltimoCorte = dataUltimoCorte;
    }

    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Pessoa getPessoaFK() {
        return idPessoaFK;
    }
    public void setPessoaFK(Pessoa pessoa) {
        this.idPessoaFK = pessoa;
    }
}
