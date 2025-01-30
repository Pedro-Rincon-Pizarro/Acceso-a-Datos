/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Pedro
 */
public class Dlc
{
    private int id_dlc;
    private int id_videojuego;
    private String nombre;
    private double precio;
    private Date fecha_lanzamiento;

    public Dlc(int idDlc, int idVideojuego, String nombre, double precio, Date fechaLanzamiento) {
        this.id_dlc = idDlc;
        this.id_videojuego = idVideojuego;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha_lanzamiento = fechaLanzamiento;
    }

    public int getId_dlc() {
        return id_dlc;
    }

    public void setId_dlc(int idDlc) {
        this.id_dlc = idDlc;
    }

    public int getId_videojuego() {
        return id_videojuego;
    }

    public void setId_videojuego(int idVideojuego) {
        this.id_videojuego = idVideojuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(Date fechaLanzamiento) {
        this.fecha_lanzamiento = fechaLanzamiento;
    }
    
    
}
