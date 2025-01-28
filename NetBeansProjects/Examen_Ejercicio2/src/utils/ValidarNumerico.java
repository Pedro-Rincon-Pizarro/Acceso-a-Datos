package utils;

/**
 *
 * @author unai.esggir
 */
public class ValidarNumerico {

    public static boolean validarEntero(String valor) {
        try {
            if (valor != null) {
                Integer.parseInt(valor);
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
    public static boolean validarDouble(String valor) {
        try {
            if (valor != null) {
                Double.parseDouble(valor);
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
