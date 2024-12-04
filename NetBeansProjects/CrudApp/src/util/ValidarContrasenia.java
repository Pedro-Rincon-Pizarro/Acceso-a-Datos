/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Pablo
 */
public class ValidarContrasenia {

    public ValidarContrasenia() {
    }
    
    public boolean validar(String pass){
        if (pass.length() < 8) {
            return false;
        }

        // Verificar que contiene al menos una letra mayúscula
        if (!pass.matches(".*[A-Z].*")) {
            return false;
        }

        // Verificar que contiene al menos una letra minúscula
        if (!pass.matches(".*[a-z].*")) {
            return false;
        }

        // Verificar que contiene al menos un número
        if (!pass.matches(".*[0-9].*")) {
            return false;
        }

        // Verificar que contiene al menos un carácter especial
        if (!pass.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return false;
        }

        // Verificar que no contiene espacios en blanco
        if (pass.contains(" ")) {
            return false;
        }

        // Si pasa todas las validaciones
        return true;
    }
}
