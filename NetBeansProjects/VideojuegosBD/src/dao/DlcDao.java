/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.ConexionBd;
import java.util.ArrayList;
import java.util.List;
import modelo.Dlc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pedro
 */
public class DlcDao 
{
    public List<Dlc> listarTodosDlc() throws Exception
    {
        List<Dlc> dlcs = new ArrayList<>();
        String query = "SELECT * FROM Dlc";
        try(
               Connection connection = ConexionBd.conectarBD();
               PreparedStatement statement = connection.prepareStatement(query);
               ResultSet resultSet = statement.executeQuery();
                ){
            while(resultSet.next())
            {
                Dlc dlc = new Dlc(resultSet.getInt("id_dlc"), 
                        resultSet.getInt("id_videojuego"), 
                        resultSet.getString("nombre"), 
                        resultSet.getDouble("precio"), 
                        resultSet.getDate("fecha_lanzamiento"));
                
                dlcs.add(dlc);
            }
            
        } catch (SQLException e) {
            int errorCode = e.getErrorCode();
            switch (errorCode) {
                case 1045:
                    System.out.println("Error de autenticación: Verifique usuario y contraseña.");
                    break;
                    
                case 1062:
                    System.out.println("Error: Valor duplicado en una columna unica.");
                    break;
                    
                case 1049:
                    System.out.println("Error: Base de datos no encontrada.");
                    break;
                default:
                    System.out.println("Error desconocido " + e.getMessage());
            }
        }
        return dlcs;
    }
    
    public List<Dlc> listarDlcsPorIdVideojuego(int idVideojuego)
    {
       String query = "SELECT * FROM Dlc WHERE idVideojuego = ?";
       List<Dlc> dlcs = new ArrayList<>();
       try (
               Connection connection = ConexionBd.conectarBD();
               PreparedStatement statement = connection.prepareStatement(query);
               
               
               ){
           statement.setInt(1, idVideojuego);
           try(ResultSet resultSet = statement.executeQuery()) 
           {
               while(resultSet.next())
           {
               dlcs.add(new Dlc(resultSet.getInt("id_dlc"), 
                        resultSet.getInt("id_videojuego"), 
                        resultSet.getString("nombre"), 
                        resultSet.getDouble("precio"), 
                        resultSet.getDate("fecha_lanzamiento")));
           }
           } catch (Exception e) 
           {
               e.printStackTrace();
           }
           
       } catch (SQLException e) 
       {
           int errorCode = e.getErrorCode();
            switch (errorCode) {
                case 1045:
                    System.out.println("Error de autenticación: Verifique usuario y contraseña.");
                    break;
                    
                case 1062:
                    System.out.println("Error: Valor duplicado en una columna unica.");
                    break;
                    
                case 1049:
                    System.out.println("Error: Base de datos no encontrada.");
                    break;
                default:
                    System.out.println("Error desconocido " + e.getMessage());
            }
       }
       return dlcs;
    }
    
    public List<Dlc> listarDlcsPorPrecio()
    {
        List<Dlc> dlcs = new ArrayList<>();
        String query = "SELECT * FROM Dlc ORDER BY precio";
        try(
               Connection connection = ConexionBd.conectarBD();
               PreparedStatement statement = connection.prepareStatement(query);
               ResultSet resultSet = statement.executeQuery();
                )
        {
            while(resultSet.next())
            {
                Dlc dlc = new Dlc(resultSet.getInt("id_dlc"), 
                        resultSet.getInt("id_videojuego"), 
                        resultSet.getString("nombre"), 
                        resultSet.getDouble("precio"), 
                        resultSet.getDate("fecha_lanzamiento"));
                
                dlcs.add(dlc);
            }
            
        } 
        catch (SQLException e) 
        {
            int errorCode = e.getErrorCode();
            switch (errorCode) {
                case 1045:
                    System.out.println("Error de autenticación: Verifique usuario y contraseña.");
                    break;
                    
                case 1062:
                    System.out.println("Error: Valor duplicado en una columna unica.");
                    break;
                    
                case 1049:
                    System.out.println("Error: Base de datos no encontrada.");
                    break;
                default:
                    System.out.println("Error desconocido " + e.getMessage());
            }
        }
        return dlcs;
    }
}
