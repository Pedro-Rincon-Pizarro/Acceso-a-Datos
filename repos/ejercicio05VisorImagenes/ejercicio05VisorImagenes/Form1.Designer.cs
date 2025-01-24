namespace ejercicio05VisorImagenes
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.btElegir = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.btSalir = new System.Windows.Forms.Button();
            this.lbl1 = new System.Windows.Forms.LinkLabel();
            this.lbl2 = new System.Windows.Forms.LinkLabel();
            this.lbl3 = new System.Windows.Forms.LinkLabel();
            this.openFileDialog1 = new System.Windows.Forms.OpenFileDialog();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // btElegir
            // 
            this.btElegir.Location = new System.Drawing.Point(765, 61);
            this.btElegir.Name = "btElegir";
            this.btElegir.Size = new System.Drawing.Size(75, 23);
            this.btElegir.TabIndex = 1;
            this.btElegir.Text = "Elegir";
            this.btElegir.UseVisualStyleBackColor = true;
            this.btElegir.Click += new System.EventHandler(this.btElegir_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.pictureBox1.Location = new System.Drawing.Point(12, 12);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(718, 493);
            this.pictureBox1.TabIndex = 2;
            this.pictureBox1.TabStop = false;
            // 
            // btSalir
            // 
            this.btSalir.Location = new System.Drawing.Point(765, 174);
            this.btSalir.Name = "btSalir";
            this.btSalir.Size = new System.Drawing.Size(75, 23);
            this.btSalir.TabIndex = 3;
            this.btSalir.Text = "Salir";
            this.btSalir.UseVisualStyleBackColor = true;
            this.btSalir.Click += new System.EventHandler(this.btSalir_Click);
            // 
            // lbl1
            // 
            this.lbl1.AutoSize = true;
            this.lbl1.Location = new System.Drawing.Point(762, 247);
            this.lbl1.Name = "lbl1";
            this.lbl1.Size = new System.Drawing.Size(87, 13);
            this.lbl1.TabIndex = 4;
            this.lbl1.TabStop = true;
            this.lbl1.Text = "Abrir Calculadora";
            this.lbl1.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.lbl1_LinkClicked);
            // 
            // lbl2
            // 
            this.lbl2.AutoSize = true;
            this.lbl2.Location = new System.Drawing.Point(762, 327);
            this.lbl2.Name = "lbl2";
            this.lbl2.Size = new System.Drawing.Size(95, 13);
            this.lbl2.TabIndex = 5;
            this.lbl2.TabStop = true;
            this.lbl2.Text = "www.youtube.com";
            this.lbl2.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.lbl2_LinkClicked);
            // 
            // lbl3
            // 
            this.lbl3.AutoSize = true;
            this.lbl3.Location = new System.Drawing.Point(766, 408);
            this.lbl3.Name = "lbl3";
            this.lbl3.Size = new System.Drawing.Size(91, 13);
            this.lbl3.TabIndex = 6;
            this.lbl3.TabStop = true;
            this.lbl3.Text = "Explorar disco C:\\";
            this.lbl3.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.lbl3_LinkClicked);
            // 
            // openFileDialog1
            // 
            this.openFileDialog1.FileName = "openFileDialog1";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(881, 517);
            this.Controls.Add(this.lbl3);
            this.Controls.Add(this.lbl2);
            this.Controls.Add(this.lbl1);
            this.Controls.Add(this.btSalir);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.btElegir);
            this.Name = "Form1";
            this.Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btElegir;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Button btSalir;
        private System.Windows.Forms.LinkLabel lbl1;
        private System.Windows.Forms.LinkLabel lbl2;
        private System.Windows.Forms.LinkLabel lbl3;
        private System.Windows.Forms.OpenFileDialog openFileDialog1;
    }
}

