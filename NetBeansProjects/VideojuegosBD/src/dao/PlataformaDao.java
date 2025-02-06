/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author pedro.rinpiz
 */
import bd.ConexionBd;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Plataforma;
import modelo.Videojuego;

/**
 *
 * @author Pedro
 */

public class PlataformaDao {

    public List<Plataforma> listarTodasPlataformas() throws ExcepcionesVideojuegos {
        List<Plataforma> plataformas = new ArrayList<>();
        String query = "SELECT * FROM Plataformas";
        try (
                Connection connection = ConexionBd.conectarBD(); 
                PreparedStatement statement = connection.prepareStatement(query); 
                ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Plataforma plataforma = new Plataforma(
                        resultSet.getInt("id_plataforma"),
                        resultSet.getString("nombre"),
                        resultSet.getDate("fecha_fundacion"));
                plataformas.add(plataforma);
            }

        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            e.printStackTrace();
            throw exVid;
        }
        return plataformas;
    }

    public List<Plataforma> listarPlataformasPorFecha() throws ExcepcionesVideojuegos {
        List<Plataforma> plataformas = new ArrayList<>();
        String query = "SELECT * FROM Plataformas ORDER BY fecha_fundacion";
        try (
                Connection connection = ConexionBd.conectarBD(); 
                PreparedStatement statement = connection.prepareStatement(query); 
                ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Plataforma plataforma = new Plataforma(
                        resultSet.getInt("id_plataforma"),
                        resultSet.getString("nombre"),
                        resultSet.getDate("fecha_fundacion"));
                plataformas.add(plataforma);
            }

        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            throw exVid;
        }
        return plataformas;
    }

    public List<Plataforma> buscarPlataformaPorNombre(String nombre) throws ExcepcionesVideojuegos {
        String query = "SELECT * FROM Plataformas WHERE nombre LIKE ?";
        Plataforma plataforma = null;
        List<Plataforma> plataformas = new ArrayList<>();
        try (
                Connection connection = ConexionBd.conectarBD(); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, "%" + nombre + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while(resultSet.next()) {
                    plataforma = new Plataforma(
                            resultSet.getInt("id_plataforma"),
                            resultSet.getString("nombre"),
                            resultSet.getDate("fecha_fundacion"));
                    plataformas.add(plataforma);
                }
            }

        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            throw exVid;
        }
        return plataformas;
    }
    
    public List<Videojuego> listarVideojuegosPorPlataforma(int idPlat) throws ExcepcionesVideojuegos
    {
        String query = "SELECT * FROM Videojuegos WHERE id_plataforma = ?";
        List<Videojuego> videojuegosPlataforma = new ArrayList<Videojuego>();
        Videojuego videojuego = null;
        
        try (
                Connection connection = ConexionBd.conectarBD(); 
                PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idPlat);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    videojuego = new Videojuego(resultSet.getInt("id_videojuego"),
                            resultSet.getInt("id_plataforma"),
                            resultSet.getString("nombre"),
                            resultSet.getString("genero"),
                            resultSet.getDouble("precio"),
                            resultSet.getDate("fecha_lanzamiento"));
                    videojuegosPlataforma.add(videojuego);
                }
            }

        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            e.printStackTrace();
            throw exVid;
        }
        
        return videojuegosPlataforma;
    }

    public Plataforma crearNuevaPlataforma(Plataforma nuevaPlataforma) throws ExcepcionesVideojuegos {
        String query = "INSERT INTO Plataformas (nombre, fecha_fundacion) VALUES (?, ?)";
        try (
                Connection connection = ConexionBd.conectarBD(); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, nuevaPlataforma.getNombre());
            statement.setDate(2, new java.sql.Date(nuevaPlataforma.getFecha_fundacion().getTime()));
            statement.executeUpdate();

        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            e.printStackTrace();
            throw exVid;
        }
        return nuevaPlataforma;
    }

    public boolean actualizarPlataforma(Plataforma plataformaModificar) throws ExcepcionesVideojuegos {
        String query = "UPDATE Plataformas SET nombre = ?, fecha_fundacion = ? WHERE id_plataforma = ?";
        try (
                Connection connection = ConexionBd.conectarBD(); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, plataformaModificar.getNombre());
            statement.setDate(2, new java.sql.Date(plataformaModificar.getFecha_fundacion().getTime()));
            statement.setInt(3, plataformaModificar.getId_plataforma());
            statement.executeUpdate();
            return true;

        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            throw exVid;

        }
    }

    public void borrarPlataforma(int id) throws ExcepcionesVideojuegos {
        String query = "DELETE FROM Plataformas WHERE id_plataforma = ?";
        try (
                Connection connection = ConexionBd.conectarBD(); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, id);
            int filasBorradas = statement.executeUpdate();

            if (filasBorradas > 0) {
                System.out.println("Plataforma eliminada correctamente");
            } else {
                System.out.println("Plataforma no encontrada");
            }

        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
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
