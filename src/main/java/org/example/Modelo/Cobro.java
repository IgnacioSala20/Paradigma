package org.example.Modelo;

public class Cobro {
    private int nroFactura;
    private String fechaCobro;
    private int codFactura;
    private String horaCobro;
    private double condicionIVA;
    private Vehiculo vehiculo;
    private Revision importe;

    public Cobro() {
    }

    public Cobro(int nroFactura, String fechaCobro, int codFactura, String horaCobro, double condicionIVA, Vehiculo vehiculo, Revision importe) {
        this.nroFactura = nroFactura;
        this.fechaCobro = fechaCobro;
        this.codFactura = codFactura;
        this.horaCobro = horaCobro;
        this.condicionIVA = condicionIVA;
        this.vehiculo = vehiculo;
        this.importe = importe;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(String fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public String getHoraCobro() {
        return horaCobro;
    }

    public void setHoraCobro(String horaCobro) {
        this.horaCobro = horaCobro;
    }

    public double getCondicionIVA() {
        return condicionIVA;
    }

    public void setCondicionIVA(double condicionIVA) {
        this.condicionIVA = condicionIVA;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Revision getImporte() {
        return importe;
    }

    public void setImporte(Revision importe) {
        this.importe = importe;
    }
}
