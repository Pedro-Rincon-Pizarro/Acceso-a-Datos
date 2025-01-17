/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author pedro.rinpiz
 */
public class OperarioPatas extends Thread {

    private String nombre;
    private ControlProduccion controlProduccion;

    public OperarioPatas(String nombre, ControlProduccion controlProduccion) {
        this.nombre = nombre;
        this.controlProduccion = controlProduccion;
    }

    @Override
    public void run() {
        System.out.println("El operario " + this.nombre + " entera a al taller de patas");
        for (int i = 0; i < 400; i++) {
            
            controlProduccion.hacerPata(nombre);
        }

    }

}
