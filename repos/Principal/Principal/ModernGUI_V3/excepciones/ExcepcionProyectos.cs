using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ModernGUI_V3.excepciones
{
    internal class ExcepcionProyectos : Exception
    {
        private String mensajeUsuario;
        private String mensajeAdministrador;
        private int codigoError;
        private String sentenciaSQL;
        public ExcepcionProyectos()
        {

        }

        public ExcepcionProyectos(string mensajeUsuario, string mensajeAdministrador, int codigoError, string sentenciaSQL)
        {
            this.MensajeUsuario = mensajeUsuario;
            this.MensajeAdministrador = mensajeAdministrador;
            this.CodigoError = codigoError;
            this.SentenciaSQL = sentenciaSQL;
        }

        public string MensajeUsuario { get => mensajeUsuario; set => mensajeUsuario = value; }
        public string MensajeAdministrador { get => mensajeAdministrador; set => mensajeAdministrador = value; }
        public int CodigoError { get => codigoError; set => codigoError = value; }
        public string SentenciaSQL { get => sentenciaSQL; set => sentenciaSQL = value; }

        public override string ToString()
        {
            //return base.ToString();
            return "Excepcion{" + "mensajeUsuario=" + mensajeUsuario + ", mensajeAdministrador=" + mensajeAdministrador + ", codigoError=" + codigoError + ", sentenciaSQL=" + sentenciaSQL + "}";
        }

    }
}
