package com.ufro.Inventario.model;

import javax.persistence.*;

/**
 * Producto se refiere a la lista de productos del inventario.
 * @author Felipe Fuentes
 */
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false, unique = true, length = 50)
    private String nombre;

    @Column(name = "descripcion", columnDefinition="TEXT")
    private String descripcion;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @ManyToOne(optional = false)
    @JoinColumn(name = "categoria", nullable = false)
    private Categoria categoria;


    public Producto(){

    }

    /**
     * Genera productos con sus respectivos atributos.
     * @param id ID unica del producto
     * @param nombre Nombre del producto
     * @param descripcion Descripcion del producto
     * @param categoria Categoria del producto
     */
    public Producto(Long id, String nombre, String descripcion, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    /**
     * Obtiene el nombre de un producto.
     * @return Nombre de un producto
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene una descripcion de un producto.
     * @return Descripcion de un producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la cantidad total de productos en el inventario.
     * @return Cantidad de un producto
     */
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Devuelve la categoria de un producto del inventario.
     * @return Categoria de un producto
     */
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
