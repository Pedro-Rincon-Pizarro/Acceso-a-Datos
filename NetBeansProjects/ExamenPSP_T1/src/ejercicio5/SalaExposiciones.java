/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author pedro.rinpiz
 */
public class SalaExposiciones 
{
    private int AFORO = 20;
    private int genteDentro;

    public SalaExposiciones() {
        this.genteDentro = 0;
    }

    

    public int getAFORO() {
        return AFORO;
    }

    public void setAFORO(int AFORO) {
        this.AFORO = AFORO;
    }

    public int getGenteDentro() {
        return genteDentro;
    }

    public void setGenteDentro(int genteDentro) {
        this.genteDentro = genteDentro;
    }
    
    public synchronized void entrar()
    {
        genteDentro++;
    }
    
    public synchronized void salir()
    {
        genteDentro--;
    }
}
