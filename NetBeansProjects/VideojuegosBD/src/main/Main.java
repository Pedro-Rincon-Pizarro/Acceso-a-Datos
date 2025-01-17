/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import dao.DlcDao;
import dao.VideojuegoDao;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import modelo.Dlc;
import modelo.Videojuego;

/**
 *
 * @author Pedro
 */
public class Main {

    static int eleccion = -1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            menu();
        } while (eleccion != 0);
    }

    public static void menu() {
        System.out.println("----MENU INICIO----");
        System.out.println("1.-Menú Videojuegos:");
        System.out.println("2.-Menú Dlcs:");
        System.out.println("3.-Menú Desarrolladoras:");
        System.out.println("4.-Menú Programadores:");
        System.out.println("0.-Salir.");
        eleccion = sc.nextInt();

        switch (eleccion) {
            case 0:
                System.out.println("Saliendo del programa");
                System.exit(0);
                break;

            case 1:
                do {
                    menuVideojuegos();
                } while (eleccion != 0);
                eleccion = -1;
                break;

            case 2:
                do {
                    menuDlcs();
                } while (eleccion != 0);
                eleccion = -1;
                break;

            case 3:
                do {
                    menuDesarrolladoras();
                } while (eleccion != 0);
                eleccion = -1;
                break;

            case 4:
                do {
                    menuProgramadores();
                } while (eleccion != 0);
                eleccion = -1;
                break;
            default:
                System.out.println("¡¡¡EROR!!!Elige una opción válida");
                throw new AssertionError();
        }
    }

    public static void menuVideojuegos() {
        VideojuegoDao videojuegoDao = new VideojuegoDao();
        System.out.println("----MENU VIDEOJUEGOS----");
        System.out.println("1.-Listar todos los Videojuegos:");
        System.out.println("2.-Listar todos los videojuegos por fecha:");
        System.out.println("3.-Buscar Juego por nombre:");
        System.out.println("4.-Añadir Nuevo Videojuego:");
        System.out.println("4.-Modificar Videojuego:");
        System.out.println("4.-Eliminar Videojuego:");
        System.out.println("0.-Volver a menú Principal.");
        eleccion = sc.nextInt();

        switch (eleccion) {
            case 0:
                System.out.println("Volviendo al Menú principal");
                break;

            case 1:
                System.out.println("Lista de videojuegos:");
                List<Videojuego> videojuegos = videojuegoDao.listarTodosLosVideojuegos();
                for (Videojuego videojuego : videojuegos) {
                    System.out.println("ID Videojuego: " + videojuego.getId_videojuego()
                            + "\nNombre: " + videojuego.getNombre()
                            + "\nGenero: " + videojuego.getGenero()
                            + "\nDesarrollador: " + videojuego.getDesarrollador()
                            + "\nPrecio: " + videojuego.getPrecio()
                            + "\nFecha de lanzamiento: " + videojuego.getFecha_lanzamiento());
                }
                break;

            case 2:
                System.out.println("Lista de videojuegos por fecha de lanzamiento:");
                List<Videojuego> videojuegosPorFecha = videojuegoDao.ordenarVideojuegosPorFecha();
                for (Videojuego videojuego : videojuegosPorFecha) {
                    System.out.println("ID Videojuego: " + videojuego.getId_videojuego()
                            + "\nNombre: " + videojuego.getNombre()
                            + "\nGenero: " + videojuego.getGenero()
                            + "\nDesarrollador: " + videojuego.getDesarrollador()
                            + "\nPrecio: " + videojuego.getPrecio()
                            + "\nFecha de lanzamiento: " + videojuego.getFecha_lanzamiento());
                }
                break;

            case 3:
                System.out.println("Introduce el nombre del juego buscado");
                Videojuego videojuegoBuscado = videojuegoDao.buscarVideojuegoPorNombre(sc.next());

                System.out.println("ID Videojuego: " + videojuegoBuscado.getId_videojuego()
                        + "\nNombre: " + videojuegoBuscado.getNombre()
                        + "\nGenero: " + videojuegoBuscado.getGenero()
                        + "\nDesarrollador: " + videojuegoBuscado.getDesarrollador()
                        + "\nPrecio: " + videojuegoBuscado.getPrecio()
                        + "\nFecha de lanzamiento: " + videojuegoBuscado.getFecha_lanzamiento());
                break;

            case 4:
                System.out.println("Introduce el nombre del Nuevo Videojuego:");
                String nombre = sc.next();
                String genero = sc.next();
                String desarrollador = sc.next();
                double precio = sc.nextFloat();
                System.out.println("Introduce una fecha (dd/MM/yyyy):");
                String input = sc.nextLine();

                // Crear un SimpleDateFormat para el formato de fecha esperado
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                try {
                    // Intentar convertir el String en un objeto Date
                    Date fechaLanzamiento = dateFormat.parse(input);
                } catch (Exception e) {
                    // Si ocurre un error (por ejemplo, formato incorrecto)
                    System.out.println("El formato de la fecha es incorrecto.");
                }
                
                Videojuego videojuegoNuevo = videojuegoDao.
                break;
                
                

            case 5:
                System.out.println("Introduce el nombre del Videojuego a modificar:");
                break;

            case 6:
                System.out.println("Introduce el nombre del Videojuego a eliminar:");
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void menuDlcs() {
        DlcDao dlcDao = new DlcDao();
        System.out.println("----MENU DLC'S----");
        System.out.println("1.-Listar todos los DLC'S:");
        System.out.println("2.-Listar todos los DLC'S por fecha:");
        System.out.println("3.-Buscar DLC'S por ID de Videojuego:");
        System.out.println("4.-Añadir Nuevo DLC:");
        System.out.println("4.-Modificar DLC:");
        System.out.println("4.-Eliminar DLC:");
        System.out.println("0.-Volver a menú Principal.");
        eleccion = sc.nextInt();

        switch (eleccion) {
            case 0:
                System.out.println("Volviendo al Menú principal");
                break;

            case 1:
                try {
                    System.out.println("Lista de DLC'S:");
                    List<Dlc> dlcs = dlcDao.listarTodosDlc();
                    for (Dlc dlc : dlcs) {
                        System.out.println("ID DLC: " + dlc.getId_videojuego()
                                + "\nNombre: " + dlc.getNombre()
                                + "\nPrecio: " + dlc.getPrecio()
                                + "\nFecha de lanzamiento: " + dlc.getFecha_lanzamiento());
                    }
                } catch (Exception e) {
                }
                break;

            case 2:
                System.out.println("Lista de DLC'S por fecha de lanzamiento:");
                List<Dlc> dlcPorPrecio = dlcDao.listarDlcsPorPrecio();
                for (Dlc dlc : dlcPorPrecio) {
                    System.out.println("ID Videojuego: " + dlc.getId_videojuego()
                            + "\nNombre: " + dlc.getNombre()
                            + "\nPrecio: " + dlc.getPrecio()
                            + "\nFecha de lanzamiento: " + dlc.getFecha_lanzamiento());
                }
                break;

            case 3:
                System.out.println("Introduce el nombre del juego buscado");
                List<Dlc> dlcDeVideojuego = dlcDao.listarDlcsPorIdVideojuego(sc.nextInt());

                for (Dlc dlc : dlcDeVideojuego) {
                    System.out.println("ID Videojuego: " + dlc.getId_videojuego()
                            + "\nNombre: " + dlc.getNombre()
                            + "\nPrecio: " + dlc.getPrecio()
                            + "\nFecha de lanzamiento: " + dlc.getFecha_lanzamiento());
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void menuDesarrolladoras() {

    }

    public static void menuProgramadores() {

    }
}
