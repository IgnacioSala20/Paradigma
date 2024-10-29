package org.example.Modelo;

public class Oblea {
    private int nroOblea;
    private String fechaAlta;
    private EstadoOblea estadoOblea;
    private String fechaConsumido;

    public Oblea() {
    }

    public Oblea(int nroOblea, String fechaAlta, EstadoOblea estadoOblea, String fechaConsumido) {
        this.nroOblea = nroOblea;
        this.fechaAlta = fechaAlta;
        this.estadoOblea = estadoOblea;
        this.fechaConsumido = fechaConsumido;
    }

    public int getNroOblea() {
        return nroOblea;
    }

    public void setNroOblea(int nroOblea) {
        this.nroOblea = nroOblea;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public EstadoOblea getEstadoOblea() {
        return estadoOblea;
    }

    public void setEstadoOblea(EstadoOblea estadoOblea) {
        this.estadoOblea = estadoOblea;
    }

    public String getFechaConsumido() {
        return fechaConsumido;
    }

    public void setFechaConsumido(String fechaConsumido) {
        this.fechaConsumido = fechaConsumido;
    }
}
