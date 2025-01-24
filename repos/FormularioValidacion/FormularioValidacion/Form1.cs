using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FormularioValidacion
{
    
    public partial class Form1 : Form
    {
        const int CANTIDAD_PERSONAS = 100; 
        Persona[] Personas = new Persona[CANTIDAD_PERSONAS]; 
        public Form1()
        {
            InitializeComponent();

        }


        private void button2_Click(object sender, EventArgs e)
        {
            Boolean seguir = true;
            //validar
            if(string.IsNullOrEmpty(txtNombre.Text))
            {
                lblErrorNombre.Text = "El nombre es obligatorio";
                seguir = false;
            }
            else
            {
                //validar nombre
            }
            if(string.IsNullOrEmpty(txtApellidos.Text))
            {
                lblErrorApellido.Text = "El apellido es obligatorio";
                seguir = false;
            }
            else
            {
                //validar apellido
            }
            if (string.IsNullOrEmpty(txtMovil.Text))
            {
                lblErrorMovil.Text = "El Movil es obligatorio";
                seguir = false;
            }
            else
            {
                //validar movil
            }
            if (string.IsNullOrEmpty(txtEmail.Text))
            {
                lblErrorEmail.Text = "El email es obligatorio";
                seguir = false;
            }
            else
            {
                //validar email
            }
            if (string.IsNullOrEmpty(txtNif.Text))
            {
                lblErrorNif.Text = "El NIF es obligatorio";
                seguir = false;
            }
            else
            {
                //validar nif
            }
            if (string.IsNullOrEmpty(txtNCuenta.Text))
            {
                lblErrorNCuenta.Text = "El Numero de Cuenta es obligatorio";
                seguir = false;
            }
            else
            {
                //validar cuenta
            }
            if (string.IsNullOrEmpty(txtMatricula.Text))
            {
                lblErrorMatricula.Text =  "La matricula es obligatoria";
                seguir = false;
            }
            else
            {
                //validar matricula
            }

            if (seguir == true)
            {
                
            }
            //instanciar persona

            //incluir persona en la lista

            //incluir persona en dataGrid
        }

        private void button3_Click(object sender, EventArgs e)
        {

        }

      
    }
}
