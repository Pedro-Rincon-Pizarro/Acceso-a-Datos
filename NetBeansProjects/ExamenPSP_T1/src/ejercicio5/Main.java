/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author pedro.rinpiz
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Thread [] personas = new Thread[48];
        Thread [] jubilados = new Thread[12];
        
        for(int i = 0; i < 48; i++)
        {
            Thread persona = new Persona("nombre " + i);
            personas[i] = persona;
        }
        
        for(int i = 0; i < 12; i++)
        {
            Thread jubilado = new PersonaJubilada("jubilado " + i);
            jubilados[i] = jubilado;
        }
        
        for(int i = 0; i < 48; i++)
        {
            personas[i].start();
        }
        
        for(int i = 0; i < 12; i++)
        {
            jubilados[i].start();
        }
        
        try {
            for(int i = 0; i < 48; i++)
        {
            personas[i].join();
        }
        } catch (Exception e) {
            
        }
        
        try {
            for(int i = 0; i < 48; i++)
        {
            jubilados[i].join();
        }
        } catch (Exception e) {
        }
    }
}
