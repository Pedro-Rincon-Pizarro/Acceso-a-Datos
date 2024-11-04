/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos12;

/**
 *
 * @author pedro.rinpiz
 */
public class Contador 
{
    private int cuenta;

    public Contador(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getCuenta() {
        return cuenta;
    }
    
    
    public synchronized void incrementar()
    {
        cuenta++;
    }
    
    public synchronized void decrementar()
    {
        cuenta--;
    }
}
