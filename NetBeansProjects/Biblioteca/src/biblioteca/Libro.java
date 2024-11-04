/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Pedro
 */
public class Libro 
{
    private String titulo, autor, editorial;
    private int idLibro;

    public Libro(int idLibro, String titulo, String autor, String editorial) 
    {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public String getAutor() 
    {
        return autor;
    }

    public void setAutor(String autor) 
    {
        this.autor = autor;
    }

    public String getEditorial() 
    {
        return editorial;
    }

    public void setEditorial(String editorial)
    {
        this.editorial = editorial;
    }

    public int getIdLibro() 
    {
        return idLibro;
    }

    public void setIdLibro(int idLibro) 
    {
        this.idLibro = idLibro;
    }
    
    
    
}

