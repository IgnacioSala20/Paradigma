package org.example.Modelo;

public class EstadoTurno {
    //Pendiente-Realizado-Cancelado
    private String valores;

    public EstadoTurno() {
    }

    public EstadoTurno(String valores) {
        this.valores = valores;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }
}
