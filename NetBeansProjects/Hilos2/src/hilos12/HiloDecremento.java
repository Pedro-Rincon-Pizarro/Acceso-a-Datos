/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos12;

/**
 *
 * @author pedro.rinpiz
 */
public class HiloDecremento extends Thread
{
    private Contador contador;
    private String nombre;

    public HiloDecremento(Contador contador, String nombre) {
        this.contador = contador;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Hilo: " + this.nombre + " empieza");
        for (int i = 0; i < 5; i++) 
        {
            contador.decrementar();
            System.out.println("ContadorDec: " + contador.getCuenta());
        }
        System.out.println("Hilo " + this.nombre + " terminado ");
    }
    
    
    
}
