package com.edson.carritoventas.dto;


public class Producto{

    private long id;
    private String nombre;
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
