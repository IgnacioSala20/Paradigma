package org.example;
import org.example.Gestor.GestorCliente;
import org.example.Gestor.GestorVehiculo;


public class Main {
    public static void main(String[] args) {
        GestorCliente gestorCliente = new GestorCliente();
        GestorVehiculo gestorVehiculo = new GestorVehiculo();

        gestorVehiculo.registrarTipoVehiculo();
    }
}