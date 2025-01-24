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
    public partial class Form1 : Form
    {
        List<Libro> listaLibros = new List<Libro>();
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

            Libro l1 = new Libro(1, "EL libro troll del rubius", "Ciencias", "Ruben Doblas", "Decimosexta");
            Libro l2 = new Libro(2, "Asi es la puta vida", "Letras", "Jorge Salvaje", "mil o mas");
            listaLibros.Add(l1);
            listaLibros.Add(l2);

            actualizarLista();

            dataGridView1.Columns["Codigo"].DisplayIndex = 0;
            dataGridView1.Columns["Titulo"].DisplayIndex = 1;
            dataGridView1.Columns["Materia"].DisplayIndex = 2;
            dataGridView1.Columns["Autor"].DisplayIndex = 3;
            dataGridView1.Columns["Edicion"].DisplayIndex = 4;
            dataGridView1.Columns["Modificar"].DisplayIndex = 5;
            dataGridView1.Columns["Eliminar"].DisplayIndex = 6;

            DgvDisenio.Formato(dataGridView1, 1);
        }

        private void actualizarLista()
        {
            dataGridView1.DataSource = null;

            dataGridView1.DataSource = listaLibros;

            dataGridView1.ClearSelection();
        }

        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            if (dataGridView1.Columns[e.ColumnIndex].Name == "Modificar")
            {
                DetalleLibro detLibro = new DetalleLibro();
                DataGridViewRow row = dataGridView1.Rows[e.RowIndex];

                detLibro.codigo = Convert.ToInt32(row.Cells[2].Value);
                detLibro.titulo = row.Cells[3].Value.ToString();
                detLibro.materia = row.Cells[4].Value.ToString();
                detLibro.autor = row.Cells[5].Value.ToString();
                detLibro.edicion = row.Cells[6].Value.ToString();
                detLibro.ShowDialog();

                if(detLibro.accion)
                {
                    int posicion = dataGridView1.SelectedRows[0].Index;
                    if(posicion != -1)
                    {
                        listaLibros[posicion].Codigo = detLibro.codigo;
                        listaLibros[posicion].Titulo = detLibro.titulo;
                        listaLibros[posicion].Materia = detLibro.materia;
                        listaLibros[posicion].Autor = detLibro.autor;
                        listaLibros[posicion].Edicion = detLibro.edicion;

                        actualizarLista();
                    }
                }
            }

            if(dataGridView1.Columns[e.ColumnIndex].Name == "Eliminar")
            {
                int posicion = dataGridView1.SelectedRows[0].Index;
                if (posicion != -1)
                {
                    DialogResult result;
                    result = MessageBox.Show("¿Seguro que quieres eliminar el Libro?", "Elimianr", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
                    switch (result)
                    {
                        case DialogResult.Yes:
                            listaLibros.RemoveAt(posicion);
                            actualizarLista();
                            break;

                        case DialogResult.No:
                            
                            break;
                    }
                }
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(comboBox1.Text != null && comboBox1.Text != null && comboBox1.SelectedIndex != -1 && textBox3.Text != null && textBox4.Text != null)
            {
                Libro libro = new Libro();
                libro.Codigo = Convert.ToInt32(textBox1.Text);
                libro.Titulo = textBox2.Text;
                libro.Materia = comboBox1.SelectedItem.ToString();
                libro.Autor = textBox3.Text;
                libro.Edicion = textBox4.Text;

                listaLibros.Add(libro);
                actualizarLista();
                limpiarCampos();
            }
        }

        private void limpiarCampos()
        {
            textBox1.Clear();
            textBox2.Clear();
            comboBox1.SelectedIndex = -1;
            textBox3.Clear();
            textBox4.Clear();
        }
    }
}
