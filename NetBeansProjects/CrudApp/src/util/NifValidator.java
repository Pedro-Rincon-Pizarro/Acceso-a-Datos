/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Pedro
 */
public class NifValidator {

    /**
     * Cadena de letras para verificar el NIF.
     */
    private static final String LETRAS_NIF = "TRWAGMYFPDXBNJZSQVHLCKEO";
    /**
     * Cadena de letras para verificar el CIF.
     */
    private static final String LETRAS_CIF = "JABCDEFGHIJ";
    
    
    public static final NifValidator INSTANCE = new NifValidator();
    
    /**
     * Constructor privado para no permitir instancias
     */
    public NifValidator() {
        super();
    }

    /**
     * Calcula el digito de control de un cif a partir 
     * de sus 7 cifras numéricas.
     *
     * @param cif
     *            Los siete digitos del cif
     * @return el digito de control. Notar que si el cif tiene caracter de
     *         control es necesario hacer la transformacion
     */

    private  int digitoControlCIF(final String cif) {
        int control = 0;
        for (int i = 0; i < cif.length(); i++) {
            int digito =  cif.charAt(i) - 48;
            if (i % 2 == 0) {
                digito *= 2;
                control += digito / 10;
                control += digito % 10;
            } else {
                control += digito;
            }
        }
        control = (10 - (control % 10)); 
        if (control == 10){
        	control = 0;
        }
        return control;
    }

    /**
     * Comprueba la validez de un CIF El CIF (Código de Identificación Fiscal)
     * es un elemento de identificación administrativa para organizaciones y
     * consta de 9 dígitos: 1 letra indicando el tipo de organizacion (ver más
     * adelante) 7 digitos, el numero propiamente dicho 1 digito o letra de
     * control (creo que letra para los tipos P,Q y S, número para el resto)
     *
     *
     * Cálculo del digito de control (a partir de los 7 digitos centrales):
     * Sumar los dígitos de las posiciones pares (A). Por cada uno de los
     * dígitos de las posiciones impares, multiplicar por dos y sumar los dos
     * digitos (o 1) del resultado a la suma total Ej.: ( 8 * 2 = 16 --> 1 + 6 =
     * 7 )
     *
     * Una vez tenemos la "suma" de comprobacion, tomamos el dígito de las
     * unidades (módulo 10) y se lo restamos a 10. Este es el digito de control.
     * Si el caracter de control es un digito, es directo, sino se trata de
     * ABCDEFGHIJ según el digito sea 1-10
     *
     *
     *
		Tipo de organizaciones a ORDEN EHA/451/2008, DE 20 DE FEBRERO
A Sociedades anónimas
B Sociedades de responsabilidad limitada
C Sociedades colectivas
D Sociedades comanditarias
E Comunidades de bienes y herencias yacentes
F Sociedades cooperativas
G Asociaciones
H Comunidades de propietarios en régimen de propiedad horizontal
J Sociedades civiles, con o sin personalidad jurídica
N Entidades extranjeras
P Corporaciones Locales
Q Organismos públicos
R Congregaciones e instituciones religiosas
S Órganos de la Administración del Estado y de las Comunidades Autónomas
U Uniones Temporales de Empresas
V Otros tipos no definidos en el resto de claves
W Establecimientos permanentes de entidades no residentes en España

 K - Formato antiguo. L -
     * Formato antiguo. M - Formato antiguo. N - Formato antiguo.

     
     * Tipos de Organizaciones (primera letra del CIF) A - Sociedad Anónima. B -
     * Sociedad de responsabilidad limitada. C - Sociedad colectiva. D -
     * Sociedad comanditaria. E - Comunidad de bienes. F - Sociedad cooperativa.
     * G - Asociación. H - Comunidad de propietarios. P -
     * Corporación local. Q - Organismo autónomo. S - Organo de la
     * administración.
     *
     * @param value
     *            el cif a validar
     * @return true si el cif es valido, false en cualquier otro caso
     */
    public  boolean isValidCif(final String value) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }
        boolean retVal = false;
        if (value.matches("[ABCDEFGHJUV][0-9]{8}")) {
            final int digitoControl = digitoControlCIF(value.substring(1, value
                    .length() - 1));
            final char caracterControl = ("" + digitoControl).charAt(0);
            retVal = caracterControl == value.charAt(value.length() - 1);
        } else if (value.matches("[NPQRSW][0-9]{7}[A-J]")) {
            final int digitoControl = digitoControlCIF(value.substring(1, value
                    .length() - 1));
            final char caracterControl = LETRAS_CIF.charAt(digitoControl);
            retVal = caracterControl == value.charAt(value.length() - 1);
        }
        return retVal;

    }

    /**
     * Comprueba la validez de un NIE Un NIE es un Numero de Identificacion de
     * Extranjero. Es un NIF con una X delante.
     *
     * @param value
     *            La cadena a validar
     * @return true si es un NIE valido, false en otro caso
     */
    public  boolean isValidNie(final String value) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }
        boolean retVal = false;
        if (value.matches("[X-Z][0-9]{1,7}[A-Z]")) {
            retVal =  isValidNif(value.substring(1));
        }
        return retVal;
    }

    /**
     * Comprueba la validez de un NIF
     *
     * El algoritmo es sencillo. Se obtiene el módulo 23 de la parte numerica, y
     * se busca con ese numero la letra de control en la tabla
     * TRWAGMYFPDXBNJZSQVHLCKEO
     *
     * @param value
     *            La cadena a validar
     * @return true si es un NIF valido, false en otro caso.
     */
    public  boolean isValidNif(final String value) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }
        boolean retVal = false;
        if (value.matches("[0-9]{1,8}[A-Z]")) {
            // Leemos el numero del nif (no deberia dar errores, pues coincide
            // con el patron)
            final int numero = Integer.parseInt(
                    value.substring(0, value.length() - 1));               
            final char letra = LETRAS_NIF.charAt(numero % 23);
            retVal = letra == value.charAt(value.length() - 1);
        }
        return retVal;

    }

    /**
     * Comprueba si es un NIF o un CIF
     *
     * @param value
     *            La cadena a validar
     * @return true si es un NIF o CIF válido, false en otro caso
     */
    public  boolean isValidNifCif(final String value) {
        return isValidNif(value) || isValidCif(value);
    }

    /**
     * Comprueba si es un NIF o unNIE
     *
     * @param value
     *            La cadena a validar
     * @return true si es un NIF o NIE válido, false en otro caso
     */
    public  boolean isValidNifNie(final String value) {
        return isValidNif(value) || isValidNie(value);
    }

    /**
     * Comprueba si es un CIF o un NIE
     *
     * @param value
     *            La cadena a validar
     * @return true si es un CIF o NIE válido, false en otro caso
     */
    public  boolean isValidCifNie(final String value) {
        return isValidCif(value) || isValidNie(value);
    }

    /**
     * Comprueba si es un NIF, un CIF, o un NIE
     *
     * @param value
     *            La cadena a validar
     * @return true si es un NIF, un CIF o un NIE válido, false en otro caso
     */
    public  boolean isValidNifNieCif(final String value) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }
        return isValidNif(value) || isValidNie(value) || isValidCif(value);
    }

    /**
     * Comprueba si es un NIF, un CIF, o un NIE
     *
     * @param value
     *            La cadena a validar
     * @return true si es un NIF, un CIF o un NIE válido, false en otro caso
     */
    public  boolean isValid(final String value) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }
        return isValidNifNieCif(value);
    }


}
