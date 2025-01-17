/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author pedro.rinpiz
 */
public class Persona implements Runnable {

    private String nombre;
    private ControlSalaExposiciones sala;

    public Persona(String nombre, ControlSalaExposiciones sala) {
        this.nombre = nombre;
        this.sala = sala;
    }
    
    @Override
    public void run() {
        System.out.println("HILO PERSONA '" + nombre + "' EMPIEZA");
        try{
            sala.entrarPersona();
            System.out.println("HILO PERSONA '" + nombre + "' HA OCUPADO UN HUECO");
            
            Thread.sleep(10000); // Permanece 10 segundos en la sala de exposiciones.
            
            sala.salirPersona();
            System.out.println("HILO PERSONA '" + nombre + "' HA ABANDONADO UN HUECO");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("HILO PERSONA '" + nombre + "' HA FINALIZADO");
    }
    
}
