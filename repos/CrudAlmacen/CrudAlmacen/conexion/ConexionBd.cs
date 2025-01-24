using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml.Schema;

namespace CrudAlmacen.conexion
{
    internal class ConexionBd
    {
        public ConexionBd()
        {

        }
            
            protected String server = "localhost";
            protected String database = "almacen";
            protected String user = "root";
            protected String password = "";
            private MySqlConnection conex;
            private String cadenaConexion;


        public void Conectar()
        {
            try
            {
                cadenaConexion = "Database" + database + 
                    "; DataSource=" + server +
                    "; User Id=" + user +
                    "; Password=" + password;
                conex = new MySqlConnection(cadenaConexion);
            }
            catch(MySql.Data.MySqlClient.MySqlException e) 
            {
                switch (e.Number)
                {
                    case 0:
                        MessageBox.Show("No ha podido conectar con el servidor");
                        break;

                    case 1:
                        MessageBox.Show("");
                        break;
                }
            }
        }
    }
}
