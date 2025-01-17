
package ejercicio9;
import java.net.URL;
import java.io.IOException;

public class Ejercicio09URLInformacion {
   public static void main(String[] args) {
      try {
         URL url = new URL("https://www.ejemplo.com/index.html?idioma=es#seccion2");

         System.out.println("Protocolo: " + url.getProtocol());
         System.out.println("Host: " + url.getHost());
         System.out.println("Puerto: " + (url.getPort() == -1 ? "Predeterminado" : url.getPort()));
         System.out.println("Ruta: " + url.getPath());
         System.out.println("Consulta: " + url.getQuery());
         System.out.println("Referencia: " + url.getRef());

      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}

