package com.ufro.Inventario.model;

import javax.persistence.*;

/**
 * Categoria se refiere al tipo de producto de la clase producto
 * @author Felipe Fuentes
 */
@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombreCategoria", nullable = false, unique = true, length = 50)
    private String nombreCategoria;

    public Categoria(){
    }

    /**
     * Representa al tipo de categoria a especificar para la clase producto.
     * @param nombreCategoria Nombre de la categoria
     */
    public Categoria(String nombreCategoria){
        this.nombreCategoria = nombreCategoria;
    }

    /**
     * Obtiene el nombre la categoria
     * @return Nombre de la categoria de un producto
     */
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

}
