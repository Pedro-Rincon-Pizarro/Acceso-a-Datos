using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CrudProyectos
{
    internal class Proyecto
    {
        private int id_proyecto;
        private string titulo;
        private string descripcion;
        private int horas;
        private DateTime fecha_inicio;
        private static int contador = 0;

        public Proyecto()
        {
        }

        public Proyecto(string titulo, string descripcion, int horas, DateTime fechaInicio)
        {
            
            this.id_proyecto = contador++;
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.horas = horas;
            this.fecha_inicio = fechaInicio;
        }

        public int Id_proyecto { get => id_proyecto; set => id_proyecto = value; }
        public string Titulo { get => titulo; set => titulo = value; }
        public string Descripcion { get => descripcion; set => descripcion = value; }
        public int Horas { get => horas; set => horas = value; }
        public DateTime Fecha_inicio { get => fecha_inicio; set => fecha_inicio = value; }
    }
}
