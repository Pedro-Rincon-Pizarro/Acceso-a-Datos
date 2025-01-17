/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author pedro.rinpiz
 */
public class OperarioMesas extends Thread {

    private String nombre;
    private ControlProduccion controlProduccion;

    public OperarioMesas(String nombre, ControlProduccion controlProduccion) {
        this.nombre = nombre;
        this.controlProduccion = controlProduccion;
    }

    @Override
    public void run() {
        System.out.println("El operario " + this.nombre + " entera a al taller de mesas");
        for (int i = 0; i < 80; i++) {
            
            controlProduccion.hacerMesa(nombre);
        }

    }
}
