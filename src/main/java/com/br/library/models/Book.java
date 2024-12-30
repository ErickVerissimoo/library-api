package com.br.library.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import com.br.library.Config.Validation;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Validation
@Table(name = "books")
public class Book {
@Id private Long id;

private String title;
private String sinopse;
@Column(value = "user_id")
private User user;
}
