/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos2Syncro;

/**
 *
 * @author pedro.rinpiz
 */
public class Hilo implements Runnable {
    //1-ATRIBUTOS
    String  nombre;
    int miParte;
    int miCuenta;
    private Contador cont;
    
    //2-CONSTRUCTOR
    public Hilo(String nombre, int miParte, Contador cont) {
        this.nombre = nombre;
        this.miParte = miParte;
        this.miCuenta=0;
        this.cont = cont;
    }
    //3-GETTER MICUENTA
    public int getMiCuenta() {
        return miCuenta;
    }
      
    //4-RUN
    @Override
    public void run() {
        System.out.println("Hilo: "+this.nombre+ " empieza");
        for (int i=0;i<miParte;i++){
            cont.incrementa();
            miCuenta++;
        }
        System.out.println("Hilo "+ this.nombre + " terminado " +getMiCuenta());
    }
    
    
}