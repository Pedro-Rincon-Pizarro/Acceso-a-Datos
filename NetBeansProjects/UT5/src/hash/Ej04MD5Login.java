/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hash;

/**
 *
 * @author pedro.rinpiz
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
public class Ej04MD5Login {

public static void main(String[] args) throws Exception {
    // Para simular una consulta de BBDD
    Map<String, String> cendenciales = new HashMap<>();
    //ana-ana1
    //pep-pep1
    //tio-tio1
    cendenciales.put("ana", "12ee195ec1324b1d7f4806da041f3573");
    cendenciales.put("pep", "ae99fd4697031835c5c2d54d49409db4");
    cendenciales.put("tio", "00a785465381e567520dff40684b4479");
    
    BufferedReader scnr = new BufferedReader(new InputStreamReader(System.in));
    String usuario ;
    String contrasena;
    
        System.out.println("Enter usuario:");
        usuario = scnr.readLine();
        System.out.println("Enter contrasena:");
        contrasena= scnr.readLine();

        // Con el usuario tecleado busco la contraseña
        String contraAlmacenada = cendenciales.get(usuario);
        // Check if the username exists and if so check if the hash of his 
        // password matches with the hash of the provided password
        if (contraAlmacenada == null || !contraAlmacenada.equals(getMd5(contrasena))) {
            // We don't have a match so we keep going
            System.err.println("password invalid");
            
        }
        else   System.out.printf("Welcome %s!%n", usuario);
}

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
}
