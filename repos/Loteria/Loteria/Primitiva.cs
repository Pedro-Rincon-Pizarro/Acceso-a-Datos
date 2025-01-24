using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;


namespace Loteria
{
    public partial class Primitiva : Form
    {
        int contador = 0;
        public Primitiva()
        {
            InitializeComponent();
            
            for (int i = 1; i < 50; i++)
            {
                checkedListBox1.Items.Add(i.ToString());
            }

        }


        private void button1_Click(object sender, EventArgs e)
        {
            if(checkedListBox1.CheckedItems.Count < 6)
            {
                MessageBox.Show("Hay que seleccionar 6 numeros.");
            }
            else if(checkedListBox1.CheckedItems.Count == 6)
            {
                int [] numerosAleatorios = new int[6];
                


                for (int i = 0;i < numerosAleatorios.Length; i++)
                {
                    numerosAleatorios[i] = int.Parse(checkedListBox1.CheckedIndices[i].ToString());

                }

                int [] numerosGanadores = new int[6];
                Random rd = new Random();
                int num = 0;

                while(num < 6)
                {
                    int numero = rd.Next(1, 50);
                    if(!numerosGanadores.Contains(numero))
                    {
                        numerosGanadores[num] = numero;
                        num++;
                    }
                }

                Array.Sort(numerosGanadores);
                txt1.Text = numerosGanadores[0].ToString();
                txt2.Text = numerosGanadores[1].ToString();
                txt3.Text = numerosGanadores[2].ToString();
                txt4.Text = numerosGanadores[3].ToString();
                txt5.Text = numerosGanadores[4].ToString();
                txt6.Text = numerosGanadores[5].ToString();

                int aciertos = 0;

                foreach(int numero in numerosAleatorios)
                {
                    if(numerosGanadores.Contains(numero))
                    {
                        aciertos++;
                        break;
                    }
                }
                txtResultado.Text = aciertos.ToString();


            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            txt1.Clear();
            txt2.Clear();
            txt3.Clear();
            txt4.Clear();
            txt5.Clear();
            txt6.Clear();
            txtResultado.Clear();
            for (int i = 0; i < checkedListBox1.Items.Count; i++)
            {
                checkedListBox1.SetItemChecked(i, false);
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void checkedListBox1_ItemCheck(object sender, ItemCheckEventArgs e)
        {
            if(e.NewValue == CheckState.Checked && checkedListBox1.CheckedItems.Count >= 6)
            {
                e.NewValue = CheckState.Unchecked;
                MessageBox.Show("No puedes seleccionar mas de 6 numeros.");
            }
            
        }
    }
}
