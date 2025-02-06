/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hash;

/**
 *
 * @author pedro.rinpiz
 */
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
// Java program to calculate MD5 hash value
public class EJ02MD5 {
    public static String getMd5(String strCadenaEntrada)
    {
        try {
 
            //01-Utilizamos el algoritmo de hash MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
 
            //02-Calculamos el resumen con el método digest que devuelve un array de bytes         
            byte[] messageDigest = md.digest(strCadenaEntrada.getBytes());
 
            //03-Convertimos el array de bytes a un entero muy grande BigInteger
            BigInteger numero = new BigInteger(1, messageDigest);
 
            //04-Conviertimos a hexadecimal
            String hashtext = numero.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
 
    // MAIN
    public static void main(String args[]) throws NoSuchAlgorithmException
    {
        String contrasena = "amelia";
        String contrasenahasheada=getMd5(contrasena);
        System.out.println("La contrasena es:"+contrasena);
        System.out.println("La constrasena después de aplicar hash MD5:" + contrasenahasheada);
    }
}
