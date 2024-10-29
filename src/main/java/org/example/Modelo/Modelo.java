package org.example.Modelo;

public class Modelo {
    private String nombreModelo;
    private int anio;
    private String descripcion;

    public Modelo() {
    }

    public Modelo(String nombreModelo, int anio, String descripcion) {
        this.nombreModelo = nombreModelo;
        this.anio = anio;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }
}
