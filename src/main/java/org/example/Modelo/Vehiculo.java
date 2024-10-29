package org.example.Modelo;

public class Vehiculo {
    private String tipoPatente;
    private String patente;
    private Marca marca;
    private int añoFabricacion;
    private Double kilometro;
    private int nroChasis;
    private TipoVehiculo tipoVehiculo;
    private Cliente cliente;

    public Vehiculo(){

    }

    public Vehiculo(String tipoPatente, String patente, Marca marca, int añoFabricacion, Double kilometro, int nroChasis, TipoVehiculo tipoVehiculo, Cliente cliente) {
        this.tipoPatente = tipoPatente;
        this.patente = patente;
        this.marca = marca;
        this.añoFabricacion = añoFabricacion;
        this.kilometro = kilometro;
        this.nroChasis = nroChasis;
        this.tipoVehiculo = tipoVehiculo;
        this.cliente = cliente;
    }

    public String getTipoPatente() {
        return tipoPatente;
    }

    public void setTipoPatente(String tipoPatente) {
        this.tipoPatente = tipoPatente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public Double getKilometro() {
        return kilometro;
    }

    public void setKilometro(Double kilometro) {
        this.kilometro = kilometro;
    }

    public int getNroChasis() {
        return nroChasis;
    }

    public void setNroChasis(int nroChasis) {
        this.nroChasis = nroChasis;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
