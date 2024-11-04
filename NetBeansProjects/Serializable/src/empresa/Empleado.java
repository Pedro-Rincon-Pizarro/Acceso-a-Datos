/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.io.Serializable;

/**
 *
 * @author pedro.rinpiz
 */
public class Empleado implements Serializable
{
    private String nombre, apellido, numSS;

    public Empleado(String nombre, String apellido, String numSS) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numSS = numSS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumSS() {
        return numSS;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    @Override
    public String toString() {
        return "Empleado:" + "\n nombre: " + nombre + "\n apellido: " + apellido + "\n numSS: " + numSS;
    }
    
    
    
}
