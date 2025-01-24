using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace FormularioValidacion
{
    internal class validaciones
    {
        public validaciones() { }

        public static bool ComprobarEmail(string email)
        {
            String sFormato;
            sFormato = "\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
            if (Regex.IsMatch(email, sFormato))
            {
                if (Regex.Replace(email, sFormato, String.Empty).Length == 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }

        public static bool ComprobarNif(string nif)
        {
            return false;
        }

        public static bool ComprobarTlf(string tlf)
        {
            return false;
        }

        public static bool comprobarNombreApellido(string nombre)
        {
            return false;
        }

        public static bool ComprobarMatricula(string matricula)
        {
            return false;
        }

        public static bool ComprobarCuenta(string cuenta)
        {
            return false;
        }
    }
}
