/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.io.Serializable;

/**
 *
 * @author pedro.rinpiz
 */
public class Articulo implements Serializable
{
    private String nombre;
    private int cantidad;
    private String descripcion;
    private String familia;

    public Articulo(String nombre, int cantidad, String descripcion, String familia) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.familia = familia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", descripcion=" + descripcion + ", familia=" + familia + '}';
    }

    
}
