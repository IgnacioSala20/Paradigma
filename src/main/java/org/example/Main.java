package org.example;

import org.example.Gestor.GestorCliente;
import org.example.Gestor.GestorVehiculo;
import org.example.Vista.Principal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestorCliente gestorCliente = new GestorCliente();
        GestorVehiculo gestorVehiculo = new GestorVehiculo();
        //Principal principal=new Principal();
        //principal.setVisible(true);

        gestorCliente.registrarCliente();
    }
}