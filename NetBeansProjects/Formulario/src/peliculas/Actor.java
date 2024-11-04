

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas;

/**
 *
 * @author pedro.rinpiz
 */
public class Actor {
    private int codigo;
    private String nombre;
    private String biografia;

    public Actor(int codigo, String nombre, String biografia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.biografia = biografia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    @Override
    public String toString() {
        return "Actor{" + "codigo=" + codigo + ", nombre=" + nombre + ", biografia=" + biografia + '}';
    }
    
    
    
}
