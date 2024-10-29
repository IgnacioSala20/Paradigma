package org.example.Modelo;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected Domicilio domicilio;
    protected String contacto;
    protected String tipoDocumento;
    protected String numDocumento;
    protected String fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Domicilio domicilio, String contacto, String tipoDocumento, String numDocumento, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.contacto = contacto;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilio=" + domicilio +
                ", contacto='" + contacto + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numDocumento='" + numDocumento + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
