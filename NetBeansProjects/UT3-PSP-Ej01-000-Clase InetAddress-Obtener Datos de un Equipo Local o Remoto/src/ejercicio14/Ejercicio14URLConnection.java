/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Ejercicio14URLConnection {
   public static void main(String [] args) {
      try {
         URL url = new URL("https://www.tutorialspoint.com");
         URLConnection urlConnection = url.openConnection();
         HttpURLConnection connection = null;
         if(urlConnection instanceof HttpURLConnection) {
            connection = (HttpURLConnection) urlConnection;
         }else {
            System.out.println("Please enter an HTTP URL.");
            return;
         }
         
         BufferedReader in = new BufferedReader(
            new InputStreamReader(connection.getInputStream()));
         String urlString = "";
         String current;
         
         while((current = in.readLine()) != null) {
            urlString += current;
         }
         System.out.println(urlString);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
