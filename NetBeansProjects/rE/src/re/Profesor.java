/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package re;

/**
 *
 * @author pedro.rinpiz
 */
public class Profesor extends Thread
{
    private String nombre;
    private Bienvenida bienvenida;

    public Profesor(String nombre, Bienvenida bienvenida) {
        this.nombre = nombre;
        this.bienvenida = bienvenida;
    }

    @Override
    public void run() {
        System.out.println("El Profesor " + this.nombre + " entera a clase");
        bienvenida.saludaElProfesor(nombre);
    }
}
