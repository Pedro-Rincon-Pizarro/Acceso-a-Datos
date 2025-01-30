/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package url;

/**
 *
 * @author pedro.rinpiz
 */
import java.net.*;
import java.io.*;

public class VerificarEstadoHttp {
   public static void main(String[] args) {
      try {
         URL url = new URL("https://www.hola.es");
         HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
         int codigoRespuesta = conexion.getResponseCode();

         if (codigoRespuesta == HttpURLConnection.HTTP_OK) 
         {
            System.out.println("Conexión exitosa. Código: " + codigoRespuesta);
         } else
         {
            System.out.println("Error en la conexión. Código: " + codigoRespuesta);
         }

         conexion.disconnect();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
