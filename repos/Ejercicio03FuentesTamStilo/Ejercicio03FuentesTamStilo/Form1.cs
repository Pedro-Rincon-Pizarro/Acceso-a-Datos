namespace Ejercicio03FuentesTamStilo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void btNegrita_CheckedChanged(object sender, EventArgs e)
        {
 
            if(btNegrita.Checked)
            {
                txtFinal.Font = new Font(txtFinal.Font, FontStyle.Bold);
            }
            
        }

        private void btCursiva_CheckedChanged(object sender, EventArgs e)
        {
            if(btCursiva.Checked)
            {
                txtFinal.Font = new Font(txtFinal.Font, FontStyle.Italic);
            }
        }

        private void btSubr_CheckedChanged(object sender, EventArgs e)
        {
            if(btSubr.Checked)
            {
                txtFinal.Font = new Font(txtFinal.Font, FontStyle.Underline);
            }
        }

        private void btConsolas_CheckedChanged(object sender, EventArgs e)
        {
            if(btConsolas.Checked)
            {
                txtFinal.Font = new Font("Consolas", txtFinal.Font.Size, txtFinal.Font.Style);
            }
        }

        private void btVerdana_CheckedChanged(object sender, EventArgs e)
        {
            if(btVerdana.Checked)
            {
                txtFinal.Font = new Font("Verdana", txtFinal.Font.Size, txtFinal.Font.Style);
            }
        }

        private void btBrodway_CheckedChanged(object sender, EventArgs e)
        {
            if(btBrodway.Checked)
            {
                txtFinal.Font = new Font("Brodway", txtFinal.Font.Size, txtFinal.Font.Style);
            }
        }

        private void bt12_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void bt16_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void bt20_CheckedChanged(object sender, EventArgs e)
        {

        }
    }
}
