using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FormularioValidacion
{
    internal class Persona
    {
        private String Nombre;
        private String Apellidos;
        private String Movil;
        private String Email;
        private String Nif;
        private String Ncuenta;
        private String Matricula;

        public Persona()
        {
        }

        public Persona(string nombre, string apellidos, string movil, string email, string nif, string ncuenta, string matricula)
        {
            Nombre = nombre;
            Apellidos = apellidos;
            Movil = movil;
            Email = email;
            Nif = nif;
            Ncuenta = ncuenta;
            Matricula = matricula;
        }

        public string Nombre1 { get => Nombre; set => Nombre = value; }
        public string Apellidos1 { get => Apellidos; set => Apellidos = value; }
        public string Movil1 { get => Movil; set => Movil = value; }
        public string Email1 { get => Email; set => Email = value; }
        public string Nif1 { get => Nif; set => Nif = value; }
        public string Ncuenta1 { get => Ncuenta; set => Ncuenta = value; }
        public string Matricula1 { get => Matricula; set => Matricula = value; }
    }
}
