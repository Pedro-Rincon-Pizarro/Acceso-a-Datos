/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca2;

import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Main 
{

    private static Scanner sc = new Scanner(System.in);
    private static int eleccion = 0;

    public static void main(String[] args) throws IOException 
    {
        String ruta = "";
        String ruta2 = "";
        String ruta3 = "";
        ListaUsuarios lu = new ListaUsuarios();
        ListaLibros ll = new ListaLibros();
        ListaPrestamos lp = new ListaPrestamos();
        lu.LeerFicheroUsuarios();
        ll.leerFicheroLibros();
        Random a = new Random(8);
        
        while (eleccion != 15) 
        {
            menu();

            switch (eleccion) 
            {
                case 1:
                    lu.agregarUsuarios();
                    lu.sobreEscribirUsuarios();
                    break;

                case 2:
                    lu.listarUsuarios();
                    break;

                case 3:
                    lu.consultarUsuarioPorID();
                    break;

                case 4:
                    lu.abrirUsuariosTxt();
                    break;

                case 5:
                    System.out.println("Introduce el nombre del primer fichero de usuarios a mezclar");
                    ruta = sc.next();
                    System.out.println("Introduce el nombre del segundo fichero de usuarios a mezclar");
                    ruta2 = sc.next();
                    System.out.println("Introduce el nombre del nuevo archivo con su extension correspondiente");
                    ruta3 = sc.next();
                    lu.mezclarVariosFicherosUsuario(ruta, ruta2, ruta3);
                    break;

                case 6:
                    ll.agregarLibros();
                    ll.sobreEscribirLibros();
                    break;

                case 7:
                    ll.listarLibrosPorID();
                    break;
                    
                case 8:
                    ll.listarLibrosPorTitulo();
                    break;

                case 9:
                    ll.consultarLibroPorTitulo();
                    break;

                case 10:
                    ll.abrirLibrosTxt();
                    break;

                case 11:
                    System.out.println("Introduce el nombre del primer fichero de libros a mezclar");
                    ruta = sc.next();
                    System.out.println("Introduce el nombre del segundo fichero de libros a mezclar");
                    ruta2 = sc.next();
                    System.out.println("Introduce el nombre del nuevo archivo con su extension correspondiente");
                    ruta3 = sc.next();
                    ll.mezclarVariosFicherosLibros(ruta, ruta2, ruta3);
                    break;

                case 12:
                    System.out.println("Introduce el titulo del libro");
                    String libro = sc.nextLine();
                    System.out.println("Introduce el id del usuario que realiza el prestamo");
                    int idUsuario = sc.nextInt();
                    
                    
                    lp.agregarPrestamo();
                    break;
                    
                case 13:
                    
                    break;
                    
                case 14:
                    
                    break;
                    
                case 15:
                    System.out.println("Saliendo del programa");
                    sc.close();
                    break;

                default:
                    throw new AssertionError();
            }
        }

    }

    private static void menu() 
    {
        
        System.out.println("");
        System.out.println("MENU (elige una opcion)");
        System.out.println("1.-Agregar Usuario");
        System.out.println("2.-Consultar lista de Usuarios");
        System.out.println("3.-Consultar Usuario por ID");
        System.out.println("4.-Abrir usuarios.txt");
        System.out.println("5.-Mezclar ficheros de usuarios");
        System.out.println("");
        System.out.println("6.-Agregar Libro");
        System.out.println("7.-Consultar lista de Libros por ID");
        System.out.println("8.-Consultar lista de Libros por Nombre");//falta
        System.out.println("9.-Consultar Libro por Titulo");
        System.out.println("10.-Abrir libros.txt");
        System.out.println("11.-Mezclar ficheros de libros");
        System.out.println("");
        System.out.println("12.-Realizar Préstamo");//falta
        System.out.println("13.-Listar Préstamos");//falta
        System.out.println("14.-Mostrar Préstamos con retraso");//falta
        System.out.println("15.-Salir");
        System.out.println("");
        
        eleccion = sc.nextInt();
    }
}