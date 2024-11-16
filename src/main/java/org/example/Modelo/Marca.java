package org.example.Modelo;

import java.util.ArrayList;

public class Marca {
    private String nombre;
    private Modelo modelo;
    private String descripcion;

    public Marca() {
    }

    public Marca(String nombre, Modelo modelo, String descripcion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nombre='" + nombre + '\'' +
                ", modelo=" + modelo +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}