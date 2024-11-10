package org.example.Gestor;

import org.example.Modelo.Cliente;
import org.example.Modelo.Domicilio;
import org.example.Modelo.Vehiculo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GestorVehiculo {

    Scanner scanner = new Scanner(System.in);

    public void consultarVehiculo(){
        System.out.println("Ingrese la patente del vehiculo que deseas buscar");
        String patenteBuscar = scanner.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Vehiculo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {//mientras haya una linea mas en el archivo
                String[] datos = linea.split(","); //tomo los datos


                if (datos.length == 8) {
                    String tipoPatente = datos[0].trim();
                    String patente = datos[1].trim();
                    String marca = datos[2].trim();
                    int  añoFabricacion = Integer.parseInt(datos[3].trim());
                    Double kilometros = Double.parseDouble(datos[4].trim());
                    int nroChasis = Integer.parseInt(datos[5].trim());
                    String tipoVehiculo = datos[6].trim();
                    int numeroCliente = Integer.parseInt(datos[7].trim());


                    if (patenteBuscar.toUpperCase().equals(patente.toUpperCase())) {

                        org.example.Modelo.Vehiculo vehiculo = new Vehiculo(tipoPatente,patente,null,añoFabricacion,kilometros,nroChasis,null,null);
                        System.out.println(vehiculo);

                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
