using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CrudProyectos
{
    public partial class Form2 : Form
    {

        public String titulo1;
        public String descripcion1;
        public int horas1;
        public DateTime fecha1;
        public Boolean accion;
        Image imagenFondo;
        public Form2()
        {
            InitializeComponent();
            redimensionarFondo();
                
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            txtTitulo2.Text = titulo1;
            txtDescripcion2.Text = descripcion1;
            txtHoras2.Text = horas1.ToString();
            dateTimePicker2.Value = fecha1.Date;
        }

        private void btModificarProyecto_Click(object sender, EventArgs e)
        {
            titulo1 = txtTitulo2.Text;
            descripcion1 = txtDescripcion2.Text;
            horas1 = Convert.ToInt32(txtHoras2.Value);
            fecha1 = dateTimePicker2.Value;
            accion = true;
            Close();

        }

        private void btCancelarModificacion_Click(object sender, EventArgs e)
        {
            Dispose();
        }

        private void redimensionarFondo()
        {
            imagenFondo = this.BackgroundImage;
            Bitmap imagenRedimensioanada = new Bitmap(this.Width, this.Height);

            using (Graphics g = Graphics.FromImage(imagenRedimensioanada))
            {
                g.InterpolationMode = System.Drawing.Drawing2D.InterpolationMode.HighQualityBicubic;
                g.DrawImage(imagenFondo, 0, 0, this.Width, this.Height);
            }

            this.BackgroundImage = imagenRedimensioanada;

        }
    }
}
