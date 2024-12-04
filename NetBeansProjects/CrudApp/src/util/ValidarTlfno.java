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
public class ValidarTlfno {

    public ValidarTlfno() {
    }
    
    public boolean validar(String tlfno){
         String regex = "^(\\+?\\d{1,3}[\\s\\-]?)?(\\(?\\d{1,4}\\)?[\\s\\-]?)?\\d{3}[\\s\\-]?\\d{3,4}$";
        
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(tlfno);
        
        return matcher.matches();
    }
    
}
