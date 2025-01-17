/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author pedro.rinpiz
 */
public class Bosque {

    public static void main(String[] args) {
        Thread papaPitufo = new Thread(new Pitufo("Papá Pitufo"));
        Thread pitufina = new Thread(new Pitufo("Pitufina"));
        Thread filosofo = new Thread(new Pitufo("Filósofo"));
        Thread grunion = new Thread(new Pitufo("Gruñón"));
        Thread bromista = new Thread(new Pitufo("Bromista"));

        papaPitufo.start();
        pitufina.start();
        filosofo.start();
        grunion.start();
        bromista.start();

        try 
        {
            papaPitufo.join();
            pitufina.join();
            filosofo.join();
            grunion.join();
            bromista.join();
            
        } 
        catch (Exception e) 
        {
            
        }

    }
}
