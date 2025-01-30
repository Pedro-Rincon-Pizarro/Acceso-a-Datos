/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import dao.DlcDao;
import dao.ExcepcionesVideojuegos;
import dao.PlataformaDao;
import dao.VideojuegoDao;
import java.text.SimpleDateFormat;
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

    public static void main(String[] args) throws ExcepcionesVideojuegos {
        do {
            menu();
        } while (eleccion != 0);
    }

    public static void menu() throws ExcepcionesVideojuegos 
    {
        System.out.println("----MENU INICIO----");
        System.out.println("1.-Menú Videojuegos:");
        System.out.println("2.-Menú Dlcs:");
        System.out.println("3.-Menú Plataformas:");
        System.out.println("0.-Salir.");
        eleccion = sc.nextInt();

        switch (eleccion)
        {
            case 0:
                System.out.println("Saliendo del programa");
                System.exit(0);
                break;

            case 1:
                do 
                {
                    menuVideojuegos();
                } while (eleccion != 0);
                eleccion = 1;
                break;

            case 2:
                do 
                {
                    menuDlcs();
                } while (eleccion != 0);
                eleccion = 2;
                break;

            case 3:
                do 
                {
                    menuPlataformas();
                } while (eleccion != 0);
                eleccion = 3;
                break;
                
            default:
                System.out.println("¡¡¡EROR!!!Elige una opción válida");
                throw new AssertionError();
        }
    }

    public static void menuVideojuegos() throws ExcepcionesVideojuegos
    {
        VideojuegoDao videojuegoDao = new VideojuegoDao();
        System.out.println("----MENU VIDEOJUEGOS----");
        System.out.println("1.-Listar todos los Videojuegos:");
        System.out.println("2.-Listar todos los videojuegos por fecha:");
        System.out.println("3.-Buscar Juego por nombre:");
        System.out.println("4.-Insertar un nuevo Videojuegos:");
        System.out.println("5.-Modificar Videojuego:");
        System.out.println("6.-Eliminar Videojuego:");
        System.out.println("0.-Volver a menú Principal.");
        eleccion = sc.nextInt();

        switch (eleccion) 
        {
            case 0:
                System.out.println("Volviendo al Menú principal");
                break;

            case 1:
                try {
                    System.out.println("Lista de videojuegos:");
                List<Videojuego> videojuegos = videojuegoDao.listarTodosLosVideojuegos();
                for (Videojuego videojuego : videojuegos) 
                {
                    System.out.println("ID Videojuego: " + videojuego.getId_videojuego()
                            + "\nid_plataforma: " + videojuego.getId_plataforma()
                            + "\nNombre: " + videojuego.getNombre()
                            + "\nGenero: " + videojuego.getGenero()
                            + "\nPrecio: " + videojuego.getPrecio()
                            + "\nFecha de lanzamiento: " + videojuego.getFecha_lanzamiento());
                }
                } catch (ExcepcionesVideojuegos e) {
                    System.err.println(e.getMensajeUsuario());
                }
                break;

            case 2:
                try {
                    System.out.println("Lista de videojuegos por fecha de lanzamiento:");
                List<Videojuego> videojuegosPorFecha = videojuegoDao.ordenarVideojuegosPorFecha();
                for (Videojuego videojuego : videojuegosPorFecha) 
                {
                    System.out.println("ID Videojuego: " + videojuego.getId_videojuego()
                            + "\nid_plataforma: " + videojuego.getId_plataforma()
                            + "\nNombre: " + videojuego.getNombre()
                            + "\nGenero: " + videojuego.getGenero()
                            + "\nPrecio: " + videojuego.getPrecio()
                            + "\nFecha de lanzamiento: " + videojuego.getFecha_lanzamiento());
                }
                } catch (ExcepcionesVideojuegos e) {
                    System.err.println(e.getMensajeUsuario());
                }
                break;

            case 3:
                try {
                    System.out.println("Introduce el nombre del juego buscado");
                    List<Videojuego> juegosBuscados = videojuegoDao.buscarVideojuegoPorNombre(sc.next());
                    for(Videojuego v : juegosBuscados)
                    {
                         System.out.println("ID Videojuego: " + v.getId_videojuego()
                        + "\nid_plataforma: " + v.getId_plataforma()
                            + "\nNombre: " + v.getNombre()
                            + "\nGenero: " + v.getGenero()
                            + "\nPrecio: " + v.getPrecio()
                            + "\nFecha de lanzamiento: " + v.getFecha_lanzamiento());
                    }
                

               
                } catch (ExcepcionesVideojuegos e) {
                    System.err.println(e.getMensajeUsuario());
                }
                break;

            case 4:
                Videojuego videojuegoNuevo;
                Date fechaLanzamiento;
                System.out.println("Introduce el ID de la plataforma a la que pertenece");
                int id_plataforma = sc.nextInt();
                System.out.println("Introduce el nombre del Nuevo Videojuego:");
                String nuevoNombre = sc.next();
                System.out.println("Introduce el Genero del Nuevo Videojuego:");
                String NuevoGenero = sc.next();
                System.out.println("Introduce el precio del Nuevo Videojuego:");
                double precio = sc.nextFloat();
                System.out.println("Introduce la fecha de lanzamiento del Nuevo Videojuego(dd/MM/yyyy):");
                String input = sc.nextLine();

                // Crear un SimpleDateFormat para el formato de fecha esperado
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                try 
                {
                    // Intentar convertir el String en un objeto Date
                    fechaLanzamiento = dateFormat.parse(input);
                    
                } 
                catch (Exception e) 
                {
                    // Si ocurre un error (por ejemplo, formato incorrecto)
                    System.out.println("El formato de la fecha es incorrecto.");
                    fechaLanzamiento = null;
                }
                videojuegoNuevo = new Videojuego(-1, id_plataforma, nuevoNombre, NuevoGenero, precio, fechaLanzamiento);
                videojuegoDao.crearNuevoVideojuego(videojuegoNuevo);
                break;

            case 5:
                System.out.println("Introduce el ID del juego a modificar");
                int idMod = sc.nextInt();
                System.out.println("Introduce el ID de la plataforma a la quie pertenece");
                int idPlatMod = sc.nextInt();
                System.out.println("Introduce el nuevo nombre del Videojuego a modificar");
                String nombreMod = sc.next();
                System.out.println("Introduce el nuevo genero del Videojuego a modificar");
                String generoMod = sc.next();
                System.out.println("Introduce el nuevo desarrollador del Videojuego a modificar");
                String desarrolladorMod = sc.next();
                System.out.println("Introduce el nuevo precio del Videojuego a modificar");
                float precioMod = sc.nextFloat();
                System.out.println("Introduce la nueva fecha de lanzamiento del Videojuego a modificar(dd/MM/yyyy):");
                input = sc.nextLine();

                // Crear un SimpleDateFormat para el formato de fecha esperado
                dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                try 
                {
                    // Intentar convertir el String en un objeto Date
                    fechaLanzamiento = dateFormat.parse(input);

                } 
                catch (Exception e)
                {
                    // Si ocurre un error (por ejemplo, formato incorrecto)
                    System.out.println("El formato de la fecha es incorrecto.");
                    fechaLanzamiento = null;
                }
                Videojuego videojuegoMod = new Videojuego(idMod, idPlatMod, nombreMod, generoMod, precioMod, fechaLanzamiento);

                System.out.println("ID Videojuego: " + videojuegoMod.getId_videojuego()
                        + "\nid_plataforma: " + videojuegoMod.getId_plataforma()
                            + "\nNombre: " + videojuegoMod.getNombre()
                            + "\nGenero: " + videojuegoMod.getGenero()
                            + "\nPrecio: " + videojuegoMod.getPrecio()
                            + "\nFecha Lanzamiento: " + videojuegoMod.getFecha_lanzamiento());
                System.out.println("Videojuego modificado correctamente.");
                break;

            case 6:
                System.out.println("Introduce el ID del juego buscado");
                int idEliminar = sc.nextInt();

                videojuegoDao.borrarVideojuego(idEliminar);

                System.out.println("Videojuego con id " + idEliminar + " eliminado correctamente.");
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void menuDlcs() throws ExcepcionesVideojuegos
    {
        SimpleDateFormat dateFormat = null;
        DlcDao dlcDao = new DlcDao();
        System.out.println("----MENU DLCS----");
        System.out.println("1.-Listar todos los DLC:");
        System.out.println("2.-Listar todos los DLC por fecha:");
        System.out.println("3.-Buscar DLC por nombre:");
        System.out.println("4.-Insertar un nuevo DLC:");
        System.out.println("5.-Modificar DLC:");
        System.out.println("6.-Eliminar DLC:");
        System.out.println("0.-Volver a menú Principal.");
        int eleccion = sc.nextInt();

        switch (eleccion) 
        {
            case 0:
                System.out.println("Volviendo al Menú principal");
                break;

            case 1:
                System.out.println("Lista de DLCs:");
                List<Dlc> dlcs = dlcDao.listarTodosLosDlcs();
                for (Dlc dlc : dlcs) 
                {
                    System.out.println("ID DLC: " + dlc.getId_dlc()
                            + "\nID Videojuego: " + dlc.getId_videojuego()
                            + "\nNombre: " + dlc.getNombre()
                            + "\nPrecio: " + dlc.getPrecio()
                            + "\nFecha de lanzamiento: " + dlc.getFecha_lanzamiento());
                }
                break;

            case 2:
                System.out.println("Lista de DLCs por fecha de lanzamiento:");
                List<Dlc> dlcsPorFecha = dlcDao.ordenarDlcsPorFecha();
                for (Dlc dlc : dlcsPorFecha) 
                {
                    System.out.println("ID DLC: " + dlc.getId_dlc()
                            + "\nID Videojuego: " + dlc.getId_videojuego()
                            + "\nNombre: " + dlc.getNombre()
                            + "\nPrecio: " + dlc.getPrecio()
                            + "\nFecha de lanzamiento: " + dlc.getFecha_lanzamiento());
                }
                break;

            case 3:
                System.out.println("Introduce el nombre del DLC buscado:");
                Dlc dlcBuscado = dlcDao.buscarDlcPorNombre(sc.next());
                if (dlcBuscado != null) 
                {
                    System.out.println("ID DLC: " + dlcBuscado.getId_dlc()
                            + "\nID Videojuego: " + dlcBuscado.getId_videojuego()
                            + "\nNombre: " + dlcBuscado.getNombre()
                            + "\nPrecio: " + dlcBuscado.getPrecio()
                            + "\nFecha de lanzamiento: " + dlcBuscado.getFecha_lanzamiento());
                }
                else 
                {
                    System.out.println("DLC no encontrado.");
                }
                break;

            case 4:
                System.out.println("Introduce el ID del videojuego asociado:");
                int idVideojuego = sc.nextInt();
                System.out.println("Introduce el nombre del nuevo DLC:");
                String nombreDlc = sc.next();
                System.out.println("Introduce el precio del nuevo DLC:");
                double precioDlc = sc.nextDouble();
                System.out.println("Introduce la fecha de lanzamiento del nuevo DLC (dd/MM/yyyy):");
                String inputFecha = sc.next();
                dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaLanzamiento;
                try 
                {
                    fechaLanzamiento = new Date(dateFormat.parse(inputFecha).getTime());
                } 
                catch (Exception e) 
                {
                    System.out.println("Formato de fecha incorrecto.");
                    fechaLanzamiento = null;
                }
                Dlc nuevoDlc = new Dlc(-1, idVideojuego, nombreDlc, precioDlc, fechaLanzamiento);
                dlcDao.crearNuevoDlc(nuevoDlc);
                break;

            case 5:
                System.out.println("Introduce el ID del DLC a modificar:");
                int idDlcMod = sc.nextInt();
                System.out.println("Introduce el nuevo ID del videojuego asociado:");
                int idVideojuegoMod = sc.nextInt();
                System.out.println("Introduce el nuevo nombre del DLC:");
                String nombreMod = sc.next();
                System.out.println("Introduce el nuevo precio del DLC:");
                double precioMod = sc.nextDouble();
                System.out.println("Introduce la nueva fecha de lanzamiento del DLC (dd/MM/yyyy):");
                inputFecha = sc.next();
                try 
                {
                    fechaLanzamiento = new Date(dateFormat.parse(inputFecha).getTime());
                }
                catch (Exception e) 
                {
                    System.out.println("Formato de fecha incorrecto.");
                    fechaLanzamiento = null;
                }
                Dlc dlcMod = new Dlc(idDlcMod, idVideojuegoMod, nombreMod, precioMod, fechaLanzamiento);
                dlcDao.actualizarDlc(dlcMod);
                break;

            case 6:
                System.out.println("Introduce el ID del DLC a eliminar:");
                int idEliminar = sc.nextInt();
                dlcDao.borrarDlc(idEliminar);
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
    
    private static void menuPlataformas() 
    {
        PlataformaDao p = new PlataformaDao();
        VideojuegoDao videojuegoDao = new VideojuegoDao();
        System.out.println("----MENU Plataformas----");
        System.out.println("1.-Listar todas las Plataformas:");
        System.out.println("2.-Listar todas las Plataformas por cantidad de juegos:");
        System.out.println("3.-Buscar Plataforma por nombre:");
        System.out.println("4.-Insertar una nueva Plataforma:");
        System.out.println("5.-Modificar Plataforma:");
        System.out.println("6.-Eliminar Plataforma:");
        System.out.println("0.-Volver a menú Principal.");
        eleccion = sc.nextInt();
        
        switch (eleccion) {
            case 0:
                System.out.println("Saliendo del programa");
                System.exit(0);
                break;
                
            case 1:
                
                break;
                
            case 2:
                
                break;
                
            case 3:
                
                break;
                
            case 4:
                
                break;
                
            case 5:
                try {
                    System.out.println("Introduce el ID de la plataforma a eliminar");
                    p.borrarPlataforma(1);
                } catch (ExcepcionesVideojuegos e) {
                    System.err.println(e.getMensajeUsuario());
                }
                break;
                
            case 6:
                try {
                    
                } catch (Exception e) {
                }
                break;
            default:
                System.out.println("¡¡¡EROR!!!Elige una opción válida");
                throw new AssertionError();
        }
    }
}
