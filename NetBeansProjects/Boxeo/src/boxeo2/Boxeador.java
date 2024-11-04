package boxeo2;

import boxeo.*;
import java.util.Random;

public class Boxeador extends Thread {
        //ATRIBUTOS
	private String nombre;
	private Ring ring;
	private int golpes;
	
	public Boxeador(String nombre, Ring ring){
		this.nombre = nombre;
		this.ring = ring;
                this.golpes = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getGolpes() {
		return golpes;
	}
	
	public void pegar() {
		golpes++;
	}
	
	@Override
	public void run() {	
                //LA PARTIDA SE TERMINA CON 200 GOLPES
		while (ring.getRingGolpes() < 200) {
			this.pegar();
                        ring.pegar();
                        System.out.println(this.getNombre() + " ha golpeado " + this.getGolpes() + " veces");
			try {
                                //ALEATORIO DE 0 a 499 MILISEGUNDOS
				Thread.sleep(new Random().nextInt(500));
			} catch (InterruptedException ie) {}
		}
	}
}
