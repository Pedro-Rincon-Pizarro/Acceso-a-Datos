/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package re;

/**
 *
 * @author pedro.rinpiz
 */
public class Alumno extends Thread
{
    private String nombre;
    private Bienvenida bienvenida;

    public Alumno(String nombre, Bienvenida bienvenida) {
        this.nombre = nombre;
        this.bienvenida = bienvenida;
    }

    @Override
    public void run() {
        System.out.println("El alumno " + this.nombre + " entera a clase");
        bienvenida.saludaElAlumno(nombre);
    }
    
    
}
