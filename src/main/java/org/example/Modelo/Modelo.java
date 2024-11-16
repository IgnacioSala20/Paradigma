package org.example.Modelo;

public class Modelo {
    private String nombreModelo;
    private int año;
    private String descripcion;

    public Modelo() {
    }

    public Modelo(String nombreModelo, int año, String descripcion) {
        this.nombreModelo = nombreModelo;
        this.año = año;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnio() {
        return año;
    }

    public void setAnio(int anio) {
        this.año = anio;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "nombreModelo='" + nombreModelo + '\'' +
                ", año=" + año +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
