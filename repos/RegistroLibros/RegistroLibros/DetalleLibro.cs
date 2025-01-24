using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace RegistroLibros
{
    
    public partial class DetalleLibro : Form
    {
        public int codigo;
        public String titulo;
        public String materia;
        public String autor;
        public String edicion;
        Libro libro;
        public Boolean accion = false;

        public DetalleLibro()
        {
            InitializeComponent();
        }

        
        

        private void btAceptar_Click(object sender, EventArgs e)
        {
            if (comboBox1.Text != null && comboBox1.Text != null && comboBox1.SelectedIndex != -1 && textBox3.Text != null && textBox4.Text != null)
            {
                codigo = Convert.ToInt32(textBox1.Text);
                titulo = textBox2.Text;
                materia = comboBox1.SelectedItem.ToString();
                autor = textBox3.Text;
                edicion = textBox4.Text;
                libro = new Libro(codigo, titulo, materia, autor, edicion);
                accion = true;
                Dispose();
            }
        }

        private void btCancelar_Click(object sender, EventArgs e)
        {
            Dispose();
        }

        private void DetalleLibro_Load(object sender, EventArgs e)
        {
            textBox1.Text = codigo.ToString();
            textBox2.Text = titulo;
            comboBox1.Text = materia;
            textBox3.Text = edicion;
            textBox4.Text = autor;
        }
    }
}
