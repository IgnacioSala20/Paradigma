package org.example.Gestor;

import org.example.Modelo.*;

import java.io.*;
import java.util.Scanner;

public class GestorVehiculo {

    Scanner scanner = new Scanner(System.in);
    GestorCliente gestorCliente = new GestorCliente();

    public void ConsultarVehiculo(){
        System.out.println("Ingrese la patente del vehiculo que deseas buscar");
        String patenteBuscar = scanner.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Vehiculo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {//mientras haya una linea mas en el archivo
                String[] datos = linea.split(","); //tomo los datos


                if (datos.length == 8) {
                    String tipoPatente = datos[0].trim();
                    String patente = datos[1].trim();
                    int punteroMarca = Integer.parseInt(datos[2].trim());
                    int  añoFabricacion = Integer.parseInt(datos[3].trim());
                    Double kilometros = Double.parseDouble(datos[4].trim());
                    int nroChasis = Integer.parseInt(datos[5].trim());
                    int punteroTipoVehiculo = Integer.parseInt(datos[6].trim());
                    int punteroNumeroCliente = Integer.parseInt(datos[7].trim());


                    if (patenteBuscar.toUpperCase().equals(patente.toUpperCase())) {
                        Marca marca = conocerMarca(punteroMarca);
                        TipoVehiculo tipoVehiculo = conocerTipoVehiculo(punteroTipoVehiculo);
                        Cliente cliente = gestorCliente.conocerCliente(punteroNumeroCliente);
                        org.example.Modelo.Vehiculo vehiculo = new Vehiculo(tipoPatente,patente,marca,añoFabricacion,kilometros,nroChasis,tipoVehiculo,cliente);
                        System.out.println(vehiculo);

                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public Marca conocerMarca(int punteroMarcaBuscer){
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Marca.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {//mientras haya una linea mas en el archivo
                String[] datos = linea.split(","); //tomo los datos

                if (datos.length == 4) {
                    int punteroMarca = Integer.parseInt(datos[0].trim());
                    String nombre = datos[1].trim();
                    int  punteroModelo = Integer.parseInt(datos[2].trim());
                    String descripcion = datos[3].trim();

                    if (punteroMarcaBuscer == punteroMarca){
                        Modelo modelo = conocerModelo(punteroModelo);
                        Marca marca = new Marca(nombre,modelo,descripcion);
                        return marca;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return null;
    }

    public Modelo conocerModelo(int punteroModeloBuscar){
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Modelo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {//mientras haya una linea mas en el archivo
                String[] datos = linea.split(","); //tomo los datos

                if (datos.length == 4) {
                    int punteroModelo = Integer.parseInt(datos[0].trim());
                    String nombreModelo = datos[1].trim();
                    int año = Integer.parseInt(datos[2].trim());
                    String  descripcion = datos[3].trim();

                    if (punteroModeloBuscar == punteroModelo){
                        org.example.Modelo.Modelo modelo = new Modelo(nombreModelo,año,descripcion);
                        return modelo;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return null;
    }

    private TipoVehiculo conocerTipoVehiculo(int punteroTipoVehiculoBuscar){
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\tipoVehiculo"))) {
            String linea;
            while ((linea = br.readLine()) != null) {//mientras haya una linea mas en el archivo
                String[] datos = linea.split(","); //tomo los datos


                if (datos.length == 4) {
                    int punteroTipoVehiculo = Integer.parseInt(datos[0].trim());
                    int peso = Integer.parseInt(datos[1].trim());
                    String descripcion = datos[2].trim();
                    double precioUnitario = Double.parseDouble(datos[3].trim());

                    if (punteroTipoVehiculoBuscar == punteroTipoVehiculo){
                        org.example.Modelo.TipoVehiculo tipoVehiculo = new TipoVehiculo(peso,precioUnitario,descripcion);
                        return tipoVehiculo;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return null;
    }

    public void registrarVehiculo(){
        //int numeroVehiculo = ultimoNumeroVehiculo();
        System.out.println("Ingrese el tipo de patente del vehiculo: ");
        String tipoPatente = scanner.nextLine();
        System.out.println("Ingrese la patente del vehiculo: ");
        String patente = scanner.nextLine();
        Marca marca = registrarMarca();
        System.out.println("Ingrese el año de fabricacion: ");
        int añoFabricacion = scanner.nextInt();
        System.out.println("Ingrese los kilometros: ");
        Double kilometro = scanner.nextDouble();
        System.out.println("Ingrese el numero de chasis: ");
        int numeroChasis = scanner.nextInt();
        conocerTipoVehiculo(registrarTipoVehiculo());
        System.out.println("Ingrese el numero de documento del cliente: ");
        String documento = scanner.nextLine();
        gestorCliente.consultarCliente(documento);

        String nuevoVehiculo = tipoPatenteipoPatente() + "," +
                patente() + "," +
                vehiculo.getMarca() + "," +
                vehiculo.getAñoFabricacion() + "," +
                vehiculo.getKilometro() + "," +
                vehiculo.getNroChasis() + "," +
                vehiculo.getTipoVehiculo();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Vehiculo.txt", true))) { // "true" activa el modo append
            bw.newLine(); // Agrega una nueva línea antes de escribir el nuevo registro
            bw.write(nuevoVehiculo); // Escribe la línea en el archivo
            System.out.println("Vehiculo registrado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    private Marca registrarMarca(){
        System.out.println("Ingrese el nombre de la marca");
        String nombre = scanner.nextLine();
        int punteroMarca = UltimopunteroMarca();
        String descripcion = "No esta definida";
        Modelo modelo = verificarModelo();

        Marca marca = new Marca(nombre,modelo,descripcion);
        return marca;

    }
    private int UltimopunteroMarca(){
        int numeroPunteroMarcaMayor = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Marca.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {//mientras haya una linea mas en el archivo
                String[] datos = linea.split(","); //tomo los datos

                if (datos.length == 4) {
                    int punteroMarca = Integer.parseInt(datos[0].trim());

                    if (punteroMarca > numeroPunteroMarcaMayor) {
                        numeroPunteroMarcaMayor = punteroMarca;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return numeroPunteroMarcaMayor + 1;
    }

    private Modelo verificarModelo() {
        System.out.println("Ingrese el nombre del modelo");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el año de fabricacion");
        int año = scanner.nextInt();
        if (consultarModelo(nombre, año) != 0) {
            return conocerModelo(consultarModelo(nombre, año));
        }
        int punteroModelo = UltimpoPunteroModelo();
        String descripcion = "Nothing";
        Modelo modelo = new Modelo(nombre,año,descripcion);
        registrarModelo(modelo,punteroModelo);
        return conocerModelo(punteroModelo);
    }
    private int consultarModelo(String nombre, int año){
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Modelo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {//mientras haya una linea mas en el archivo
                String[] datos = linea.split(","); //tomo los datos

                if (datos.length == 4) {
                    int punteroModelo = Integer.parseInt(datos[0].trim());
                    String nombreModelo = datos[1].trim();
                    int añoModelo = Integer.parseInt(datos[2].trim());
                    String  descripcion = datos[3].trim();

                    if (nombre.equals(nombreModelo) && año == añoModelo ){;
                        return punteroModelo;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return 0;
    }
    private int UltimpoPunteroModelo(){
        int numeroPunteroModeloMayor = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Modelo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {//mientras haya una linea mas en el archivo
                String[] datos = linea.split(","); //tomo los datos

                if (datos.length == 4) {
                    int punteroModelo= Integer.parseInt(datos[0].trim());

                    if (punteroModelo > numeroPunteroModeloMayor) {
                        numeroPunteroModeloMayor = punteroModelo;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return numeroPunteroModeloMayor + 1;
    }
    private void registrarModelo(Modelo modelo,int punteroModelo){
        String nuevoModelo = punteroModelo + "," +
                modelo.getNombreModelo() + "," +
                modelo.getAnio() + "," +
                modelo.getDescripcion();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\Clientes.txt", true))) { // "true" activa el modo append
            bw.newLine(); // Agrega una nueva línea antes de escribir el nuevo registro
            bw.write(nuevoModelo); // Escribe la línea en el archivo
            System.out.println("Cliente registrado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public int registrarTipoVehiculo(){
        System.out.println("Ingrese el peso del vehiculo");
        int peso = scanner.nextInt();
        System.out.println(conocerTipoVehiculo(verificarTipoVehiculo(peso)));
        return verificarTipoVehiculo(peso);

        //hacer un metodo que verifique el nombre de la marca
    }
    public int verificarTipoVehiculo(int pesoVehiculo){
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\Paradigma\\src\\main\\java\\org\\example\\BaseDatos\\tipoVehiculo"))) {
            String linea;
            while ((linea = br.readLine()) != null) {//mientras haya una linea mas en el archivo
                String[] datos = linea.split(","); //tomo los datos
                System.out.println(datos);

                if (datos.length == 5) {
                    int punteroTipoVehiculo = Integer.parseInt(datos[0].trim());
                    int pesoMinimo = Integer.parseInt(datos[1].trim());
                    int pesoMaximo = Integer.parseInt(datos[2].trim());
                    if(pesoVehiculo>=pesoMinimo && pesoVehiculo<=pesoMaximo){
                        return punteroTipoVehiculo;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return 0;
    }
}
