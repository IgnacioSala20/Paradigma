package org.example.Modelo;

public class Revision {
    private int nroRevision;
    private String fechaRevision;
    private String fechaAlta;
    private Vehiculo vehiculo;
    private DetalleMedicion detalleMedicion;
    private DefectosVisuales defectosVisuales;
    private Oblea oblea;
    private Tarifa tarifa;
    private Empleado empleado;

    public Revision() {
    }

    public Revision(int nroRevision, String fechaRevision, String fechaAlta, Vehiculo vehiculo, DetalleMedicion detalleMedicion, DefectosVisuales defectosVisuales, Oblea oblea, Tarifa tarifa, Empleado empleado) {
        this.nroRevision = nroRevision;
        this.fechaRevision = fechaRevision;
        this.fechaAlta = fechaAlta;
        this.vehiculo = vehiculo;
        this.detalleMedicion = detalleMedicion;
        this.defectosVisuales = defectosVisuales;
        this.oblea = oblea;
        this.tarifa = tarifa;
        this.empleado = empleado;
    }

    public int getNroRevision() {
        return nroRevision;
    }

    public void setNroRevision(int nroRevision) {
        this.nroRevision = nroRevision;
    }

    public String getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(String fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public DetalleMedicion getDetalleMedicion() {
        return detalleMedicion;
    }

    public void setDetalleMedicion(DetalleMedicion detalleMedicion) {
        this.detalleMedicion = detalleMedicion;
    }

    public DefectosVisuales getDefectosVisuales() {
        return defectosVisuales;
    }

    public void setDefectosVisuales(DefectosVisuales defectosVisuales) {
        this.defectosVisuales = defectosVisuales;
    }

    public Oblea getOblea() {
        return oblea;
    }

    public void setOblea(Oblea oblea) {
        this.oblea = oblea;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
