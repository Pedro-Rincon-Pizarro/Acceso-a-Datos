/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaFinal;

/**
 *
 * @author pedro.rinpiz
 */
public class Libro 
{
    private String titulo, autor, editorial;

    public Libro(String titulo, String autor, String editorial) 
    {
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
    
    
}
