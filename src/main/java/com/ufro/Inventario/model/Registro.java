package com.ufro.Inventario.model;

import javax.persistence.*;
import java.sql.Timestamp;

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

    public Registro(Timestamp fechaRegistro, Producto producto, User user, Accion accion, int cantidad) {
        this.fechaRegistro = fechaRegistro;
        this.producto = producto;
        this.user = user;
        this.accion = accion;
        this.cantidad = cantidad;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Accion getAccion() {
        return accion;
    }

    public void setAccion(Accion accion) {
        this.accion = accion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
