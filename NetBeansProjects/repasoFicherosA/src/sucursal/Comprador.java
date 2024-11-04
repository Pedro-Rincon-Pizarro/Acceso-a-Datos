/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sucursal;

/**
 *
 * @author pedro.rinpiz
 */
public class Comprador 
{
    String nombre;

    public Comprador(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Comprador{" + "nombre=" + nombre + '}';
    }
    
    
}
