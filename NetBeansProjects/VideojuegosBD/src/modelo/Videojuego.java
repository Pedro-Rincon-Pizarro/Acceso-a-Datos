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
public class Videojuego 
{
    private int id_videojuego;
    private String nombre;
    private String genero;
    private String desarrollador;
    private double precio;
    private Date fecha_lanzamiento;

    public Videojuego(int id_videojuego, String nombre, String generoo, String desarrollador, double precio, Date fechaLanzamiento) {
        this.id_videojuego = id_videojuego;
        this.nombre = nombre;
        this.genero = generoo;
        this.desarrollador = desarrollador;
        this.precio = precio;
        this.fecha_lanzamiento = fechaLanzamiento;
    }

    public int getId_videojuego() {
        return id_videojuego;
    }

    public void setId_videojuego(int id_videojuego) {
        this.id_videojuego = id_videojuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String generoo) {
        this.genero = generoo;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
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
