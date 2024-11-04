/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaFinal;

import java.util.Date;

/**
 *
 * @author pedro.rinpiz
 */
public class Cliente 
{
    private String id;
    private String nombre;
    private String correo;
    private String tlf;
    private String ciudad;
    private String titulo;
    private String escritor;
    private String editorial;
    private String fecha;
    
    public Cliente(String id, String nombre, String correo, String tlf, String ciudad, String titulo,
                    String escritor, String editorial, String fecha)
    {
        id = this.id;
        nombre = this.nombre;
        correo = this.correo;
        tlf = this.tlf;
        ciudad = this.ciudad;
        titulo = this.titulo;
        escritor = this.escritor;
        editorial = this.editorial;
        fecha = this.fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
