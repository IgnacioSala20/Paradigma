package org.example.Modelo;

public class Empleado extends Persona{
    private String legajo;
    private String descripcion;
    private String rol;

    public Empleado(String nombre, String apellido, Domicilio domicilio, String contacto, String tipoDocumento, String numDocumento, String fechaNacimiento, String legajo, String descripcion, String rol) {
        super(nombre, apellido, domicilio, contacto, tipoDocumento, numDocumento, fechaNacimiento);
        this.legajo = legajo;
        this.descripcion = descripcion;
        this.rol = rol;
    }
    public Empleado(){
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}

