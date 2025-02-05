using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ModernGUI_V3.modelo
{
    internal class Empresa
    {
        private int id_empresa;
        private String nombre;
        private String descripcion;
        private String poblacion;
        public Empresa() 
        {

        }

        public Empresa(int id_empresa, string nombre, string descripcion, string poblacion)
        {
            this.id_empresa = id_empresa;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.poblacion = poblacion;
        }

        public int Id_empresa { get => id_empresa; set => id_empresa = value; }
        public string Nombre { get => nombre; set => nombre = value; }
        public string Descripcion { get => descripcion; set => descripcion = value; }
        public string Poblacion { get => poblacion; set => poblacion = value; }
    }
}
