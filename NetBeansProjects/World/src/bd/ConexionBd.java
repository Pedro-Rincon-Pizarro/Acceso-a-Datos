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
    private static final String URL = "jdbc:MySQL://localhost/world";
    
    public static Connection conectarBD()
    {
        try {
            Connection conexion = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Conexion establecida");
            return conexion;
        } catch (SQLException e) {
            System.err.println("Error al conectar la base de datos");
            throw new RuntimeException("no se pudo conectar", e);
        }
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

}

