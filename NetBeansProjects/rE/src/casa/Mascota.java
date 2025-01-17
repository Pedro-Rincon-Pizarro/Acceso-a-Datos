/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

import java.util.Random;

/**
 *
 * @author pedro.rinpiz
 */

public class Mascota implements Runnable
{
    private String nombre;
    private int distancia;
    private Random rd = new Random();

    public Mascota(String nombre) {
        this.nombre = nombre;
        distancia = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public void run()
    {
        System.out.println("La mascota " + this.nombre + " empieza a correr");
        distancia = rd.nextInt(100);
        System.out.println("La mascota " + this.nombre + " recorre " + distancia + "m");
        while(distancia < 100)
        {
            distancia += rd.nextInt(10);
            System.out.println("La mascota " + this.nombre + " recorre " + distancia + "m");
        }
        
    }
    
    
}
