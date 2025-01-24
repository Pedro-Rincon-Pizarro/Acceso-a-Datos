using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ahorcado
{
    
    public partial class Form1 : Form
    {
        string palabra_elegida;
        string[] palabras = new String[10];
        int aleatorio;
        int num_letras;
        int util_pal = 7;
        int fallos;
        public Form1()
        {
            InitializeComponent();
            palabras[0] = "mondongo";
            palabras[1] = "panchito";
            palabras[2] = "mongolin";
            palabras[3] = "pepinazo";
            palabras[4] = "gitanazo";
            palabras[5] = "bananero";
            palabras[6] = "machango";
            palabras[7] = "payoponi";
            palabras[8] = "parguela";
            palabras[9] = "zopencos";

            vaciarPanel();
            

        }

        private void vaciarPanel()
        {
            pictureBox1.Visible = false;
            pictureBox2.Visible = false;
            pictureBox3.Visible = false;
            pictureBox4.Visible = false;
            pictureBox5.Visible = false;
            pictureBox6.Visible = false;
            pictureBox7.Visible = false;
            pictureBox8.Visible = false;
            pictureBox9.Visible = false;
            pictureBox10.Visible = false;

            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            textBox4.Text = "";
            textBox5.Text = "";
            textBox6.Text = "";
            textBox7.Text = "";
            textBox8.Text = "";
        }

        private void btInicio_Click(object sender, EventArgs e)
        {
            vaciarPanel();
            Random rd = new Random();
            palabra_elegida = palabras[rd.Next(palabras.Length)];
        }

        private void btQ_Click(object sender, EventArgs e)
        {

        }

        private void btW_Click(object sender, EventArgs e)
        {

        }

        private void btE_Click(object sender, EventArgs e)
        {

        }

        private void btR_Click(object sender, EventArgs e)
        {

        }

        private void btT_Click(object sender, EventArgs e)
        {

        }

        private void btY_Click(object sender, EventArgs e)
        {

        }

        private void btU_Click(object sender, EventArgs e)
        {

        }

        private void btI_Click(object sender, EventArgs e)
        {

        }

        private void btO_Click(object sender, EventArgs e)
        {

        }

        private void btP_Click(object sender, EventArgs e)
        {

        }

        private void btA_Click(object sender, EventArgs e)
        {

        }

        private void btS_Click(object sender, EventArgs e)
        {

        }

        private void btD_Click(object sender, EventArgs e)
        {

        }

        private void btF_Click(object sender, EventArgs e)
        {

        }

        private void btG_Click(object sender, EventArgs e)
        {

        }

        private void btH_Click(object sender, EventArgs e)
        {

        }

        private void btJ_Click(object sender, EventArgs e)
        {

        }

        private void btK_Click(object sender, EventArgs e)
        {

        }

        private void btL_Click(object sender, EventArgs e)
        {

        }

        private void btÑ_Click(object sender, EventArgs e)
        {

        }

        private void btZ_Click(object sender, EventArgs e)
        {

        }

        private void btX_Click(object sender, EventArgs e)
        {

        }

        private void btC_Click(object sender, EventArgs e)
        {

        }

        private void btV_Click(object sender, EventArgs e)
        {

        }

        private void btB_Click(object sender, EventArgs e)
        {

        }

        private void btN_Click(object sender, EventArgs e)
        {

        }

        private void btM_Click(object sender, EventArgs e)
        {

        }
    }
}
