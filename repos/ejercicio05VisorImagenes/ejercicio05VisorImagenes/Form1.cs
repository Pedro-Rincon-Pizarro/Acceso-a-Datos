using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ejercicio05VisorImagenes
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btElegir_Click(object sender, EventArgs e)
        {
            openFileDialog1.Title = "Seleccione una imagen";
            openFileDialog1.Filter = "Image Files|*.jpg;*jpeg;*.png;*.gif;*.tif;...";
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;

                pictureBox1.Image = Image.FromFile(openFileDialog1.FileName);
                this.Text = String.Concat("Vidor de imagenes(" + openFileDialog1.FileName + ")");
            }
        }

        private void btSalir_Click(object sender, EventArgs e)
        {
            Dispose();
        }

        private void lbl1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            lbl1.LinkVisited = true;
            System.Diagnostics.Process.Start("Calc");
        }

        private void lbl2_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            lbl2.LinkVisited = true;
            System.Diagnostics.Process.Start("Firefox", "http:\\www.youtube.com");
        }

        private void lbl3_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            lbl3.LinkVisited = true;
            System.Diagnostics.Process.Start("C:\\");
        }
    }
}
