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
import modelo.Country;
import modelo.CountryLenguage;

/**
 *
 * @author pedro.rinpiz
 */
public class CountryLenguageDAO {
    
    public void insertLenguage(CountryLenguage lenguage)
    {
        List<CountryLenguage> paises = new ArrayList<>();
        String query = "INSERT INTO countrylanguage (countryCode, language, isOfficial, percentage)"
                + "VALUES (?, ?, ?, ?)";
        if(paises.contains(lenguage))
        {
            System.out.println("Error, el idioma ya existe");
        }
        else
        {
            try (Connection connection = ConexionBd.conectarBD(); PreparedStatement statement = connection.prepareStatement(query)){
                statement.setString(1, lenguage.getCountryCode());
                statement.setString(2, lenguage.getLanguage());
                statement.setBoolean(3, lenguage.getIsOfficial());
                statement.setDouble(4, lenguage.getPercentage());
                paises.add(lenguage);
                statement.executeUpdate();
                System.out.println("Idioma agregado correctamente");
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
    
    public List<CountryLenguage> getAllLenguages()
    {
        List<CountryLenguage> idiomas = new ArrayList<>();
        String query = "SELECT * FROM countrylanguage";
        
        
         try (
                Connection connection = ConexionBd.conectarBD(); 
                PreparedStatement statement = connection.prepareStatement(query); 
                ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                CountryLenguage cl = new CountryLenguage(resultSet.getString("countryCode"),
                        resultSet.getString("language"),
                        resultSet.getBoolean("isOfficial"), 
                        resultSet.getDouble("percentage"));


                idiomas.add(cl);
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
        return idiomas;
        
    }
    
    public void updateCountry(CountryLenguage language)
    {
        String query = "UPDATE countrylanguage SET isOfficial = ?, percentage = ? WHERE countryCode = ? AND language = ?";
        
        try (Connection connection = ConexionBd.conectarBD();
            PreparedStatement statement = connection.prepareStatement(query)) 
        {
            

            
            statement.setBoolean(1, language.getIsOfficial());
            statement.setDouble(2, language.getPercentage());
            statement.setString(3, language.getCountryCode());
            statement.setString(4, language.getLanguage());
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
    
    public void deleteCountry(String countryCode, String language)
    {
        String query = "DELETE FROM countrylanguage WHERE countryCode = ? AND language = ? ";
        try (Connection connection = ConexionBd.conectarBD(); 
                PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, countryCode);
            statement.setString(2, language);
            // Usamos 'code' para identificar el registro a eliminar

            int filaBorrada = statement.executeUpdate();

            if (filaBorrada > 0) {
                System.out.println("Idioma eliminado correctamente");
            } else {
                System.out.println("Idioma no encontrado");
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
