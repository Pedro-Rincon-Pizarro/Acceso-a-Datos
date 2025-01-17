/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pedro.rinpiz
 */
public class ConexionBd 
{
    private static final String USER = "root";
    private static final String PWD = "";
    private static final String URL = "jdbc:MySQL://localhost/wosrld";//world mal escrito para que de error
    
    public static Connection conectarBD()
    {
        try {
            Connection conexion = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Conexion establecida");
            return conexion;
        } catch (SQLException e) {
            System.err.println("Error al conectar la base de datos");
            System.err.println("Error " + e.getErrorCode());//añadido este error
            System.err.println("Error " + e.getSQLState());//añadido este error
            //throw new RuntimeException("no se pudo conectar", e);
        }
        return null;//retornar null por comentar el throw 
    }
    
    
    public static void desconectarBD(Connection conexion)
    {
        if(conexion != null)
        {
            try {
                if(!conexion.isClosed())
                {
                    conexion.close();
                    System.out.println("Conexion cerrada");
                }
            } catch (Exception e) {
                System.err.println("Error al cerrar la conexion " + e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
        conectarBD();
    }

}

