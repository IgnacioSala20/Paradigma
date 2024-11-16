package org.example.Modelo;

public class Domicilio {
    private int punteroDomicilio;
    private String calle;
    private String ciudad;
    private int codPostal;
    private int numDepartamento;

    public Domicilio() {
    }

    public Domicilio(int punteroDomicilio, String calle, String ciudad, int codPostal, int numDepartamento) {
        this.punteroDomicilio = punteroDomicilio;
        this.calle = calle;
        this.ciudad = ciudad;
        this.codPostal = codPostal;
        this.numDepartamento = numDepartamento;
    }

    public int getpunteroDomicilio() {
        return punteroDomicilio;
    }

    public void setpunteroDomicilio(int punteroDomicilio) {
        this.punteroDomicilio = punteroDomicilio;
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
                "punteroDomicilio='" +punteroDomicilio + '\'' +
                ", calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", codPostal=" + codPostal +
                ", numDepartamento=" + numDepartamento +
                '}';
    }
}
