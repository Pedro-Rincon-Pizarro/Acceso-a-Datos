using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ejercicio04MensageBox
{
    public partial class Form1 : Form
    {
        private MessageBoxButtons tipodeBoton = MessageBoxButtons.YesNo;
        private MessageBoxIcon tipodeIcono = MessageBoxIcon.Information;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
        private void grupo1_CheckedChanged(Object sender, EventArgs e)
        {

        }
        private void grupo2_CheckedChanged(Object sender, EventArgs e)
        {

        }

        private void tipodeBoton_CheckedChanged(object sender, EventArgs e)
        {
            if (sender == btYesNo) tipodeBoton = MessageBoxButtons.YesNo;
            if (sender == btOk) tipodeBoton = MessageBoxButtons.OK;
            if (sender == btOkCancel) tipodeBoton = MessageBoxButtons.OKCancel;
            if (sender == btYesNoCancel) tipodeBoton = MessageBoxButtons.YesNoCancel;
            if (sender == btRetryCancel) tipodeBoton = MessageBoxButtons.RetryCancel;
            if (sender == btRetryCancelAbort) tipodeBoton = MessageBoxButtons.AbortRetryIgnore;
        }
        private void tipodeIcono_CheckedChanged(object sender, EventArgs e)
        {
            if (sender == btInformacion) tipodeIcono = MessageBoxIcon.Information;
            if (sender == btExclamacion) tipodeIcono = MessageBoxIcon.Exclamation;
            if (sender == btQuestion) tipodeIcono = MessageBoxIcon.Question;
            if (sender == btError) tipodeIcono = MessageBoxIcon.Error;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            DialogResult result;
            result = MessageBox.Show("Mensaje", "Titulo de la Ventana", tipodeBoton, tipodeIcono);
            switch(result)
            {
                case DialogResult.OK:
                    lblResultado.Text = "Seleccionó Ok";
                    break;

                case DialogResult.Cancel:
                    lblResultado.Text = "Seleccionó Cancel";
                    break;

                case DialogResult.Yes:
                    lblResultado.Text = "Seleccionó Yes";
                    break;

                case DialogResult.No:
                    lblResultado.Text = "Seleccionó No";
                    break;

                case DialogResult.Ignore:
                    lblResultado.Text = "Seleccionó Ignore";
                    break;

                case DialogResult.Abort:
                    lblResultado.Text = "Seleccionó Abort";
                    break;

                case DialogResult.Retry:
                    lblResultado.Text = "Seleccionó Retry";
                    break;
            }
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            tipodeBoton = MessageBoxButtons.OK;
        }

        private void btRetryCancelAbort_CheckedChanged(object sender, EventArgs e)
        {
            tipodeBoton = MessageBoxButtons.AbortRetryIgnore;
        }

        private void radioButton7_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void btExclamacion_CheckedChanged(object sender, EventArgs e)
        {

        }
    }
}
