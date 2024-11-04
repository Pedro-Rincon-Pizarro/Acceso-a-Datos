/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

/**
 *
 * @author pedro.rinpiz
 */
public class Registro {
    private int contHabi;
    private int contSalon;
    private int contCocina;
    private int contBaño;

    public Registro(int contHabi, int contSalon, int contCocina, int contBaño) {
        this.contHabi = contHabi;
        this.contSalon = contSalon;
        this.contCocina = contCocina;
        this.contBaño = contBaño;
    }

    public int getContHabi() {
        return contHabi;
    }

    public void setContHabi(int contHabi) {
        this.contHabi = contHabi;
    }

    public int getContSalon() {
        return contSalon;
    }

    public void setContSalon(int contSalon) {
        this.contSalon = contSalon;
    }

    public int getContCocina() {
        return contCocina;
    }

    public void setContCocina(int contCocina) {
        this.contCocina = contCocina;
    }

    public int getContBaño() {
        return contBaño;
    }

    public void setContBaño(int contBaño) {
        this.contBaño = contBaño;
    }

    @Override
    public String toString() {
        return "Registro:\n" + "contHabi: " + contHabi + "\n contSalon: " + contSalon + "\n contCocina: " + contCocina + "\n contBaño: " + contBaño + "\n";
    }
    
    
    
}
