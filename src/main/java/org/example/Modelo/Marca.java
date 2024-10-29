package org.example.Modelo;

import java.util.ArrayList;

public class Marca {
    private String nombre;
    private int numMarca;
    private ArrayList<Modelo> modelos=new ArrayList<>();
    private String descripcion;

    public Marca(String nombre, int numMarca, ArrayList<Modelo> modelos, String descripcion) {
        this.nombre = nombre;
        this.numMarca = numMarca;
        this.modelos = modelos;
        this.descripcion = descripcion;
    }

    public Marca() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumMarca() {
        return numMarca;
    }

    public void setNumMarca(int numMarca) {
        this.numMarca = numMarca;
    }

    public ArrayList<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(ArrayList<Modelo> modelos) {
        this.modelos = modelos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
