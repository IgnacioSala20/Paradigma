package org.example.Modelo;

public class TipoVehiculo {
    private int peso;
    private String descripcion;
    private double precioUnitario;

    public TipoVehiculo() {
    }

    public TipoVehiculo(int peso, double precioUnitario, String descripcion) {
        this.peso = peso;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
