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
    private int id_plataforma;
    private String nombre;
    private String genero;
    private double precio;
    private Date fecha_lanzamiento;

    public Videojuego(int id_videojuego, int id_plataforma, String nombre, String genero, double precio, Date fecha_lanzamiento) {
        this.id_videojuego = id_videojuego;
        this.id_plataforma = id_plataforma;
        this.nombre = nombre;
        this.genero = genero;
        this.precio = precio;
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public int getId_videojuego() {
        return id_videojuego;
    }

    public void setId_videojuego(int id_videojuego) {
        this.id_videojuego = id_videojuego;
    }

    public int getId_plataforma() {
        return id_plataforma;
    }

    public void setId_plataforma(int id_plataforma) {
        this.id_plataforma = id_plataforma;
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

    public void setGenero(String genero) {
        this.genero = genero;
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

    public void setFecha_lanzamiento(Date fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    
}