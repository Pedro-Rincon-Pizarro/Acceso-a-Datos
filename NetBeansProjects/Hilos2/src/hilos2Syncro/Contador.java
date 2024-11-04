/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos2Syncro;

/**
 *
 * @author pedro.rinpiz
 */
public class Contador {
    private int cuenta;

    public int getCuenta() {
        return cuenta;
    }

    synchronized public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    synchronized public int incrementa(){
        this.cuenta++;
        return cuenta;
    }
    
}
