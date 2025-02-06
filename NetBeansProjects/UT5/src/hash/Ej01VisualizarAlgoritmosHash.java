/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hash;

/**
 *
 * @author pedro.rinpiz
 */
import java.security.MessageDigest;
import java.security.Security;
import java.security.Provider;
import java.security.Provider.Service;
import java.util.Set;

public class Ej01VisualizarAlgoritmosHash {
    public static void main(String args[]) {
        final String TIPO_MESSAGE_DIGEST = MessageDigest.class.getSimpleName();
        Provider [] proveedores=Security.getProviders();
        
        for (Provider pro:proveedores){
            Set<Service> servicios=pro.getServices();
            for (Service ser:servicios) {
                if  (ser.getType().equals(TIPO_MESSAGE_DIGEST)) System.out.println(ser.getAlgorithm());
            }
            
        }
    }
}
