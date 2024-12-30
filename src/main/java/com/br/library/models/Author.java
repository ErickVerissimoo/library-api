package com.br.library.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
@Data @Table(name = "authors")
public class Author {
@Id private String id;
private String name;
private String lastname;
private List<Book> books;
}
