namespace Ejercicio03FuentesTamStilo
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            groupBox1 = new GroupBox();
            btSubr = new RadioButton();
            btCursiva = new RadioButton();
            btNegrita = new RadioButton();
            groupBox2 = new GroupBox();
            btBrodway = new RadioButton();
            btVerdana = new RadioButton();
            btConsolas = new RadioButton();
            groupBox3 = new GroupBox();
            bt20 = new RadioButton();
            bt16 = new RadioButton();
            bt12 = new RadioButton();
            label1 = new Label();
            txtFinal = new Label();
            groupBox1.SuspendLayout();
            groupBox2.SuspendLayout();
            groupBox3.SuspendLayout();
            SuspendLayout();
            // 
            // groupBox1
            // 
            groupBox1.Controls.Add(btSubr);
            groupBox1.Controls.Add(btCursiva);
            groupBox1.Controls.Add(btNegrita);
            groupBox1.Location = new Point(34, 87);
            groupBox1.Name = "groupBox1";
            groupBox1.Size = new Size(200, 177);
            groupBox1.TabIndex = 0;
            groupBox1.TabStop = false;
            groupBox1.Text = "Estilo";
            // 
            // btSubr
            // 
            btSubr.AutoSize = true;
            btSubr.Location = new Point(23, 111);
            btSubr.Name = "btSubr";
            btSubr.Size = new Size(81, 19);
            btSubr.TabIndex = 2;
            btSubr.TabStop = true;
            btSubr.Text = "Subrayado";
            btSubr.UseVisualStyleBackColor = true;
            btSubr.CheckedChanged += btSubr_CheckedChanged;
            // 
            // btCursiva
            // 
            btCursiva.AutoSize = true;
            btCursiva.Location = new Point(23, 75);
            btCursiva.Name = "btCursiva";
            btCursiva.Size = new Size(64, 19);
            btCursiva.TabIndex = 1;
            btCursiva.TabStop = true;
            btCursiva.Text = "Cursiva";
            btCursiva.UseVisualStyleBackColor = true;
            btCursiva.CheckedChanged += btCursiva_CheckedChanged;
            // 
            // btNegrita
            // 
            btNegrita.AutoSize = true;
            btNegrita.Location = new Point(23, 39);
            btNegrita.Name = "btNegrita";
            btNegrita.Size = new Size(64, 19);
            btNegrita.TabIndex = 0;
            btNegrita.TabStop = true;
            btNegrita.Text = "Negrita";
            btNegrita.UseVisualStyleBackColor = true;
            btNegrita.CheckedChanged += btNegrita_CheckedChanged;
            // 
            // groupBox2
            // 
            groupBox2.Controls.Add(btBrodway);
            groupBox2.Controls.Add(btVerdana);
            groupBox2.Controls.Add(btConsolas);
            groupBox2.Location = new Point(307, 87);
            groupBox2.Name = "groupBox2";
            groupBox2.Size = new Size(200, 177);
            groupBox2.TabIndex = 1;
            groupBox2.TabStop = false;
            groupBox2.Text = "Fuente";
            // 
            // btBrodway
            // 
            btBrodway.AutoSize = true;
            btBrodway.Location = new Point(31, 112);
            btBrodway.Name = "btBrodway";
            btBrodway.Size = new Size(71, 19);
            btBrodway.TabIndex = 2;
            btBrodway.TabStop = true;
            btBrodway.Text = "Brodway";
            btBrodway.UseVisualStyleBackColor = true;
            btBrodway.CheckedChanged += btBrodway_CheckedChanged;
            // 
            // btVerdana
            // 
            btVerdana.AutoSize = true;
            btVerdana.Location = new Point(31, 74);
            btVerdana.Name = "btVerdana";
            btVerdana.Size = new Size(67, 19);
            btVerdana.TabIndex = 1;
            btVerdana.TabStop = true;
            btVerdana.Text = "Verdana";
            btVerdana.UseVisualStyleBackColor = true;
            btVerdana.CheckedChanged += btVerdana_CheckedChanged;
            // 
            // btConsolas
            // 
            btConsolas.AutoSize = true;
            btConsolas.Location = new Point(31, 39);
            btConsolas.Name = "btConsolas";
            btConsolas.Size = new Size(73, 19);
            btConsolas.TabIndex = 0;
            btConsolas.TabStop = true;
            btConsolas.Text = "Consolas";
            btConsolas.UseVisualStyleBackColor = true;
            btConsolas.CheckedChanged += btConsolas_CheckedChanged;
            // 
            // groupBox3
            // 
            groupBox3.Controls.Add(bt20);
            groupBox3.Controls.Add(bt16);
            groupBox3.Controls.Add(bt12);
            groupBox3.Location = new Point(588, 87);
            groupBox3.Name = "groupBox3";
            groupBox3.Size = new Size(200, 177);
            groupBox3.TabIndex = 2;
            groupBox3.TabStop = false;
            groupBox3.Text = "Tamaño";
            // 
            // bt20
            // 
            bt20.AutoSize = true;
            bt20.Location = new Point(26, 112);
            bt20.Name = "bt20";
            bt20.Size = new Size(37, 19);
            bt20.TabIndex = 2;
            bt20.TabStop = true;
            bt20.Text = "20";
            bt20.UseVisualStyleBackColor = true;
            bt20.CheckedChanged += bt20_CheckedChanged;
            // 
            // bt16
            // 
            bt16.AutoSize = true;
            bt16.Location = new Point(26, 74);
            bt16.Name = "bt16";
            bt16.Size = new Size(37, 19);
            bt16.TabIndex = 1;
            bt16.TabStop = true;
            bt16.Text = "16";
            bt16.UseVisualStyleBackColor = true;
            bt16.CheckedChanged += bt16_CheckedChanged;
            // 
            // bt12
            // 
            bt12.AutoSize = true;
            bt12.Location = new Point(26, 41);
            bt12.Name = "bt12";
            bt12.Size = new Size(37, 19);
            bt12.TabIndex = 0;
            bt12.TabStop = true;
            bt12.Text = "12";
            bt12.UseVisualStyleBackColor = true;
            bt12.CheckedChanged += bt12_CheckedChanged;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(111, 300);
            label1.Name = "label1";
            label1.Size = new Size(59, 15);
            label1.TabIndex = 3;
            label1.Text = "Resultado";
            // 
            // txtFinal
            // 
            txtFinal.AutoSize = true;
            txtFinal.Location = new Point(139, 347);
            txtFinal.Name = "txtFinal";
            txtFinal.Size = new Size(156, 15);
            txtFinal.TabIndex = 4;
            txtFinal.Text = "Buenos dias Clase de DAM 2";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(txtFinal);
            Controls.Add(label1);
            Controls.Add(groupBox3);
            Controls.Add(groupBox2);
            Controls.Add(groupBox1);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            groupBox1.ResumeLayout(false);
            groupBox1.PerformLayout();
            groupBox2.ResumeLayout(false);
            groupBox2.PerformLayout();
            groupBox3.ResumeLayout(false);
            groupBox3.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private GroupBox groupBox1;
        private RadioButton btSubr;
        private RadioButton btCursiva;
        private RadioButton btNegrita;
        private GroupBox groupBox2;
        private RadioButton btBrodway;
        private RadioButton btVerdana;
        private RadioButton btConsolas;
        private GroupBox groupBox3;
        private RadioButton bt20;
        private RadioButton bt16;
        private RadioButton bt12;
        private Label label1;
        private Label txtFinal;
    }
}
