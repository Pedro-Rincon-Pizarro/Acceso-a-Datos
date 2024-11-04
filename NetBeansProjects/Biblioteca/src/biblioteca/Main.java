/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.io.IOException;
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

        ListaUsuarios lu = new ListaUsuarios();
        ListaLibros ll = new ListaLibros();
        while (eleccion != 9) 
        {
            menu();

            switch (eleccion) 
            {
                case 1:

                    lu.LeerFicheroUsuarios();
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

                    ll.LeerFicheroLibros();
                    ll.agregarLibros();
                    ll.sobreEscribirLibros();
                    break;

                case 6:
                    ll.listarLibros();
                    break;

                case 7:
                    ll.consultarLibroPorNombre();
                    break;

                case 8:
                    ll.abrirLibrosTxt();
                    break;

                case 9:
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
        System.out.println("Elige una opcion");
        System.out.println("");
        System.out.println("MENU");
        System.out.println("1.-Agregar Usuario");
        System.out.println("2.-Consultar lista de Usuarios");
        System.out.println("3.-Consultar Usuario por ID");
        System.out.println("4.-Abrir usuarios.txt");
        System.out.println("5.-Agregar Libro");
        System.out.println("6.-Consultar lista de Libros");
        System.out.println("7.-Consultar Libro por Titulo");
        System.out.println("8.-Abrir libros.txt");
        System.out.println("9.-Salir");
        eleccion = sc.nextInt();
    }
}
