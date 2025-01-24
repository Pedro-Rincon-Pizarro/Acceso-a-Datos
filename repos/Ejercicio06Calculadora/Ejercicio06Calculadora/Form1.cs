using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculadora
{
    public partial class Form1 : Form
    {
        string operador;
        double num1, num2, memoria;
        
        public Form1()
        {
            InitializeComponent();
        }

        private void Botones_Click(object sender, EventArgs e)
        {
            Button btn=(Button)sender;
            txtResultado.Text += btn.Text;
        }

        private void BtnSuma_Click(object sender, EventArgs e)
        {

            operador = ((Button)sender).Text;
            num1 = double.Parse(txtResultado.Text);
            txtResultado.Clear();
        }

        private void BtnIgual_Click(object sender, EventArgs e)
        {
            
                num2 = double.Parse(txtResultado.Text);
                double resultado = 0;
                switch (operador)
                {
                    case "+":
                        resultado = num1 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "*":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0)
                        {
                            resultado = num1 / num2;
                        }
                        else
                        {
                            txtResultado.Text = "Error";
                            return;
                        }
                        break;
                }
                txtResultado.Text = resultado.ToString();
            
        }

        private void BtnResta_Click(object sender, EventArgs e)
        {
            operador = ((Button)sender).Text;
            num1 = double.Parse(txtResultado.Text);
            txtResultado.Clear();
        }

        private void BtnMul_Click_1(object sender, EventArgs e)
        {
            operador = ((Button)sender).Text;
            num1 = double.Parse(txtResultado.Text);
            txtResultado.Clear();
        }

        private void BtnMC_Click(object sender, EventArgs e)
        {
            memoria = 0; 
        }

        private void BtnM_Click(object sender, EventArgs e)
        {
            memoria +=  double.Parse(txtResultado.Text);
            txtResultado.Clear();
        }

        private void BtnC_Click(object sender, EventArgs e)
        {
            txtResultado.Text = "";
            num1 = 0;
            operador = "";
        }

      

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void BtnMS_Click(object sender, EventArgs e)
        {
            memoria = double.Parse(txtResultado.Text);
            txtResultado.Clear();
        }

        private void BtnMR_Click(object sender, EventArgs e)
        {
            
            String convertir = memoria.ToString();
            txtResultado.Text = convertir;
                
        }

        private void BtnCE_Click(object sender, EventArgs e)
        {
            txtResultado.Text = "";
        }

        private void button11_Click(object sender, EventArgs e)
        {
            double x = double.Parse(txtResultado.Text);
            x = 1 / x; 
            txtResultado .Text = x.ToString();
        }

        private void BtnDiv_Click(object sender, EventArgs e)
        {
            operador = ((Button)sender).Text;
            num1 = double.Parse(txtResultado.Text);
            txtResultado.Clear();
        }

    }
}
