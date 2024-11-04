/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Pedro
 */
public class Prestamo 
{
    private String id, fecha;
    private Usuario u;
    private Libro l;

    public Prestamo(String id, String fecha, Usuario u, Libro l) {
        this.id = id;
        this.fecha = fecha;
        this.u = u;
        this.l = l;
    }

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }

    public Libro getL() {
        return l;
    }

    public void setL(Libro l) {
        this.l = l;
    }
    
    
}