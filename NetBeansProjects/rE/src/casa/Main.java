/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author pedro.rinpiz
 */
public class Main {

    //clase hilo llamada Mascota 
    //Main que lanza mascotas que recorren una distancia aleatoria
    //Lanzar 3 mascotas y simular una carrera de 30m e indicar quien ha ganado
    static Random rd = new Random();

    public static void main(String[] args) {
        Mascota luffy = new Mascota("Luffy");
        Mascota nikka = new Mascota("Nikka");
        Mascota cesar = new Mascota("Cesar");

        Thread h1 = new Thread(luffy);
        Thread h2 = new Thread(nikka);
        Thread h3 = new Thread(cesar);

        h1.start();
        h2.start();
        h3.start();

        try {
            h1.join();
            h2.join();
            h3.join();
            if(luffy.getDistancia() >= 100)
            {
                System.out.println("Gana Luffy");
            }
            else if(nikka.getDistancia() >= 100)
            {
                System.out.println("Gana Nikka");
            }
            else if(cesar.getDistancia() >= 100)
            {
                System.out.println("Gana Cesar");
            }
            
        } catch (Exception e) {
        }

    }
}
