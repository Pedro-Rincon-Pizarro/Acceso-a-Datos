/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.ConexionBd;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Dlc;
import modelo.Videojuego;

/**
 *
 * @author Pedro
 */
public class VideojuegoDao 
{
    public List<Videojuego> listarTodosLosVideojuegos()
    {
        List<Videojuego> videojuegos = new ArrayList<>();
        String query = "SELECT * FROM Videojuegos";
        try(
               Connection connection = ConexionBd.conectarBD();
               PreparedStatement statement = connection.prepareStatement(query);
               ResultSet resultSet = statement.executeQuery();
                ){
            while(resultSet.next())
            {
                Videojuego videojuego = new Videojuego(resultSet.getInt("id_videojuego"),  
                        resultSet.getString("nombre"), 
                        resultSet.getString("genero"),
                        resultSet.getString("desarrollador"),
                        resultSet.getDouble("precio"), 
                        resultSet.getDate("fecha_lanzamiento"));
                
                videojuegos.add(videojuego);
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
        return videojuegos;
    }
    
    public Videojuego buscarVideojuegoPorNombre(String nombre)
    {

        String query = "SELECT * FROM Videojuegos WHERE nombre = ?";
        Videojuego videojuego = null;
        try(
               Connection connection = ConexionBd.conectarBD();
               PreparedStatement statement = connection.prepareStatement(query);
               ResultSet resultSet = statement.executeQuery();
                ){
            while(resultSet.next())
            {
                videojuego = new Videojuego(resultSet.getInt("id_videojuego"),  
                        resultSet.getString("nombre"), 
                        resultSet.getString("genero"),
                        resultSet.getString("desarrollador"),
                        resultSet.getDouble("precio"), 
                        resultSet.getDate("fecha_lanzamiento"));
                

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
        return videojuego;
    }
    
    public List<Videojuego> ordenarVideojuegosPorFecha()
    {
        List<Videojuego> videojuegos = new ArrayList<>();
        String query = "SELECT * FROM Videojuegos ORDER BY fechaLanzamiento";
        try(
               Connection connection = ConexionBd.conectarBD();
               PreparedStatement statement = connection.prepareStatement(query);
               ResultSet resultSet = statement.executeQuery();
                ){
            while(resultSet.next())
            {
                Videojuego videojuego = new Videojuego(resultSet.getInt("id_videojuego"),  
                        resultSet.getString("nombre"), 
                        resultSet.getString("genero"),
                        resultSet.getString("desarrollador"),
                        resultSet.getDouble("precio"), 
                        resultSet.getDate("fecha_lanzamiento"));
                
                videojuegos.add(videojuego);
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
        return videojuegos;
    }
    
    public Videojuego crearNuevoVideojuego(Videojuego nuevoVideojuego)
    {
        String query = "INSERT INTO videojuegos (nombre, genero, desarrollador, precio, fecha_lanzamiento) Values(?,?,?,?,?)";
        try(
               Connection connection = ConexionBd.conectarBD();
               PreparedStatement statement = connection.prepareStatement(query);
               ResultSet resultSet = statement.executeQuery();
                )
        {
            statement.setString(1, nuevoVideojuego.getNombre());
            statement.setString(2, nuevoVideojuego.getGenero());
            statement.setString(3, nuevoVideojuego.getDesarrollador());
            statement.setDouble(4, nuevoVideojuego.getPrecio());
            statement.setDate(5, (Date) nuevoVideojuego.getFecha_lanzamiento());
            statement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            int errorCode = e.getErrorCode();
            switch (errorCode) 
            {
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
        return nuevoVideojuego;
    }
}
