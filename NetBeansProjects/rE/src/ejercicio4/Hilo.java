/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author pedro.rinpiz
 */
public class Hilo implements Runnable {
    
    private int min;
    private int max;
    private String nombre;

    public Hilo(int min, int max, String nombre) {
        System.out.println("Hilo inicializado.");
        this.min = min;
        this.max = max;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        boolean primo = true;
        for (int i = min; i <= max; i++){
            primo = true;
            for(int a = i-2; a > 1; a--){
                if(i % a == 0) primo = false;
            }
            if(primo) System.out.println(nombre + ": " + i);
        }
    }
}
