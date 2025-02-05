using ModernGUI_V3.conexion;
using ModernGUI_V3.excepciones;
using ModernGUI_V3.modelo;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ModernGUI_V3.dao
{
    internal class ProyectoDao
    {
        private ConexionBD conexion = new ConexionBD();

        public ProyectoDao()
        {
        }

        public int agregarProyecto(Proyecto proyecto)
        {
            int result = 0;
            String insert = "INSERT INTO proyectos (titulo, descripcion, horas, fecha_inicio) values (@titulo, @descripcion, @horas, @fecha_inicio);";
            try
            {
                MySqlCommand mCommand = new MySqlCommand(insert, conexion.abrirConexion());
                mCommand.Parameters.Add(new MySqlParameter("@titulo", proyecto.Titulo));
                mCommand.Parameters.Add(new MySqlParameter("@descripcion", proyecto.Descripcion));
                mCommand.Parameters.Add(new MySqlParameter("@horas", proyecto.Horas));
                mCommand.Parameters.Add(new MySqlParameter("@fecha_inicio", proyecto.Fecha_inicio));

                result = mCommand.ExecuteNonQuery();
                //if (resul!=0)     MessageBox.Show("OK");
                //else              MessageBox.Show("Fallo");
            }
            catch (MySqlException ex)
            {
                ExcepcionProyectos e = new ExcepcionProyectos();
                e.CodigoError = ex.ErrorCode;
                e.MensajeAdministrador = ex.Message;
                e.SentenciaSQL = insert;
                switch (ex.Number)
                {
                    case 1062:
                        //CLAVE DUPLICADA
                        e.MensajeUsuario = "Clave duplicada";
                        break;
                }
            }
            finally
            {
                conexion.cerrarConexion();
            }
            return result;
        }

        public int modificarProyecto(Proyecto p)
        {
            int resul = -1;
            string strUPDATE = " UPDATE proyectos " +
                   "SET titulo = @titulo, " +
                   "descripcion = @descripcion, " +
                   "horas = @horas, " +
                   "fecha_inicio = @fecha_inicio " +
                   "WHERE id_proyecto = @id_proyecto";
            try
            {
                MySqlCommand mCommand = new MySqlCommand(strUPDATE, conexion.abrirConexion());
                mCommand.Parameters.Add(new MySqlParameter("@titulo", p.Titulo));
                mCommand.Parameters.Add(new MySqlParameter("@descripcion", p.Descripcion));
                mCommand.Parameters.Add(new MySqlParameter("@horas", p.Horas));
                mCommand.Parameters.Add(new MySqlParameter("@fecha_inicio", p.Fecha_inicio));
                mCommand.Parameters.Add(new MySqlParameter("@id_proyecto", p.Id_proyecto));
                resul = mCommand.ExecuteNonQuery();
            }
            catch (MySqlException ex)
            {
                MessageBox.Show(ex.Message); //Si existe un error aquí muestra el mensaje
            }
            finally
            {
                conexion.cerrarConexion();
            }
            return resul;
        }

        public int eliminarProducto(int id)
        {
            int resul = 0;
            string strDELETE = " DELETE FROM proyectos WHERE id_proyecto = @id_proyecto";
            try
            {
                MySqlCommand mCommand = new MySqlCommand(strDELETE, conexion.abrirConexion());
                mCommand.Parameters.Add(new MySqlParameter("@id_proyecto", id));
                resul = mCommand.ExecuteNonQuery();
            }
            catch (MySqlException ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                conexion.cerrarConexion();
            }
            return resul;
        }

        public List<Proyecto> consultarProyectos(string filtro)
        {
            List<Proyecto> listaProyectos = new List<Proyecto>();
            MySqlDataReader mReader = null;
            Proyecto p;
            string strCONSULTA = "SELECT * FROM proyectos";
            if (filtro != "")
            {
                strCONSULTA += " WHERE titulo LIKE '%" + filtro + "%';";
            }
            try
            {
                MySqlCommand mCommand = new MySqlCommand(strCONSULTA);
                mCommand.Connection = conexion.abrirConexion();
                mReader = mCommand.ExecuteReader();

                while (mReader.Read())
                {
                    p = new Proyecto();
                    p.Id_proyecto = mReader.GetInt16("id_proyecto");
                    p.Titulo = mReader.GetString("titulo");
                    p.Descripcion = mReader.GetString("descripcion");
                    p.Horas = mReader.GetInt16("horas");
                    p.Fecha_inicio = mReader.GetDateTime("fecha_inicio");
                    //4 es la quinta col, empieza en 0

                    listaProyectos.Add(p);
                }
                mReader.Close();
            }
            catch (MySqlException ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                conexion.cerrarConexion();
            }
            return listaProyectos;
        }
    }
}
