package org.example.Modelo;

public class Tarifa {
    private TipoVehiculo tipoVehiculo;
    private String descripcion;

    public Tarifa(){

    }

    public Tarifa(TipoVehiculo tipoVehiculo, String descripcion) {
        this.tipoVehiculo = tipoVehiculo;
        this.descripcion = descripcion;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
