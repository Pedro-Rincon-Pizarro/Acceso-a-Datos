using ModernGUI_V3.conexion;
using ModernGUI_V3.excepciones;
using ModernGUI_V3.modelo;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ModernGUI_V3.dao
{
    internal class EmpresaDao
    {
        private ConexionBD conexion = new ConexionBD();
        public List<String> consultarEmpresasCbo()
        {
            List<String> listProyectos = new List<String>();
            MySqlDataReader mReader = null;
            string strCONSULTA = "SELECT * FROM empresas";

            try
            {
                MySqlCommand mCommand = new MySqlCommand(strCONSULTA);
                mCommand.Connection = conexion.abrirConexion();
                mReader = mCommand.ExecuteReader();

                while (mReader.Read())
                {
                    listProyectos.Add(mReader.GetString("nombre"));
                }
                mReader.Close();
            }
            catch (MySqlException ex)
            {
                ExcepcionProyectos e = new ExcepcionProyectos();
                e.CodigoError = ex.ErrorCode;
                e.MensajeAdministrador = ex.Message;
                e.SentenciaSQL = strCONSULTA;
            }
            finally
            {
                conexion.cerrarConexion();
            }
            return listProyectos;
        }
    }
}
