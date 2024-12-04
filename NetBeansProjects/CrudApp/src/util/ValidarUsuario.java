/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Pablo
 */
public class ValidarUsuario {

    public ValidarUsuario() {
    }
    
    public boolean validar(String user){
        if (user.length() > 20 || user.length()<6) {
            return false;
        }

        if (user.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return false;
        }

        if (user.contains(" ")) {
            return false;
        }
        
        return true;
    }
}
