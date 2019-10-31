package com.example.demo;

import com.example.demo.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.Entity.Pessoa;
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PessoaRepository pessoas;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public void run(String[] args){
		Pessoa p1 = new Pessoa("joao",1234);
		pessoas.inserir(p1);
		//pessoas.consultar()
	}

}
