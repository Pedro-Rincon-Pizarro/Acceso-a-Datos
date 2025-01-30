/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package url;

/**
 *
 * @author pedro.rinpiz
 */
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class LeerURL {
   public static void main(String[] args) 
   {
      try 
      {
         URL url = new URL("https://www.fpsantacatalina.com/cifpweb/index.php/portfolio/informatica-y-comunicaciones");
         URLConnection conexion = url.openConnection();

         BufferedReader entrada = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
         String linea;
         while ((linea = entrada.readLine()) != null)
         {
            System.out.println(linea);
         }
         entrada.close();
      } catch (IOException e) 
      {
         e.printStackTrace();
      }
   }
}