/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recolecta;

/**
 *
 * @author pedro.rinpiz
 */
public class Hucha 
{
    private final int capacidad;
    private int numBilletes = 0;

    public Hucha(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public synchronized void meterDinero() throws InterruptedException
    {
        while(numBilletes >= capacidad || numBilletes > (capacidad - 100))
        {
            System.out.println("La hucha está llena");
            System.out.println("Numero de billetes: " +numBilletes);
            wait();
        }
        
        Thread.sleep(300);
        numBilletes += 100;
        System.out.println("Numero de billetes: " +numBilletes);
        notifyAll();
    }
    
    public synchronized void sacarDinero() throws InterruptedException
    {
        while(numBilletes <= 0)
        {
            System.out.println("La Hucha está vacia");
            System.out.println("Numero de billetes: " +numBilletes);
            wait();
        }
        
        Thread.sleep(300);
        numBilletes -= 20;
        System.out.println("Numero de billetes: " +numBilletes);
        notifyAll();
    }
}
