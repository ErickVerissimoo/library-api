package com.br.library.Config;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import jakarta.annotation.PreDestroy;

@Component
public class SqlExecutor {
	private final JdbcClient client;
public SqlExecutor(JdbcClient client) {
	this.client=client;
}
	@PreDestroy
public void destruir() {
		
	String dropBooks = "DROP TABLE IF EXISTS books";
	String dropUsers =  "DROP TABLE IF EXISTS users";
	
	client.sql(dropBooks).update();
	client.sql(dropUsers).update();
	System.out.println("Aplicação finalizada e tabelas deletadas");
	}
}
