package com.ufro.Inventario.model;

import javax.persistence.*;

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

    // Nota: columnDefiniton necesario ya que hibernate define automáticamente String como varchar(255)
    @Column(name = "profile_picture", columnDefinition="TEXT")
    private String profilePicture;

    public User() {
    }

    public User(Long id, String nombreUsuario, String clave, String Correo) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.correo =correo;
    }

    public User(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getclave() {
        return clave;
    }

    public void setclave(String clave) {
        this.clave = clave;
    }

    public String getnombreUsuario() {
        return nombreUsuario;
    }

    public void setnombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}