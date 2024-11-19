/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author pedro.rinpiz
 */
public class Logica 
{
    double imc;
    ArrayList<Persona> arrayPersonas;
    
    public Logica()
    {
        arrayPersonas = new ArrayList<>();
    }
    
    public String agregarPersona(Persona persona)
    {
        String resultado = "Persona registrada con exito\n";
        resultado += "Dni:" + persona.getDni() + "\n";
        resultado += "Nombre:" + persona.getNombre()+ "\n";
        resultado += "Edad:" + persona.getEdad()+ "\n";
        resultado += "Peso:" + persona.getPeso()+ "\n";
        resultado += "Talla:" + persona.getTalla()+ "\n";
        imc = persona.getPeso() / (persona.getTalla() * persona.getTalla());
        persona.setImc(imc);
        
        String imcMsj = textoIMC(imc);
        resultado += "" + persona.getImcMsj() + "\n";
        
        return resultado;
    }
    
    public String textoIMC(double imc)
    {
        String mensaje;
        if(imc > 40)
        {
            mensaje = "Obesidad grado 3";
        }
        else if(imc > 35)
        {
            mensaje = "Obesidad grado 2";
        }
        else if(imc > 30)
        {
            mensaje = "Obesidad grado 1";
        }
        else if(imc > 27)
        {
            mensaje = "Sobre Peso";
        }
        else if(imc > 20)
        {
           mensaje = "normal";
        }
        else if(imc > 18)
        {
            mensaje = "Delgado";
        }
        else
        {
            mensaje = "Anorexia";
        }
        
        return mensaje;
    }
    
    public void calcularMedia()
    {
        
    }
    
    public void listarPersonas()
    {
        
    }
}
