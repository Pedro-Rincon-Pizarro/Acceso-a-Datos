using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _09ListBox
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            for (int i = int.Parse(textBox1.Text); i < int.Parse(textBox2.Text); i++)
            {
                
                listBox1.Items.Add(i.ToString());
                if(ch.Items.Co)
                ch.Items.Add(i.ToString());
            }
        }
    }
}
