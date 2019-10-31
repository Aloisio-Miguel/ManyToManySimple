package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Entity.Pessoa;

public interface PessoaRepository {
    void inserir(Pessoa umaPessoa);
    List<Pessoa> consultarTodos();
    Pessoa consultar(long id);
    Pessoa remover(long id);
    void alterar(Pessoa umaPessoa);
}
