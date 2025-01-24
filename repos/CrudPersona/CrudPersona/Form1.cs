using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CrudPersona
{
    public partial class Form1 : Form
    {
        List<Empleado> empleadoList;
        public Form1()
        {
            InitializeComponent();
            empleadoList = new List<Empleado>();
            Empleado emp1 = new Empleado("Ana", 12000.00, "oficina");
            Empleado emp2 = new Empleado("Juan", 13000.00, "director");
            Empleado emp3 = new Empleado("Alex", 10000.00, "jefe");
            empleadoList.Add(emp1);
            empleadoList.Add(emp2);
            empleadoList.Add(emp3);
            ActualizarLista();

        }

        private void ActualizarLista()
        {
            dataGridView1.DataSource = null;
            dataGridView1.DataSource = empleadoList;
            dataGridView1.ClearSelection();
        }


        private void btAlta_Click(object sender, EventArgs e)
        {
            Empleado emp = new Empleado();
            emp.Nombre = txtNombre.Text;
            emp.Salario = double.Parse(txtSalario.Text);
            emp.Cargo = txtCargo.Text;

            empleadoList.Add (emp);
            ActualizarLista ();
            limpiarCampos();
        }

        private void limpiarCampos()
        {
            txtNombre.Text = "";
            txtSalario.Value = 0;
            txtCargo.Text = "";
        }

        private void btModificar_Click(object sender, EventArgs e)
        {
            Empleado emp2 = new Empleado();
            foreach(Empleado emp in empleadoList)
            {
                if(emp.Nombre == txtNombre.Text)
                {
                    emp2.Nombre = txtNombre.Text;
                    emp2.Salario = (double)txtSalario.Value;
                    emp2.Cargo = txtCargo.Text;

                    emp.Salario = (double)txtSalario.Value;
                    emp.Cargo = txtCargo.Text;
                }
            }
            emp2.Nombre = txtNombre.Text;
            emp2.Salario = double.Parse(txtSalario.Text);
            emp2.Cargo = txtCargo.Text;

            
            ActualizarLista();
            limpiarCampos();
        }

        private void btEliminar_Click(object sender, EventArgs e)
        {
            try
            {
                int posicion;
                posicion = dataGridView1.SelectedRows[0].Index;

                if (posicion != -1)
                {
                    empleadoList.RemoveAt(posicion);
                    ActualizarLista();
                }
                else
                {
                    MessageBox.Show("Error");
                }
            }
            catch
            {
                MessageBox.Show("Ha habido un error", "Error 2");
            }
        }

        private void btSalir_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {

            if(e.RowIndex != -1)
            {
                DataGridViewRow dgvRow = dataGridView1.Rows[e.RowIndex];
                txtNombre.Text = dgvRow.Cells[0].Value.ToString();
                txtCargo.Text = dgvRow.Cells[1].Value.ToString();
                txtSalario.Value = (decimal)Convert.ToDouble(dgvRow.Cells[2].Value);
            }
        }
    }

}
