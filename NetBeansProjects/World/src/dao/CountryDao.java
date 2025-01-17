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
public class CountryDao {

    public List<Country> listarTodosLosPaises() throws Exception {
        List<Country> paises = new ArrayList<>();
        String query = "SELECT * FROM country";

        try (
                Connection connection = ConexionBd.conectarBD(); 
                PreparedStatement statement = connection.prepareStatement(query); 
                ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
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

        return paises;
    }

    public List<Country> listarPaisPorNombreYContinente(String nombre, String continente) {
        String query = "SELECT name as nombre, continent as continente FROM country";
        List<Country> paises = new ArrayList<>();
        try (
                Connection connection = ConexionBd.conectarBD(); PreparedStatement statement = connection.prepareStatement(query); ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Country c = new Country();
                c.setName("nombre");
                c.setContinent("continente");
                paises.add(c);
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
        return paises;
    }

    //obtener country por codigo
    public Country obtenerCountryPorCodigo(String codigo) {
        String query = "SELECT * FROM country WHERE code = ?";
        Country country = null;
        try (
                Connection connection = ConexionBd.conectarBD(); PreparedStatement statement = connection.prepareStatement(query);) {
            statement.setString(1, codigo);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
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

        } catch (Exception e) {
        }
        return country;
    }

    public void insertCountry(Country country) {
        String query = "INSERT INTO Country (code, name, continent, region, surfaceArea, indepYear, population, "
                + "lifeExpectancy, gnp, gnpOld, localName, governmentForm, headOfState, capital, code2) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = ConexionBd.conectarBD(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, country.getCode());  // Añadido 'code' como primer campo
            statement.setString(2, country.getName());
            statement.setString(3, country.getContinent());
            statement.setString(4, country.getRegion());
            statement.setDouble(5, country.getSurfaceArea());
            statement.setInt(6, country.getIndepYear());
            statement.setInt(7, country.getPopulation());
            statement.setDouble(8, country.getLifeExpectancy());
            statement.setDouble(9, country.getGnp());
            statement.setDouble(10, country.getGnpOld());
            statement.setString(11, country.getLocalName());
            statement.setString(12, country.getGovernmentForm());
            statement.setString(13, country.getHeadOfState());
            statement.setInt(14, country.getCapital());
            statement.setString(15, country.getCode2());
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

    public void updateCountry(Country country) {
        String query = "UPDATE Country SET name = ?, continent = ?, region = ?, surfaceArea = ?, indepYear = ?, "
                + "population = ?, lifeExpectancy = ?, gnp = ?, gnpOld = ?, localName = ?, governmentForm = ?, "
                + "headOfState = ?, capital = ?, code2 = ? WHERE code = ?";
        try (Connection connection = ConexionBd.conectarBD(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, country.getName());
            statement.setString(2, country.getContinent());
            statement.setString(3, country.getRegion());
            statement.setDouble(4, country.getSurfaceArea());
            statement.setInt(5, country.getIndepYear());
            statement.setInt(6, country.getPopulation());
            statement.setDouble(7, country.getLifeExpectancy());
            statement.setDouble(8, country.getGnp());
            statement.setDouble(9, country.getGnpOld());
            statement.setString(10, country.getLocalName());
            statement.setString(11, country.getGovernmentForm());
            statement.setString(12, country.getHeadOfState());
            statement.setInt(13, country.getCapital());
            statement.setString(14, country.getCode2());
            statement.setString(15, country.getCode());
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

    public void deleteCountry(String code) {
        String query = "DELETE FROM Country WHERE code = ? ";
        try (Connection connection = ConexionBd.conectarBD(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, code);  // Usamos 'code' para identificar el registro a eliminar

            int filaBorrada = statement.executeUpdate();

            if (filaBorrada > 0) {
                System.out.println("País eliminado correctamente");
            } else {
                System.out.println("País no encontrado");
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
