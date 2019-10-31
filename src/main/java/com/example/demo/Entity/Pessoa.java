package com.example.demo.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pessoas")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = true, length = 10)
    private long cracha;

    // - Relação ManyToMany:
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "pessoa_projeto",
            joinColumns = {@JoinColumn(name = "pessoa_id")},
            inverseJoinColumns = {@JoinColumn(name = "projeto_id")}
    )
    Set<Projeto> projetos = new HashSet<Projeto>();

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, long cracha) {
        this.nome = nome;
        this.cracha = cracha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCracha(long cracha){
        this.cracha = cracha;
    }

    public long getCracha(){
        return cracha;
    }

    public Set<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(Set<Projeto> projetos) {
        this.projetos = projetos;
    }
}
