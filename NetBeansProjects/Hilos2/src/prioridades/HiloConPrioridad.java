/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prioridades;

/**
 *
 * @author pedro.rinpiz
 */
public class HiloConPrioridad extends Thread{
    String nombre;
    long contador;

    public HiloConPrioridad(String nombre, long contador) {
        this.nombre = nombre;
        this.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public long getContador() {
        return contador;
    }
    public void incContador(){
        contador++;
    }
    @Override
    public void run (){
        System.out.println("hilo " +getNombre()+ " arranca");
        while(!Thread.currentThread().isInterrupted()){
            incContador();
        }
        System.out.println("hilo " +getNombre()+" termina");
        System.out.println("Contador: " + contador);
    }
    
}
