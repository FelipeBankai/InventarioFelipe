package com.ufro.Inventario.model;

import javax.persistence.*;

/**
 * Acccion representa las acciones que se haran.
 * @author Felipe Fuentes
 */
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

    /**
     * Crea una accion con una id y nombre de la accion
     * @param id ID de la accion
     * @param nombreAccion Nombre de la accion a realizar
     */
    public Accion(Long id, String nombreAccion) {
        this.id = id;
        this.nombreAccion = nombreAccion;
    }

    /**
     * Obtiene el nombre de una opcion para especificar esta
     * @return Nombre de una accion
     */
    public String getNombreAccion() {
        return nombreAccion;
    }

    public void setNombreAccion(String nombreAccion) {
        this.nombreAccion = nombreAccion;
    }
}
