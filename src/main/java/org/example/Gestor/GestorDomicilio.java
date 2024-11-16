package org.example.Gestor;

import org.example.Modelo.Cliente;
import org.example.Modelo.Domicilio;

import java.io.*;
import java.util.Scanner;

public class GestorDomicilio {

    Scanner scanner = new Scanner(System.in);

    public Domicilio consultarDomicilio(int punteroDomicilioBuscar){
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Domicilio.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {//mientras haya una linea mas en el archivo
                String[] datos = linea.split(","); //tomo los datos

                if (datos.length == 5) {
                    int punteroDomicilio = Integer.parseInt(datos[0].trim());
                    String direccion = datos[1].trim();
                    String ciudad = datos[2].trim();
                    int codigoPostal = Integer.parseInt(datos[3].trim());
                    int numeroDepartamento = Integer.parseInt(datos[4].trim());

                    if(punteroDomicilioBuscar == punteroDomicilio){
                        org.example.Modelo.Domicilio domicilio = new Domicilio(punteroDomicilio,direccion,ciudad,codigoPostal,numeroDepartamento);
                        return domicilio;
                    }
                }

            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
      return null;
    }
    public void registrarDomicilio(int numeroCliente){
        System.out.println("Ingrese la direccion");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese la ciudad");
        String ciudad = scanner.nextLine();
        System.out.println("Ingrese el codigoPostal");
        int codigoPostal = scanner.nextInt();
        System.out.println("Ingrese el numeroDepartamento");
        int numeroDepartamento = scanner.nextInt();

        org.example.Modelo.Domicilio domicilio = new Domicilio(numeroCliente,direccion,ciudad,codigoPostal,numeroDepartamento);

        String nuevoDomicilio = numeroCliente + "," +
                domicilio.getCalle()+ "," +
                domicilio.getCiudad()+ "," +
                domicilio.getCodPostal()+ "," +
                domicilio.getNumDepartamento();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Domicilio.txt", true))) { // "true" activa el modo append
            bw.newLine(); // Agrega una nueva línea antes de escribir el nuevo registro
            bw.write(nuevoDomicilio); // Escribe la línea en el archivo
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
