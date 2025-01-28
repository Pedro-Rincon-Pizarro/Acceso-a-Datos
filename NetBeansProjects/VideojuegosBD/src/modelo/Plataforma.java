/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pedro.rinpiz
 */

import java.sql.Date;

/**
 *
 * @author Pedro
 */
public class Plataforma 
{
    private int id_plataforma;
    private String nombre;
    private Date fecha_fundacion;

    public Plataforma(int id_plataforma, String nombre, Date fecha_fundacion) {
        this.id_plataforma = id_plataforma;
        this.nombre = nombre;
        this.fecha_fundacion = fecha_fundacion;
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

    public Date getFecha_fundacion() {
        return fecha_fundacion;
    }

    public void setFecha_fundacion(Date fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }
    
    
}
