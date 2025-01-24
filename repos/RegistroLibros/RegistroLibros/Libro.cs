using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RegistroLibros
{
    internal class Libro
    {
        private int codigo;
        private String titulo;
        private String materia;
        private String autor;
        private String edicion;

        public Libro()
        {

        }

        public Libro(int codigo, string titulo, string materia, string autor, string edicion)
        {
            this.Codigo = codigo;
            this.Titulo = titulo;
            this.Materia = materia;
            this.Autor = autor;
            this.Edicion = edicion;
        }

        public int Codigo { get => codigo; set => codigo = value; }
        public string Titulo { get => titulo; set => titulo = value; }
        public string Materia { get => materia; set => materia = value; }
        public string Autor { get => autor; set => autor = value; }
        public string Edicion { get => edicion; set => edicion = value; }
    }
}
