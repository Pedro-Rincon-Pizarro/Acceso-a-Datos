/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import modelo.Country;
import bd.ConexionBd;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pedro.rinpiz
 */
public class CountryDao 
{
   public List<Country> listarTodosLosPaises() throws Exception
   {
       List<Country> paises = new ArrayList<>();
       String query = "SELECT * FROM country";
       
       try (
               Connection connection = ConexionBd.conectarBD();
               PreparedStatement statement = connection.prepareStatement(query);
               ResultSet resultSet = statement.executeQuery();
               ){
           while(resultSet.next())
           {
               Country c = new Country(
                       resultSet.getString("code"),
                       resultSet.getString("name"), 
                       resultSet.getString("continent"), 
                       resultSet.getString("region"), 
                       resultSet.getDouble("surfaceArea"), 
                       resultSet.getInt("indepYear"), 
                       resultSet.getInt("population"), 
                       resultSet.getDouble("lifeExpectancy"), 
                       resultSet.getDouble("gnp"), 
                       resultSet.getDouble("gnpOld"), 
                       resultSet.getString("localName"), 
                       resultSet.getString("governmentForm"), 
                       resultSet.getString("headOfState"), 
                       resultSet.getInt("capital"), 
                       resultSet.getString("code2"));
               
               paises.add(c);
           }
           
       } catch (Exception e) {
           e.printStackTrace();
       }
       
       return paises;
   }
   
   public List<Country> listarPaisPorNombreYContinente(String nombre, String continente)
   {
       String query = "SELECT name as nombre, continent as continente FROM country";
       List<Country> paises = new ArrayList<>();
       try (
               Connection connection = ConexionBd.conectarBD();
               PreparedStatement statement = connection.prepareStatement(query);
               ResultSet resultSet = statement.executeQuery();
               ){
           while(resultSet.next())
           {
               Country c = new Country();
               c.setName("nombre");
               c.setContinent("continente");
               paises.add(c);
           }
           
       } catch (Exception e) {
       }
       return paises;
   }
   
   //obtener country por codigo
   
   public Country obtenerCountryPorCodigo(String codigo)
   {
       String query = "SELECT * FROM country WHERE code = ?";
       Country country = null;
       try (
               Connection connection = ConexionBd.conectarBD();
               PreparedStatement statement = connection.prepareStatement(query);
               
               
               ){
           statement.setString(1, codigo);
           try(ResultSet resultSet = statement.executeQuery()) 
           {
               while(resultSet.next())
           {
               country = new Country(
                       resultSet.getString("code"),
                       resultSet.getString("name"), 
                       resultSet.getString("continent"), 
                       resultSet.getString("region"), 
                       resultSet.getDouble("surfaceArea"), 
                       resultSet.getInt("indepYear"), 
                       resultSet.getInt("population"), 
                       resultSet.getDouble("lifeExpectancy"), 
                       resultSet.getDouble("gnp"), 
                       resultSet.getDouble("gnpOld"), 
                       resultSet.getString("localName"), 
                       resultSet.getString("governmentForm"), 
                       resultSet.getString("headOfState"), 
                       resultSet.getInt("capital"), 
                       resultSet.getString("code2"));
           }
           } catch (Exception e) {
           }
           
       } catch (Exception e) {
       }
       return country;
   }
}