/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recolecta;

/**
 *
 * @author pedro.rinpiz
 */
public class Recolector extends Thread
{
    private String nombre;
    private Hucha hucha;

    public Recolector(String nombre, Hucha hucha) {
        this.nombre = nombre;
        this.hucha = hucha;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Hucha getHucha() {
        return hucha;
    }

    public void setHucha(Hucha hucha) {
        this.hucha = hucha;
    }
    
    
    @Override
    public void run() 
    {
        System.out.println("Hilo Recolector comienza");
        try {
            hucha.sacarDinero();
            
            System.out.println("El Recolector retira dinero de la hucha");      
            
        } catch (Exception e) {
        }
    }
    
}
