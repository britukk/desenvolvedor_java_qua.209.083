package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

// TODO: Código está dando erro na hora de rodar falando que o TarefaController não possui a linha com.app.repository.TarefaRepository, mas o código do TarefaController está correto. Verificar se o código do TarefaRepository está correto.