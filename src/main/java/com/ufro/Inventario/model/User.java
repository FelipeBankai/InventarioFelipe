package com.ufro.Inventario.model;

import javax.persistence.*;

/**
 * User representa a los usuarios que entran al inventario
 * @author Felipe Fuentes
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombreUsuario", nullable = false, unique = true, length = 50)
    private String nombreUsuario;

    @Column(name = "correo", nullable = false, unique = true, length = 50)
    private String correo;

    @Column(name = "clave", nullable = false, length = 70)
    private String clave;


    public User() {
    }

    /**
     * Obtiene un usuario con todos sus datos
     * @param id ID unica del usuario
     * @param nombreUsuario Nombre del usuario
     * @param clave Clave para ingresar
     * @param correo Correo del usuario
     */
    public User(Long id, String nombreUsuario, String clave, String correo) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.correo =correo;
    }

    /**
     * Obtiene un usuario solo con su nombre y clave de acceso
     * @param nombreUsuario Nombre del Usuario
     * @param clave Clave de acceso
     */
    public User(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    /**
     * Develve la clave de un usuario
     * @return Clave de acceso
     */
    public String getclave() {
        return clave;
    }

    public void setclave(String clave) {
        this.clave = clave;
    }

    /**
     * Obtiene el nombre de un usuario
     * @return Nombre de un usuario
     */
    public String getnombreUsuario() {
        return nombreUsuario;
    }

    public void setnombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Obtiene el correo de un usuario
     * @return correo de un usuario
     */
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Retorna el identificador de un usuario
     * @return ID del usuario
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}