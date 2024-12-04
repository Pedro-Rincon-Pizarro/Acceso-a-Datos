/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.ConexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
                ){
            while(resultSet.next())
            {
                City c = new City(resultSet.getInt("id"), 
                        resultSet.getString("name"), 
                        resultSet.getString("countryCode"), 
                        resultSet.getString("name"), 
                        resultSet.getInt("population"));
                
                ciudades.add(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ciudades;
    }
}
