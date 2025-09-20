package com.Projeto.Barbearia.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private int idEndereco;

    @Column(name = "dsc_bairro", nullable = false)
    private String dscBairro;

    @Column(name = "dsc_logradouro", nullable = false)
    private String dscLogradouro;

    @Column(name = "dsc_numero")
    private int dscNumero;

    @Column(name = "dsc_complemento")
    private String dscComplemento;

    @Column(name = "dsc_cep", nullable = false)
    private String dscCep;

    @ManyToOne
    @JoinColumn(name = "id_municipioFK", nullable = false)
    private Municipio municipioFK;

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getDscBairro() {
        return dscBairro;
    }

    public void setDscBairro(String dscBairro) {
        this.dscBairro = dscBairro;
    }

    public String getDscLogradouro() {
        return dscLogradouro;
    }

    public void setDscLogradouro(String dscLogradouro) {
        this.dscLogradouro = dscLogradouro;
    }

    public int getDscNumero() {
        return dscNumero;
    }

    public void setDscNumero(int dscNumero) {
        this.dscNumero = dscNumero;
    }

    public String getDscComplemento() {
        return dscComplemento;
    }

    public void setDscComplemento(String dscComplemento) {
        this.dscComplemento = dscComplemento;
    }

    public String getDscCep() {
        return dscCep;
    }

    public void setDscCep(String dscCep) {
        this.dscCep = dscCep;
    }

    public Municipio getMunicipioFK() {
        return municipioFK;
    }

    public void setMunicipioFK(Municipio municipioFK) {
        this.municipioFK = municipioFK;
    }

}
