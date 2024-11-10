package org.example.Modelo;

public class Domicilio {
    private int numeroCliente;
    private String calle;
    private String ciudad;
    private int codPostal;
    private int numDepartamento;

    public Domicilio() {
    }

    public Domicilio(int numeroCliente, String calle, String ciudad, int codPostal, int numDepartamento) {
        this.numeroCliente = numeroCliente;
        this.calle = calle;
        this.ciudad = ciudad;
        this.codPostal = codPostal;
        this.numDepartamento = numDepartamento;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public int getNumDepartamento() {
        return numDepartamento;
    }

    public void setNumDepartamento(int numDepartamento) {
        this.numDepartamento = numDepartamento;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "numeroCliente='" + numeroCliente + '\'' +
                ", calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", codPostal=" + codPostal +
                ", numDepartamento=" + numDepartamento +
                '}';
    }
}
