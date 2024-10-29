package org.example.Modelo;

public class DefectosVisuales {
    private String tipoDefecto;
    private String descripcion;
    private Empleado inspector;
    private String estado;

    public DefectosVisuales() {
    }

    public DefectosVisuales(String tipoDefecto, String descripcion, Empleado inspector, String estado) {
        this.tipoDefecto = tipoDefecto;
        this.descripcion = descripcion;
        this.inspector = inspector;
        this.estado = estado;
    }

    public String getTipoDefecto() {
        return tipoDefecto;
    }

    public void setTipoDefecto(String tipoDefecto) {
        this.tipoDefecto = tipoDefecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Empleado getInspector() {
        return inspector;
    }

    public void setInspector(Empleado inspector) {
        this.inspector = inspector;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
