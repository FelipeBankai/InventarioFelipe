package com.ufro.Inventario.repository;

import com.ufro.Inventario.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}