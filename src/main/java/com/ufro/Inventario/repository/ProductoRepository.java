package com.ufro.Inventario.repository;

import com.ufro.Inventario.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {
}