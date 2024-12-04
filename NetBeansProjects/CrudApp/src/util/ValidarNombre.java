/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Pablo
 */
public class ValidarNombre {

    public ValidarNombre() {
    }
    
    

    public boolean validar(String NombreOApellido) {
        Pattern  patronNomApell = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s-]+$");
        Matcher matcherNombre = patronNomApell.matcher(NombreOApellido);

        if(NombreOApellido.trim().length()>40){
            return false;
        }
        if(!matcherNombre.matches()){
            return false;
        }
        return true;
    }
    
}
