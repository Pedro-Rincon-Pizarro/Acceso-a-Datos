/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pedro.rinpiz
 */
public class ListaUsuarios 
{

    private static Usuario u1;
    private static String ruta;
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Usuario> arrayUsuarios = new ArrayList<>();
    private static int idMax;
    private static String nombre, correo, telefono, ciudad;

    
    
    public void agregarUsuarios() 
    {
        System.out.println("Introduce el nombre del usuario");
        nombre = sc.nextLine().trim();
        System.out.println("Introduce el correo del usuario");
        correo = sc.nextLine().trim();
        System.out.println("Introduce el telefono del usuario");
        telefono = sc.nextLine().trim();
        System.out.println("Introduce la ciudad del usuario");
        ciudad = sc.nextLine().trim();
        u1 = new Usuario(idMax++, nombre, correo, telefono, ciudad);

        arrayUsuarios.add(u1);
    }
    
    public void listarUsuarios() 
    {
        for (Usuario u : arrayUsuarios) 
        {
            System.out.println("ID: " + u.getIdUsuario() + "\n" + "Nombre: " + u.getNombre() + "\n" + "Correo: " + u.getCorreo()
                    + "\n" + "Telefono: " + u.getTlf() + "\n" + "Ciudad: " + u.getCiudad() + "\n");
        }
    }
    
    public void consultarUsuarioPorID() throws IOException 
    {
        System.out.println("Introduce el ID del Usuario");
        int id = sc.nextInt();
        boolean encontrado = false;
        LeerFicheroUsuarios();
        for (Usuario u : arrayUsuarios) 
        {
            if (u.getIdUsuario() == id) 
            {
                System.out.println("Usuario encontrado");
                System.out.println("ID: " + u.getIdUsuario() + "\n" + "Nombre: " + u.getNombre() + "\n" + "Correo: " + u.getCorreo()
                        + "\n" + "Telefono: " + u.getTlf() + "\n" + "Ciudad: " + u.getCiudad() + "\n");
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) 
        {
            System.out.println("Usuario con ID " + id + " no encontrado");
        }

    }
    
    public void abrirUsuariosTxt() 
    {
        try 
        {
            // Ruta relativa del archivo desde el directorio base del proyecto
            String filePath = "usuarios.txt";  // Cambia esto a la ruta relativa de tu archivo

            // Crear un objeto File usando la ruta relativa
            File file = new File(filePath);

            // Verificar si el archivo existe
            if (file.exists()) 
            {
                // Ejecutar comando para abrir el archivo usando Runtime y obtener el proceso
                Process process = Runtime.getRuntime().exec("notepad " + file.getCanonicalPath());

                // Imprimir salida del proceso (si es necesario)
                InputStream inputStream = process.getInputStream();
                int byteData;
                while ((byteData = inputStream.read()) != -1) 
                {
                    System.out.print((char) byteData); // Mostrar la salida del proceso (si hay alguna)
                }

                // Esperar a que el proceso termine
                int exitCode = process.waitFor();
                
            } 
            else 
            {
                System.out.println("El archivo no existe en la ruta especificada.");
            }
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void mezclarVariosFicherosUsuario(String ruta, String ruta2, String ruta3) throws FileNotFoundException, IOException 
    {
        File fichero = new File(ruta);
        if (fichero.exists()) 
        {
            String linea;
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) 
            {
                String[] datos = linea.split(";");
                Usuario u1 = new Usuario(Integer.parseInt(datos[0].trim()), datos[1].trim(), datos[2].trim(), datos[3].trim(), datos[4].trim());
                idMax = Integer.parseInt(datos[0].trim()) + 1;
                arrayUsuarios.add(u1);
            }
            fichero = new File(ruta2);
            if (fichero.exists()) 
            {

                fr = new FileReader(fichero);
                br = new BufferedReader(fr);

                while ((linea = br.readLine()) != null)
                {
                    String[] datos = linea.split(";");
                    Usuario u1 = new Usuario(Integer.parseInt(datos[0].trim()), datos[1].trim(), datos[2].trim(), datos[3].trim(), datos[4].trim());
                    idMax = Integer.parseInt(datos[0].trim()) + 1;
                    arrayUsuarios.add(u1);

                }
                fichero = new File(ruta3);

                if (!fichero.exists()) 
                {
                    fichero.createNewFile();
                    System.out.println("Archivo creado con exito " + fichero.getName());
                }
                fr = new FileReader(fichero);
                FileWriter fw = new FileWriter(fichero, false);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Usuario u : arrayUsuarios) 
                {
                    bw.write(u.getIdUsuario() + ";" + u.getNombre() + ";" + u.getCorreo() + ";" + u.getTlf() + ";" + u.getCiudad() + "\n");
                }
                bw.close();

            } 
            else 
            {
                throw new IOException("No se encuentra el fichero " + ruta);
            }
        } 
        else 
        {
            throw new IOException("No se encuentra el fichero " + ruta);
        }
    }

    public void LeerFicheroUsuarios() throws FileNotFoundException, IOException 
    {
        ruta = "usuarios.txt";
        File fichero = new File(ruta);
        if (fichero.exists())
        {
            String linea;
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) 
            {
                String[] datos = linea.split(";");
                u1 = new Usuario(Integer.parseInt(datos[0]), datos[1].trim(), datos[2].trim(), datos[3].trim(), datos[4].trim());
                idMax = Integer.parseInt(datos[0].trim()) + 1;
                arrayUsuarios.add(u1);

            }

        } 
        else 
        {
            throw new IOException("No se encuentra el fichero " + ruta);
        }
    }

    public void sobreEscribirUsuarios() throws IOException 
    {
        ruta = "usuarios.txt";
        File fichero = new File(ruta);
        String linea;
        FileReader fr = new FileReader(fichero);
        FileWriter fw = new FileWriter(fichero, false);
        BufferedWriter bw = new BufferedWriter(fw);

        for (Usuario u : arrayUsuarios) 
        {
            bw.write(u.getIdUsuario() + ";" + u.getNombre() + ";" + u.getCorreo()
                    + ";" + u.getTlf() + ";" + u.getCiudad() + "\n");

        }
        bw.close();
    }
}