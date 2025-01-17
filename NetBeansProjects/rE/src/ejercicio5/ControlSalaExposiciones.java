/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author pedro.rinpiz
 */
public class ControlSalaExposiciones {
    
    private final int capacidad;
    private int numPersonas = 0;

    public ControlSalaExposiciones(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public synchronized void entrarPersona() throws InterruptedException{
        if(numPersonas >= capacidad){
            System.out.println("No quedan huecos en la sala de exposiciones.");
            wait();
        }
        
        Thread.sleep(300);
        numPersonas++;
    }
    
    public synchronized void salirPersona(){
        numPersonas--;
        notifyAll();
    }
}
