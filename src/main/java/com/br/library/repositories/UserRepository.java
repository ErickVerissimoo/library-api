package com.br.library.repositories;

import org.springframework.data.repository.ListCrudRepository;

import com.br.library.models.User;

public interface UserRepository extends ListCrudRepository<User, Long> {

}
