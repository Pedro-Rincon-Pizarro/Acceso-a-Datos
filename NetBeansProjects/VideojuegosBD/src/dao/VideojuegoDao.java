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
import modelo.Videojuego;

/**
 *
 * @author Pedro
 */
public class VideojuegoDao {

    public List<Videojuego> listarTodosLosVideojuegos() throws ExcepcionesVideojuegos{
        List<Videojuego> videojuegos = new ArrayList<>();
        String query = "SELECT * FROM Videojuegos";
        try (
                Connection connection = ConexionBd.conectarBD(); PreparedStatement statement = connection.prepareStatement(query); ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Videojuego videojuego = new Videojuego(resultSet.getInt("id_videojuego"),
                        resultSet.getInt("id_plataforma"),
                        resultSet.getString("nombre"),
                        resultSet.getString("genero"),
                        resultSet.getDouble("precio"),
                        resultSet.getDate("fecha_lanzamiento"));

                videojuegos.add(videojuego);
            }

        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            throw exVid;
        }
        return videojuegos;
    }

    public List<Videojuego> buscarVideojuegoPorNombre(String nombre) throws ExcepcionesVideojuegos{

        String query = "SELECT * FROM Videojuegos WHERE nombre LIKE ?";
        Videojuego videojuego = null;
        List<Videojuego> videojuegos = new ArrayList<>();
        try (
                Connection connection = ConexionBd.conectarBD(); 
                PreparedStatement statement = connection.prepareStatement(query)) 
        {       statement.setString(1, "%" + nombre + "%");
            try(ResultSet resultSet = statement.executeQuery())
            {
                while(resultSet.next()) {
                videojuego = new Videojuego(resultSet.getInt("id_videojuego"),
                        resultSet.getInt("id_plataforma"),
                        resultSet.getString("nombre"),
                        resultSet.getString("genero"),
                        resultSet.getDouble("precio"),
                        resultSet.getDate("fecha_lanzamiento"));
                videojuegos.add(videojuego);
            }
            } catch (Exception e) {
            }
            

        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            throw exVid;
        }
        return videojuegos;
    }

    public List<Videojuego> ordenarVideojuegosPorFecha() throws ExcepcionesVideojuegos{
        List<Videojuego> videojuegos = new ArrayList<>();
        String query = "SELECT * FROM Videojuegos ORDER BY fecha_lanzamiento";
        try (
                Connection connection = ConexionBd.conectarBD(); PreparedStatement statement = connection.prepareStatement(query); ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Videojuego videojuego = new Videojuego(resultSet.getInt("id_videojuego"),
                        resultSet.getInt("id_plataforma"),
                        resultSet.getString("nombre"),
                        resultSet.getString("genero"),
                        resultSet.getDouble("precio"),
                        resultSet.getDate("fecha_lanzamiento"));

                videojuegos.add(videojuego);
            }

        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            throw exVid;
        }
        return videojuegos;
    }

    public void crearNuevoVideojuego(Videojuego nuevoVideojuego) throws ExcepcionesVideojuegos{
        String query = "INSERT INTO videojuegos (id_plataforma, nombre, genero, precio, fecha_lanzamiento) Values(?,?,?,?,?)";
        try (
                Connection connection = ConexionBd.conectarBD();
                PreparedStatement statement = connection.prepareStatement(query); 
                ) {
            statement.setInt(1, nuevoVideojuego.getId_plataforma());
            statement.setString(2, nuevoVideojuego.getNombre());
            statement.setString(3, nuevoVideojuego.getGenero());
            statement.setDouble(4, nuevoVideojuego.getPrecio());
            statement.setDate(5, new java.sql.Date(nuevoVideojuego.getFecha_lanzamiento().getTime()));
            statement.executeUpdate();
        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            e.printStackTrace();
            throw exVid;
        }
        
    }

    public void actualizarVideojuego(Videojuego videojuegoModificar) throws ExcepcionesVideojuegos{
        String query = "UPDATE Videojuegos SET id_plataforma = ?, nombre = ?, genero = ?, precio = ?, fecha_lanzamiento = ?"
                + "WHERE id_videojuego = ?";
        try (Connection connection = ConexionBd.conectarBD(); 
                PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setInt(1, videojuegoModificar.getId_plataforma());
            statement.setString(2, videojuegoModificar.getNombre());
            statement.setString(3, videojuegoModificar.getGenero());
            statement.setDouble(4, videojuegoModificar.getPrecio());
            statement.setDate(5, new java.sql.Date(videojuegoModificar.getFecha_lanzamiento().getTime()));
            statement.setInt(6, videojuegoModificar.getId_videojuego());
            statement.executeUpdate();
            System.out.println("Videojuego actualizado correctamente");
        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            e.printStackTrace();
            throw exVid;
        }
    }

    public void borrarVideojuego(int id) throws ExcepcionesVideojuegos{
        String query = "DELETE FROM Videojuegos WHERE id_videojuego = ?";
        try (Connection connection = ConexionBd.conectarBD(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            int filaBorrada = statement.executeUpdate();

            if (filaBorrada > 0) {
                System.out.println("Videojuego eliminado correctamente");
            } else {
                System.out.println("Videojuego no encontrado");
            }
        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            e.printStackTrace();
            throw exVid;
        }

    }
    
    private ExcepcionesVideojuegos manejarExcepcionSQL(SQLException e, String query) {
        ExcepcionesVideojuegos exVid = new ExcepcionesVideojuegos();
        exVid.setCodigoError(e.getErrorCode());
        exVid.setMensajeAdministrador(e.getMessage());
        exVid.setMensajeUsuario(e.getMessage());
        exVid.setSentenciaSQL(query);
        switch (e.getErrorCode()) {
            case 1045:
                exVid.setMensajeUsuario("Error de autenticación: Verifique usuario y contraseña.");
                break;

            case 1062:
                exVid.setMensajeUsuario("Error: Valor duplicado en una columna única.");
                break;

            case 1049:
                exVid.setMensajeUsuario("Error: Base de datos no encontrada.");
                break;

            default:
                exVid.setMensajeUsuario("Error desconocido: " + e.getMessage());
        }
        return exVid;
    }
}
