/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author pedro.rinpiz
 */
public class ExcepcionesVideojuegos extends Exception
{
    private String mensajeUsuario;
    private String mensajeAdministrador;
    private int codigoError;
    private String sentenciaSQL;

    public ExcepcionesVideojuegos() {
    }

    public String getMensajeUsuario() 
    {
        return mensajeUsuario;
    }

    public void setMensajeUsuario(String mensajeUsuario) 
    {
        this.mensajeUsuario = mensajeUsuario;
    }

    public String getMensajeAdministrador() {
        return mensajeAdministrador;
    }

    public void setMensajeAdministrador(String mensajeAdministrador) 
    {
        this.mensajeAdministrador = mensajeAdministrador;
    }

    public int getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }

    public String getSentenciaSQL() {
        return sentenciaSQL;
    }

    public void setSentenciaSQL(String sentenciaSQL) {
        this.sentenciaSQL = sentenciaSQL;
    }
    
    
    
    
}
