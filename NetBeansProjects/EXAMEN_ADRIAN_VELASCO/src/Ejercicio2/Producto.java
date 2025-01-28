/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author adrian.veldie.2
 */
public class Producto {
    
    private int codigoProd;
    private String Producto;
    private float precio;
    private boolean accion;

    public Producto() {
    }

    public Producto(int codigoProd, String Producto, float precio, boolean accion) {
        this.codigoProd = codigoProd;
        this.Producto = Producto;
        this.precio = precio;
        this.accion = accion;
    }

    public int getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(int codigoProd) {
        this.codigoProd = codigoProd;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean getAccion() {
        return accion;
    }

    public void setAccion(boolean accion) {
        this.accion = accion;
    }

   
}