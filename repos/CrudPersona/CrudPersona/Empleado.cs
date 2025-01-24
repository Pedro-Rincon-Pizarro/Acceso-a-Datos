using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CrudPersona
{
    internal class Empleado
    {
        private String nombre;
        private Double salario;
        private String cargo;


        public Empleado(string nombre, double salario, string cargo)
        {
            this.nombre = nombre;
            this.salario = salario;
            this.cargo = cargo;
        }

        public Empleado()
        {
        }

        public string Nombre { get => nombre; set => nombre = value; }
        public string Cargo { get => cargo; set => cargo = value; }
        public double Salario { get => salario; set => salario = value; }
    }
}
