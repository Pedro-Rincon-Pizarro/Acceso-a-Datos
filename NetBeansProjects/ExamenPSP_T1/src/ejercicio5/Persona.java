/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro.rinpiz
 */
public class Persona extends Thread {

    private String nombre;
    private SalaExposiciones salaExp =  new SalaExposiciones();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            if (salaExp.getGenteDentro() >= 20) {
                wait();
            }
            salaExp.entrar();

            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(PersonaJubilada.class.getName()).log(Level.SEVERE, null, ex);
        }

        salaExp.salir();
        notifyAll();
    }
}
