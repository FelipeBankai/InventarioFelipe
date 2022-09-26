package com.ufro.Inventario.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Registro registra los productos ingresos o eliminados en el inventario.
 * @author Felipe Fuentes
 */
@Entity
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "fechaRegistro")
    private Timestamp fechaRegistro;

    @ManyToOne(optional = false)
    @JoinColumn(name = "producto", nullable = false)
    private Producto producto;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user", nullable = false)
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "accion", nullable = false)
    private Accion accion;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;


    public Registro(){}

    /**
     * Crea un registro y lo guarda en el sistema.
     * @param fechaRegistro Fecha en la que se realizo un registro
     * @param producto Producto Registrado
     * @param user Usuario que ingreso el producto
     * @param accion Accion que se realizo
     * @param cantidad Cantidad de productos ingresados en el inventario
     */
    public Registro(Timestamp fechaRegistro, Producto producto, User user, Accion accion, int cantidad) {
        this.fechaRegistro = fechaRegistro;
        this.producto = producto;
        this.user = user;
        this.accion = accion;
        this.cantidad = cantidad;
    }

    /**
     * Devuelve la fecha en la que se hizo un registro
     * @return Fecha del registro
     */
    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * Se obtiene el producto ingresado al inventario
     * @return Producto
     */
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Usuario que ingreso el registro al inventario
     * @return Usuario
     */
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Devuelve si se elimino o  agrego un producto
     * @return accion a realizar
     */
    public Accion getAccion() {
        return accion;
    }

    public void setAccion(Accion accion) {
        this.accion = accion;
    }

    /**
     * Obtiene una cantidad de productos ingresados al sistema
     * @return Cantidad de productos
     */
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
