/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializableejercicio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import serializableejercicio.Pedido.Estado;

/**
 *
 * @author pedro.rinpiz
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    static ListadoClientes listaCli = new ListadoClientes();
    static ListadoProductos listaProd = new ListadoProductos();
    static ListadoPedidos listaPed = new ListadoPedidos();

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

        listaCli.cargarClientes();
        listaProd.cargarProductos();
        listaPed.cargarPedidos();

        menu();
    }

    public static int menu() {
        int eleccion = 0;
        do {
            System.out.println("Menu de opciones:");
            System.out.println("1. Ver datos de producto por nombre");
            System.out.println("2. Ver datos de cliente por ID");
            System.out.println("3. Mostrar listado de productos ordenados por precio");
            System.out.println("4. Añadir nuevo cliente");
            System.out.println("5. Añadir nuevo producto");
            System.out.println("6. Realizar nuevo pedido");
            System.out.println("7. Mostrar pedidos por cliente");
            System.out.println("8. Actualizar estado de un pedido");
            System.out.println("9. Salir");
            eleccion = sc.nextInt();
            sc.nextLine();
            opciones(eleccion);
        } while (eleccion != 9);
        return eleccion;
    }

    public static void opciones(int eleccion) {
        switch (eleccion) {
            case 1:
                System.out.println("Lista de Productos");
                for (Producto p : listaProd.getArrayProductos()) {
                    System.out.println(p.getNombreProducto());
                }
                System.out.println("Introduce el nombre del producto a buscar");
                String nombreProd = sc.nextLine();
                Producto prodTemp = listaProd.buscarProductoDispPorNombre(nombreProd);
                if (prodTemp.getDescripcion() != null) {
                    System.out.println(prodTemp.toString());
                } else {
                    System.out.println("El producto no está en la lista");
                }

                break;

            case 2:
                System.out.println("Lista de Clientes");
                for (Cliente c : listaCli.getArrayClientes()) {
                    System.out.println(c.getNombre() + " : ID : " + c.getIdCliente());
                }
                System.out.println("Introduce el ID del cliente a buscar");
                int id = sc.nextInt();
                sc.nextLine();

                Cliente cliTemp = listaCli.buscarClientePorId(id);
                if (cliTemp.getNombre() != null) {
                    System.out.println(cliTemp.toString());
                } else {
                    System.out.println("El Cliente no está en la lista");
                }

                break;

            case 3:
                System.out.println("Lista de productos ordenados por precio ascendente");
                listaProd.ordenarProductosPorPrecio();
                break;

            case 4:
                System.out.println("Introduce el nombre del Usuario");
                String nombreCli = sc.nextLine();
                System.out.println("Introduce el email del Usuario");
                String emailCli = sc.next();
                sc.nextLine();
                System.out.println("Introduce la direccion del Usuario");
                String direccionCli = sc.nextLine();
                System.out.println("Introduce el telefono del Usuario");
                String tlfCli = sc.nextLine();
                Cliente cli = new Cliente(nombreCli, emailCli, direccionCli, tlfCli);
                listaCli.agregarCliente(cli);
                listaCli.actualizarFicheroClientes();
                break;

            case 5:
                System.out.println("Introduce el nombre del Producto");
                String nombreNewProd = sc.nextLine();
                System.out.println("Introduce la descripción del Producto");
                String descripcionProd = sc.nextLine();
                System.out.println("Introduce el precio del Producto");
                double predioProd = sc.nextDouble();
                sc.nextLine();
                System.out.println("Introduce la cantidad disponible del Producto");
                int cantidadProd = sc.nextInt();
                sc.nextLine();
                Producto prod = new Producto(nombreNewProd, descripcionProd, predioProd, cantidadProd);
                listaProd.agregarProducto(prod);
                listaProd.actualizarFicheroProductos();
                break;

            case 6:
                String nombreProdPed;
                String estadoPed;
                Estado estado = null;
                ArrayList<Producto> arrayTemp = new ArrayList<Producto>();
                int cantidad;
                System.out.println("Introduce el ID del Cliente");
                int idCli = sc.nextInt();
                sc.nextLine();
                do 
                {

                    System.out.println("Lista de productos disponibles");
                    listaProd.ordenarProductosPorPrecio();
                    System.out.println("Introduce el nombre del producto(Introduce * para terminar de introducir productos)");
                    nombreProdPed = sc.nextLine();

                    Producto proTemp = listaProd.buscarProductoDispPorNombre(nombreProdPed);
                    if (proTemp.getNombreProducto() != null) 
                    {
                        
                        System.out.println("Introduce la cantidad deseada");
                        cantidad = sc.nextInt();
                        sc.nextLine();
                        if(proTemp.getCantidadDisponible()>= cantidad)
                        {
                            proTemp.setCantidadDisponible(cantidad);
                            listaProd.buscarProductoDispPorNombre(nombreProdPed).setCantidadDisponible(proTemp.getCantidadDisponible() - cantidad);//esta linea es en confirmarPedido
                            arrayTemp.add(listaProd.buscarProductoDispPorNombre(nombreProdPed));
                        }
                        else
                        {
                            System.out.println("No hay suficientes existencias de " + proTemp.getNombreProducto());
                        }
                        
                    } 
                    else if (proTemp.getNombreProducto() == null && !nombreProdPed.equals("*")) 
                    {
                        System.out.println("El producto " + nombreProdPed + " no está disponible");
                    }

                } while (!nombreProdPed.equals("*"));

                LocalDate fechaPed = LocalDate.now();
                do {
                    System.out.println("Introduce el estado del Pedido(Pendiente/Enviado/Entregado)");
                    estadoPed = sc.next();
                } while (!estadoPed.equals("Pendiente") && !estadoPed.equals("Enviado") && !estadoPed.equals("Entregado"));

                if (estadoPed.equalsIgnoreCase("Pendiente")) {
                    estado = Estado.Pendiente;
                } else if (estadoPed.equalsIgnoreCase("Enviado")) {
                    estado = Estado.Enviado;
                } else if (estadoPed.equals("Entregado")) {
                    estado = Estado.Entregado;
                }
                Pedido ped = new Pedido(idCli, arrayTemp, fechaPed, estado);
                listaPed.agregarPedidos(ped);
                listaPed.actualizarFicheroPedidos();
                break;

            case 7:
                System.out.println("Introduce el ID del Cliente para ver su lista de pedidos");
                System.out.println("ID's disponibles");
                for (Cliente c : listaCli.getArrayClientes()) {
                    System.out.println(c.getIdCliente());
                }
                int idCliPed = sc.nextInt();
                sc.nextLine();
                listaPed.mostrarPedidosPorCliente(idCliPed);
                break;

            case 8:
                String estadoModPed;
                System.out.println("Introduce el ID del Pedido a modificar");
                System.out.println("Lista de pedidos");
                listaPed.mostrarPedidos();
                int idModPed = sc.nextInt();
                sc.nextLine();
                do {
                    System.out.println("Introduce el nuevo estado del Pedido(Pendiente/Enviado/Entregado)");
                    estadoModPed = sc.next();
                } while (!estadoModPed.equalsIgnoreCase("Pendiente") && !estadoModPed.equalsIgnoreCase("Enviado") && !estadoModPed.equalsIgnoreCase("Entregado"));
                listaPed.actualizarEstadoPedido(idModPed, estadoModPed.toLowerCase());
                listaProd.actualizarFicheroProductos();

                break;

            case 9:
                listaCli.actualizarFicheroClientes();
                listaProd.actualizarFicheroProductos();
                listaPed.actualizarFicheroPedidos();
                System.out.println("Saliendo del programa");
                sc.close();
                System.exit(0);
                break;
                
            case 10:
                
                break;
            default:
                throw new AssertionError();
        }

    }
}
