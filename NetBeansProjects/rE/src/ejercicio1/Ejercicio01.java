/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Pedro
 */
public class Ejercicio01 
{
    public static void main(String[] args) 
    {
        Thread h1 = new Thread(new Multiplicacion("C1", 1000));
        Thread h2 = new Thread(new Multiplicacion("C2", 2000));
        
        h1.start();
        h2.start();
        
        try {
            h1.join();
            h2.join();
        } catch (Exception e) {
        }
    }
    
}
