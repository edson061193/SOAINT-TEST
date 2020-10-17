package com.edson.carritoventas.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCTO")
public class ProductoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idproducto")
    private long id;

    @Column(name = "nombre" , nullable = false)
    private String nombre;

    @Column(name = "precio" , nullable = false)
    private double apellido;

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

    public double getApellido() {
        return apellido;
    }

    public void setApellido(double apellido) {
        this.apellido = apellido;
    }
}
