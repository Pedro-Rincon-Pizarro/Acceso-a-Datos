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
public class PersonaJubilada extends Thread
{
    private String nombre;
    private SalaExposiciones salaExp;

    public PersonaJubilada(String nombre) {
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
        
        salaExp.entrar();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(PersonaJubilada.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        salaExp.salir();
        notifyAll();
    }
    
    
}
