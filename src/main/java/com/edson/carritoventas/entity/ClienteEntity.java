package com.edson.carritoventas.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CLIENTE")

public class ClienteEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idcliente")
    private long id;

    @Column(name = "nombre" , nullable = false)
    private String nombre;

    @Column(name = "apellido" , nullable = false)
    private String apellido;

    @Column(name = "dni" , nullable = false,unique = true,length = 8)
    private String dni;

    @Column(name = "telefono" , nullable = false)
    private String telefono;

    @Column(name = "email" , nullable = false)
    private String email;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
