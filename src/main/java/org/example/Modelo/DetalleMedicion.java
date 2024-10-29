package org.example.Modelo;

public class DetalleMedicion {
    private String nombreSeccion;
    private int numSeccion;
    private String maquina;
    private double valor;
    private Empleado inspeccion;

    public DetalleMedicion() {
    }

    public DetalleMedicion(String nombreSeccion, int numSeccion, String maquina, double valor, Empleado inspeccion) {
        this.nombreSeccion = nombreSeccion;
        this.numSeccion = numSeccion;
        this.maquina = maquina;
        this.valor = valor;
        this.inspeccion = inspeccion;
    }

    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public int getNumSeccion() {
        return numSeccion;
    }

    public void setNumSeccion(int numSeccion) {
        this.numSeccion = numSeccion;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Empleado getInspeccion() {
        return inspeccion;
    }

    public void setInspeccion(Empleado inspeccion) {
        this.inspeccion = inspeccion;
    }
}
