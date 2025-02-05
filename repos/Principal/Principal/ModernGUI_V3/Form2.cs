using ModernGUI_V3.dao;
using ModernGUI_V3.modelo;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Net.Mime.MediaTypeNames;

namespace ModernGUI_V3
{
    public partial class Form2 : Form
    {
        private Empresa emp;
        private EmpresaDao EmpresaDao;
        public int id;
        static List<Proyecto> proyectos = new List<Proyecto>();
        ProyectoDao proyectoDao = new ProyectoDao();
        Image imagenFondo;
        Commun mCommun;
        public Form2()
        {
            InitializeComponent();
            mCommun = new Commun();
            cargarListaProyectos();
            actualizarLista();
            //redimensionarFondo();
            DGVDiseno.Formato(dgvProyectos, 1);
            
        }

        private void btnAlta_Click(object sender, EventArgs e)
        {
            if (txtTitulo.Text.Trim().Length <= 0)
            {
                txtErrorTitulo.Text = "Error. El titulo no puede estar vacio.";
                return;
            }
            if (txtDescripcion.Text.Trim().Length <= 0)
            {
                txtErrorDescripcion.Text = "Error. La descripción no puede estar vacia.";
                return;
            }
            if (txtHoras.Value == 0)
            {
                txtErrorHoras.Text = "Error. Las horas deben ser superiores a 0.";
                return;
            }
            if (dateTimePicker1.Value < DateTime.Today)
            {
                TxtErrorFecha.Text = "Error. La fecha debe ser superior a la actual.";
                return;
            }

            int horasTemp = (int)txtHoras.Value;
            Proyecto p = new Proyecto(txtTitulo.Text, txtDescripcion.Text, horasTemp, dateTimePicker1.Value.Date);
            proyectos.Add(p);
            if (proyectoDao.agregarProyecto(p) != 0)
            {
                MessageBox.Show("Proyecto agregado correctamente.");
                cargarListaProyectos();

            }
            actualizarLista();

        }

        private void cargarListaProyectos(string filtro = "")
        {
            dgvProyectos.DataSource = null;
            proyectos.Clear();
            dgvProyectos.Refresh();
            proyectos = proyectoDao.consultarProyectos(filtro);
            dgvProyectos.DataSource = proyectos;


        }

        private void actualizarLista()
        {
            dgvProyectos.DataSource = null;
            dgvProyectos.DataSource = proyectos;
            dgvProyectos.Columns["Id_proyecto"].DisplayIndex = 0;
            dgvProyectos.Columns["Id_proyecto"].ReadOnly = true;
            dgvProyectos.Columns["titulo"].DisplayIndex = 1;
            dgvProyectos.Columns["titulo"].ReadOnly = true;
            dgvProyectos.Columns["descripcion"].DisplayIndex = 2;
            dgvProyectos.Columns["descripcion"].ReadOnly = true;
            dgvProyectos.Columns["horas"].DisplayIndex = 3;
            dgvProyectos.Columns["horas"].ReadOnly = true;
            dgvProyectos.Columns["fecha_inicio"].DisplayIndex = 4;
            dgvProyectos.Columns["fecha_inicio"].ReadOnly = true;
            dgvProyectos.Columns["Modificar"].DisplayIndex = 5;
            dgvProyectos.Columns["Eliminar"].DisplayIndex = 6;

            txtTitulo.Text = "";
            txtErrorTitulo.Text = "";
            txtDescripcion.Text = "";
            txtErrorDescripcion.Text = "";
            txtHoras.Value = 0;
            txtErrorHoras.Text = "";
            dateTimePicker1.Value = DateTime.Today;
            TxtErrorFecha.Text = "";


        }

        private void btnSalir_Click(object sender, DataGridViewCellEventArgs e)
        {
            Dispose();
        }

        private void dgvLibros_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            if (dgvProyectos.Columns[e.ColumnIndex].Name == "Modificar")
            {
                Form3 editorProyecto = new Form3();
                DataGridViewRow dgvr = dgvProyectos.Rows[e.RowIndex];

                //editorProyecto.titulo1 = dgvr.Cells[3].Value.ToString();
                //editorProyecto.descripcion1 = dgvr.Cells[4].Value.ToString();
                //editorProyecto.horas1 = Convert.ToInt32(dgvr.Cells[5].Value);
                //editorProyecto.fecha1 = Convert.ToDateTime(dgvr.Cells[6].Value.ToString());
                //editorProyecto.ShowDialog();

                //if (editorProyecto.accion)
                //{
                //    int posicion = e.RowIndex;
                //    if (posicion != -1)
                //    {

                //        proyectoDao.modificarProyecto(proyectos[posicion]);
                //        cargarListaProyectos();
                //        actualizarLista();
                //    }
                //    else
                //    {
                //        MessageBox.Show("No se puede modificar");
                //    }
                //}
            }

            if (dgvProyectos.Columns[e.ColumnIndex].Name == "Eliminar")
            {

                DataGridViewRow dgvr = dgvProyectos.Rows[e.RowIndex];
                int pos = e.RowIndex;


                DialogResult = MessageBox.Show("¿Deseas eliminar el Proyecto?", "Eliminar", MessageBoxButtons.OKCancel);
                if (DialogResult == DialogResult.OK)
                {
                    if (proyectoDao.eliminarProducto(proyectos[pos].Id_proyecto) != -1)
                    {
                        MessageBox.Show("Proyecto eliminado con exito.");
                        cargarListaProyectos();
                        actualizarLista();
                    }
                    else
                    {
                        MessageBox.Show("Error al eliminar.");
                    }

                }
            }
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            EmpresaDao cDAO = new EmpresaDao();
            List<String> lcat;
            lcat = cDAO.consultarEmpresasCbo();
            comboID.DataSource = lcat;
        }

        //private void redimensionarFondo()
        //{
        //    imagenFondo = this.BackgroundImage;
        //    Bitmap imagenRedimensioanada = new Bitmap(this.Width, this.Height);

        //    using (Graphics g = Graphics.FromImage(imagenRedimensioanada))
        //    {
        //        g.InterpolationMode = System.Drawing.Drawing2D.InterpolationMode.HighQualityBicubic;
        //        g.DrawImage(imagenFondo, 0, 0, this.Width, this.Height);
        //    }

        //    this.BackgroundImage = imagenRedimensioanada;

        //}
    }
}
