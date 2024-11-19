/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recolecta;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro.rinpiz
 */
public class Main 
{
    public static void main(String[] args)
    {
        Hucha hucha = new Hucha(2000);
        ArrayList<Thread> productores = new ArrayList<>();
        ArrayList<Thread> recolectores = new ArrayList<>();
        
       
        for(int i = 0; i < 40; i++)
            {   
                productores.add(new Thread(new Productor("Productor " + i, hucha)));
            }
            
        for(int i = 0; i < 200; i++)
            {
                recolectores.add(new Thread(new Recolector("Recolector " + 1, hucha)));
            }
            
            
        Thread espacioProductores = new Thread(() ->{
            for(Thread t : productores)
            {
                t.start();
                try {
                    Thread.sleep(400);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Thread espacioRecolectores = new Thread(() ->{
             for(Thread t : recolectores)
            {
                t.start();
                try 
                {
                    Thread.sleep(400);
                } catch (InterruptedException ex) 
                {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        espacioProductores.start();
        espacioRecolectores.start();
        
        
        
    }
    
    
    
}
