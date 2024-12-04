/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basededatos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author pedro.rinpiz
 */
public class EjemploMySQL_Conexion {
    private static final String USER = "root";
    private static final String PWD = "";
    private static final String URL = "jdbc:MySQL://localhost/bdformacion";
    
    public static void main(String[] args) 
    {
        try 
        {
            Connection conex = (Connection) DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Se ha conectado correctamente");
        } 
        catch (SQLException e)
        {
            System.out.println(e);
        }
        
    }
    
}
