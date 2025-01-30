/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package url;

/**
 *
 * @author pedro.rinpiz
 */
import java.net.MalformedURLException;
import java.net.URL;

public class CrearURL {
   public static void main(String[] args) 
   {
      try 
      {
// Crear una URL a partir de una cadena
         URL url1 = new URL("https://www.ejemplo.com/index.html?idioma=es#seccion2");
         System.out.println("URL completa: " + url1);
         System.out.println("Protocolo: " + url1.getProtocol());
         System.out.println("Host: " + url1.getHost());
         System.out.println("Ruta: " + url1.getFile());
         System.out.println("Query: " + url1.getQuery());
         System.out.println("Ref: " + url1.getRef());
         
         System.out.println("---------------------------");
         // Crear una URL usando protocolo, host y archivo
         URL url2 = new URL("https", "www.ejemplo.com", "/index.html");
         System.out.println("Protocolo: " + url2.getProtocol());
         System.out.println("Host: " + url2.getHost());
         System.out.println("Ruta: " + url2.getFile());
      } 
      catch (MalformedURLException e) 
      {
         e.printStackTrace();
      }
   }
}

