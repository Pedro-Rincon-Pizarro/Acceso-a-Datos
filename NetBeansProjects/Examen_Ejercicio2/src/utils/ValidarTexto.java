package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author unai.esggir
 */
public class ValidarTexto {
    
    public boolean esValido(String texto) {
        Pattern patronNomApell = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s-]+$");
        Matcher matcherNombre = patronNomApell.matcher(texto);
        if (texto.trim().length() != 0 && texto.length() <= 100 && matcherNombre.matches()) {
            return true;
        }
            return false;
    }
}
