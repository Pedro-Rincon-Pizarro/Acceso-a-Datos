/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.ConexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.City;

/**
 *
 * @author pedro.rinpiz
 */
public class CityDao 
{
    public List<City> getAllCities() throws Exception
    {
        List<City> ciudades = new ArrayList<>();
        String query = "SELECT * FROM city";
        try(
               Connection connection = ConexionBd.conectarBD();
               PreparedStatement statement = connection.prepareStatement(query);
               ResultSet resultSet = statement.executeQuery();
                )
        {
            while(resultSet.next())
            {
                City c = new City(resultSet.getInt("id"), 
                        resultSet.getString("name"), 
                        resultSet.getString("countryCode"), 
                        resultSet.getString("district"), 
                        resultSet.getInt("population"));
                
                ciudades.add(c);
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
        return ciudades;
    }
    
    public void insertCity(City city)
    {
        String query = "INSERT INTO City (name, countryCode, district, population) Values(?,?,?,?)";
        try (Connection connection = ConexionBd.conectarBD();
            PreparedStatement statement = connection.prepareStatement(query)) 
        {
            statement.setString(1, city.getName());
            statement.setString(2, city.getCountryCode());
            statement.setString(3, city.getDistrict());
            statement.setInt(4, city.getPopulation());
            statement.executeUpdate();
            
            System.out.println("Ciudad agregada correctamente");
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
    }
    
    public void updateCity(City city)
    {
        String query = "UPDATE city SET name = ?, countryCode = ?, district = ?, population = ? WHERE id = ?";
        try (Connection connection = ConexionBd.conectarBD();
            PreparedStatement statement = connection.prepareStatement(query)) 
        {
            
            statement.setString(1, city.getName());
            statement.setString(2, city.getCountryCode());
            statement.setString(3, city.getDistrict());
            statement.setInt(4, city.getPopulation());
            statement.setInt(5, city.getId());
            statement.executeUpdate();
            
            System.out.println("Ciudad actualizada correctamente");
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
    }
    
    public void deleteCity(int id)
    {
        String query = "DELETE FROM city where id = ?";
        try(Connection connection = ConexionBd.conectarBD();
            PreparedStatement statement = connection.prepareStatement(query)) 
        {
            statement.setInt(1, id);
            
            int filaBorrada = statement.executeUpdate();
            
            if(filaBorrada > 0)
            {
                System.out.println("Ciudad eliminada correctamente");
            }
            else
            {
                System.out.println("Ciudad no encontrada");
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
    }
}
