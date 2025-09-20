package com.Projeto.Barbearia.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "papeis")
public class Papeis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_papel")
    private Long idPapel;

    @Column(name = "nome_papel", nullable = false, unique = true, length = 30)
    private String nome;

    @Column(name = "descricao", length = 100)
    private String descricao;

    @ManyToMany(mappedBy = "papeis")
    private Set<Usuario> usuarios = new HashSet<>();

    // Getters e Setters
    public Long getIdPapel() {
        return idPapel;
    }
    public void setIdPapel(Long idPapel) {
        this.idPapel = idPapel;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
