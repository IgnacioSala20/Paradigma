package org.example.Modelo;

public class Cliente extends Persona{
    private Turno turno;
    private int numCliente;

    public Cliente(Turno turno, int numCliente) {
        this.turno = turno;
        this.numCliente = numCliente;
    }

    public Cliente(String nombre, String apellido, Domicilio domicilio, String contacto, String tipoDocumento, String numDocumento, String fechaNacimiento, Turno turno, int numCliente) {
        super(nombre, apellido, domicilio, contacto, tipoDocumento, numDocumento, fechaNacimiento);
        this.turno = turno;
        this.numCliente = numCliente;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "fechaNacimiento='" + fechaNacimiento + '\'' +
                ", numDocumento='" + numDocumento + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", contacto='" + contacto + '\'' +
                ", domicilio=" + domicilio +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", numCliente=" + numCliente +
                ", turno=" + turno +
                "} ";
    }
}
