/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioHilos;

/**
 *
 * @author pedro.rinpiz
 */
public class Hilo extends Thread
{
    private int inicio, fin;
    String nombreHilo;
    
    public Hilo(int inicio, int fin, String nombreHilo)
    {
        this.inicio = inicio;
        this.fin = fin;
        this.nombreHilo = nombreHilo;
    }
    
    public void run()
    {
        System.out.println("Está comenzando el hilo " + this.nombreHilo);
        for(int i = this.inicio; i <= this.fin && i >= this.inicio; i++)
        {
            System.out.println("Hilo " + this.nombreHilo);
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Vamos a iniciar los dos threads");
        
        Hilo hilo1 = new Hilo(1, 100, "Thread A");
        Hilo hilo2 = new Hilo(200, 400, "Thread B");
        
        hilo1.start();
        hilo2.start();
    }
}
