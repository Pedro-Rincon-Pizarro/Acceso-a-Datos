/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.ConexionBd;
import bd.ConexionBd;
import dao.ExcepcionesVideojuegos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Dlc;

/**
 * Clase que implementa las operaciones CRUD para la entidad DLC.
 */
public class DlcDao {

    public List<Dlc> listarTodosLosDlcs() throws ExcepcionesVideojuegos{
        List<Dlc> dlcs = new ArrayList<>();
        String query = "SELECT * FROM Dlcs";
        try (
                Connection connection = ConexionBd.conectarBD(); 
                PreparedStatement statement = connection.prepareStatement(query); 
                ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Dlc dlc = new Dlc(resultSet.getInt("id_dlc"),
                        resultSet.getInt("id_videojuego"),
                        resultSet.getString("nombre"),
                        resultSet.getDouble("precio"),
                        resultSet.getDate("fecha_lanzamiento"));

                dlcs.add(dlc);
            }

        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            e.printStackTrace();
            throw exVid;
        }
        return dlcs;
    }

    public List<Dlc> buscarDlcPorNombre(String nombre) throws ExcepcionesVideojuegos{
         List<Dlc> dlcs = new ArrayList<>();
        String query = "SELECT * FROM Dlcs WHERE nombre LIKE ?";
        Dlc dlc = null;
        try (
                Connection connection = ConexionBd.conectarBD(); 
                PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "%" + nombre + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    dlc = new Dlc(resultSet.getInt("id_dlc"),
                            resultSet.getInt("id_videojuego"),
                            resultSet.getString("nombre"),
                            resultSet.getDouble("precio"),
                            resultSet.getDate("fecha_lanzamiento"));
                    dlcs.add(dlc);
                }
            }

        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            e.printStackTrace();
            throw exVid;
        }
        return dlcs;
    }

    public List<Dlc> ordenarDlcsPorFecha() throws ExcepcionesVideojuegos{
        List<Dlc> dlcs = new ArrayList<>();
        String query = "SELECT * FROM Dlcs ORDER BY fecha_lanzamiento";
        try (
                Connection connection = ConexionBd.conectarBD(); 
                PreparedStatement statement = connection.prepareStatement(query); 
                ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Dlc dlc = new Dlc(resultSet.getInt("id_dlc"),
                        resultSet.getInt("id_videojuego"),
                        resultSet.getString("nombre"),
                        resultSet.getDouble("precio"),
                        resultSet.getDate("fecha_lanzamiento"));

                dlcs.add(dlc);
            }

        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            e.printStackTrace();
            throw exVid;
        }
        return dlcs;
    }

    public Dlc crearNuevoDlc(Dlc nuevoDlc) throws ExcepcionesVideojuegos{
        String query = "INSERT INTO Dlcs (id_videojuego, nombre, precio, fecha_lanzamiento) VALUES (?, ?, ?, ?)";
        try (
                Connection connection = ConexionBd.conectarBD(); 
                PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, nuevoDlc.getId_videojuego());
            statement.setString(2, nuevoDlc.getNombre());
            statement.setDouble(3, nuevoDlc.getPrecio());
            statement.setDate(4, new java.sql.Date(nuevoDlc.getFecha_lanzamiento().getTime()));
            statement.executeUpdate();
        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            e.printStackTrace();
            throw exVid;
        }
        return nuevoDlc;
    }

    public void actualizarDlc(Dlc dlcModificar) throws ExcepcionesVideojuegos{
        String query = "UPDATE Dlcs SET id_videojuego = ?, nombre = ?, precio = ?, fecha_lanzamiento = ? WHERE id_dlc = ?";
        try (Connection connection = ConexionBd.conectarBD(); 
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, dlcModificar.getId_videojuego());
            statement.setString(2, dlcModificar.getNombre());
            statement.setDouble(3, dlcModificar.getPrecio());
            statement.setDate(4, new java.sql.Date(dlcModificar.getFecha_lanzamiento().getTime()));
            statement.setInt(5, dlcModificar.getId_dlc());
            statement.executeUpdate();
            System.out.println("DLC actualizado correctamente");
        } catch (SQLException e) {
            ExcepcionesVideojuegos exVid = manejarExcepcionSQL(e, query);
            e.printStackTrace();
            throw exVid;
        }
    }

    public void borrarDlc(int id) throws ExcepcionesVideojuegos{
        String query = "DELETE FROM Dlcs WHERE id_dlc = ?";
        try (Connection connection = ConexionBd.conectarBD(); 
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            int filasBorradas = statement.executeUpdate();

            if (filasBorradas > 0) {
                System.out.println("DLC eliminado correctamente");
            } else {
                System.out.println("DLC no encontrado");
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