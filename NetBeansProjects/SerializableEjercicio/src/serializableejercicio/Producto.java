/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializableejercicio;

import java.io.Serializable;

/**
 *
 * @author pedro.rinpiz
 */
public class Producto implements Serializable {

    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private int cantidadDisponible;
    public static int contador = 1;

    public Producto() {
    }

    public Producto(String nombreProducto, String descripcion, double precio, int cantidadDisponible) {
        this.idProducto = contador;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
        contador++;
    }
    


    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Producto:\n" + "idProducto: " + idProducto + "\n nombreProducto: " + nombreProducto + "\n descripcion: " + descripcion + "\n precio: " + precio + "\n cantidadDisponible: " + cantidadDisponible;
    }


}
