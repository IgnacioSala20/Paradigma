package org.example.Gestor;

import org.example.Modelo.Cliente;
import org.example.Modelo.Domicilio;

import java.io.*;
import java.util.Scanner;

public class GestorCliente {

    Scanner scanner = new Scanner(System.in);
    GestorDomicilio gestorDomicilio = new GestorDomicilio();

    public void consultarCliente() {
        System.out.println("Ingrese el documento del cliente");
        String documentoBuscar = scanner.nextLine();
        boolean encontrarCliente = false;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Clientes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {//mientras haya una linea mas en el archivo
                String[] datos = linea.split(","); //tomo los datos


                if (datos.length == 7) {
                    String nombre = datos[0].trim();
                    String apellido = datos[1].trim();
                    String contacto = datos[2].trim();
                    String tipoDocumento = datos[3].trim();
                    String documento = datos[4].trim();
                    String fechaNacimiento = datos[5].trim();
                    int numeroCliente = Integer.parseInt(datos[6].trim());


                    if (documentoBuscar.equals(documento)) {
                        Domicilio domicilio = gestorDomicilio.consultarDomicilio(numeroCliente);
                        org.example.Modelo.Cliente cliente = new Cliente(nombre, apellido, domicilio, contacto, tipoDocumento, documento, fechaNacimiento, null, numeroCliente);
                        System.out.println(cliente);
                        encontrarCliente = true;
                        break;
                    }

                }
            }
            if (encontrarCliente == false) {
                System.out.println("No se encontro el cliente");
                System.out.println("Desea registrar un nuevo cliente");
                String respuesta = scanner.nextLine();
                if (respuesta.toUpperCase().equals("SI")) {
                    registrarCliente();
                    ;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void registrarCliente() {

        int numeroCliente = ultimoNumeroCliente();
        System.out.println("Ingrese el nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido");
        String apellido = scanner.nextLine();
        gestorDomicilio.registrarDomicilio(ultimoNumeroCliente());
        Domicilio domicilio = gestorDomicilio.consultarDomicilio(numeroCliente);
        System.out.println("Ingrese el contacto");
        String contacto = scanner.nextLine();
        System.out.println("Ingrese el tipo de documento");
        String tipoDocumento = scanner.nextLine().toUpperCase();
        System.out.println("Ingrese el documento");
        String documento = scanner.nextLine();
        System.out.println("Ingrese el fechaNacimiento");
        String fechaNacimiento = scanner.nextLine();


        org.example.Modelo.Cliente cliente = new Cliente(nombre, apellido, domicilio, contacto, tipoDocumento, documento, fechaNacimiento, null, numeroCliente);
        String nuevoCliente = cliente.getNombre() + "," +
                cliente.getApellido() + "," +
                cliente.getContacto() + "," +
                cliente.getTipoDocumento() + "," +
                cliente.getNumDocumento() + "," +
                cliente.getFechaNacimiento() + "," +
                cliente.getNumCliente();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Clientes.txt", true))) { // "true" activa el modo append
            bw.newLine(); // Agrega una nueva línea antes de escribir el nuevo registro
            bw.write(nuevoCliente); // Escribe la línea en el archivo
            System.out.println("Cliente registrado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public int ultimoNumeroCliente() {
        int numeroMayorCliente = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Clientes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {//mientras haya una linea mas en el archivo
                String[] datos = linea.split(","); //tomo los datos

                if (datos.length == 7) {
                    int numeroCliente = Integer.parseInt(datos[6].trim());

                    if (numeroCliente > numeroMayorCliente) {
                        numeroMayorCliente = numeroCliente;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return numeroMayorCliente+1;
    }
}
