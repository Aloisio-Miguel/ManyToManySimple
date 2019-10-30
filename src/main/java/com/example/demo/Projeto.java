package com.example.demo;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "projetos")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private double custo;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    // - Relação ManyToMany:
    @ManyToMany(mappedBy = "projetos", cascade = {CascadeType.ALL})
    private Set<Pessoa> pessoas = new HashSet<Pessoa>();

    public Projeto() {
    }

    public Projeto(String titulo, double custo, Date data) {
        this.titulo = titulo;
        this.custo = custo;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Set<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(Set<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}
