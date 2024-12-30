package com.br.library.models;

import java.util.List;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.relational.core.mapping.Embedded.Nullable;
import org.springframework.data.relational.core.mapping.Table;

import com.br.library.Config.Validation;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Validation
@Table(name = "users")
public class User {
@Id private Integer id;
private String email;
private String password;
@CPF
private String cpf;
@Nullable
private List<Book> books;


@PersistenceCreator
public User(Integer id, String email, String password, @CPF String cpf, List<Book> books) {
	this.id = id;
	this.email = email;
	this.password = password;
	this.cpf = cpf;
	this.books = books;
}
public User() {}

}
