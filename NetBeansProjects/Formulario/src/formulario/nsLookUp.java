/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Pedro
 */
public class nsLookUp 
{
    public static void main(String[] args) 
    {
        // URL de la página que vamos a resolver (educacyl)
        String url = "educacyl.jcyl.es";

        // Ejecutamos el comando nslookup usando la clase Runtime
        try 
        {
            // Crear el proceso para ejecutar el comando nslookup
            Process process = Runtime.getRuntime().exec("nslookup " + url);

            // Capturamos la salida del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            // Leer y mostrar la salida del comando nslookup
            String line;
            System.out.println("Resultado del nslookup para " + url + ":");
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }

            // Esperar a que el proceso termine
            int exitCode = process.waitFor();
            if (exitCode == 0) 
            {
                System.out.println("\nEl proceso terminó correctamente.");
            } 
            else 
            {
                System.out.println("\nEl proceso terminó con errores. Código de salida: " + exitCode);
            }
        } 
        catch (IOException | InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}
