package com.ufro.Inventario.repository;

import com.ufro.Inventario.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}