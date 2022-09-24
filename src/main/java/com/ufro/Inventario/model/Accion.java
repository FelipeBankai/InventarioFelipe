package com.ufro.Inventario.model;

import javax.persistence.*;

@Entity
public class Accion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombreAccion", nullable = false, unique = true, length = 50)
    private String nombreAccion;

    public Accion() {
    }

    public Accion(Long id, String nombreAccion) {
        this.id = id;
        this.nombreAccion = nombreAccion;
    }

    public String getNombreAccion() {
        return nombreAccion;
    }

    public void setNombreAccion(String nombreAccion) {
        this.nombreAccion = nombreAccion;
    }
}
