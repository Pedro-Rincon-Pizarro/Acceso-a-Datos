namespace ModernGUI_V3
{
    partial class Form2
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form2));
            this.TxtErrorFecha = new System.Windows.Forms.Label();
            this.txtErrorHoras = new System.Windows.Forms.Label();
            this.txtErrorDescripcion = new System.Windows.Forms.Label();
            this.txtErrorTitulo = new System.Windows.Forms.Label();
            this.dateTimePicker1 = new System.Windows.Forms.DateTimePicker();
            this.txtHoras = new System.Windows.Forms.NumericUpDown();
            this.txtDescripcion = new System.Windows.Forms.TextBox();
            this.btnSalir = new System.Windows.Forms.Button();
            this.btnAlta = new System.Windows.Forms.Button();
            this.txtTitulo = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.lblTitulo = new System.Windows.Forms.Label();
            this.dgvProyectos = new System.Windows.Forms.DataGridView();
            this.Modificar = new System.Windows.Forms.DataGridViewImageColumn();
            this.Eliminar = new System.Windows.Forms.DataGridViewImageColumn();
            this.txtIDEmpresa = new System.Windows.Forms.Label();
            this.comboID = new System.Windows.Forms.ComboBox();
            ((System.ComponentModel.ISupportInitialize)(this.txtHoras)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dgvProyectos)).BeginInit();
            this.SuspendLayout();
            // 
            // TxtErrorFecha
            // 
            this.TxtErrorFecha.AutoSize = true;
            this.TxtErrorFecha.BackColor = System.Drawing.Color.Transparent;
            this.TxtErrorFecha.ForeColor = System.Drawing.Color.Red;
            this.TxtErrorFecha.Location = new System.Drawing.Point(247, 229);
            this.TxtErrorFecha.Name = "TxtErrorFecha";
            this.TxtErrorFecha.Size = new System.Drawing.Size(0, 13);
            this.TxtErrorFecha.TabIndex = 96;
            // 
            // txtErrorHoras
            // 
            this.txtErrorHoras.AutoSize = true;
            this.txtErrorHoras.BackColor = System.Drawing.Color.Transparent;
            this.txtErrorHoras.ForeColor = System.Drawing.Color.Red;
            this.txtErrorHoras.Location = new System.Drawing.Point(247, 169);
            this.txtErrorHoras.Name = "txtErrorHoras";
            this.txtErrorHoras.Size = new System.Drawing.Size(0, 13);
            this.txtErrorHoras.TabIndex = 95;
            // 
            // txtErrorDescripcion
            // 
            this.txtErrorDescripcion.AutoSize = true;
            this.txtErrorDescripcion.BackColor = System.Drawing.Color.Transparent;
            this.txtErrorDescripcion.ForeColor = System.Drawing.Color.Red;
            this.txtErrorDescripcion.Location = new System.Drawing.Point(247, 109);
            this.txtErrorDescripcion.Name = "txtErrorDescripcion";
            this.txtErrorDescripcion.Size = new System.Drawing.Size(0, 13);
            this.txtErrorDescripcion.TabIndex = 94;
            // 
            // txtErrorTitulo
            // 
            this.txtErrorTitulo.AutoSize = true;
            this.txtErrorTitulo.BackColor = System.Drawing.Color.Transparent;
            this.txtErrorTitulo.ForeColor = System.Drawing.Color.Red;
            this.txtErrorTitulo.Location = new System.Drawing.Point(247, 49);
            this.txtErrorTitulo.Name = "txtErrorTitulo";
            this.txtErrorTitulo.Size = new System.Drawing.Size(0, 13);
            this.txtErrorTitulo.TabIndex = 93;
            // 
            // dateTimePicker1
            // 
            this.dateTimePicker1.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.dateTimePicker1.Location = new System.Drawing.Point(247, 242);
            this.dateTimePicker1.Name = "dateTimePicker1";
            this.dateTimePicker1.Size = new System.Drawing.Size(406, 20);
            this.dateTimePicker1.TabIndex = 92;
            this.dateTimePicker1.Value = new System.DateTime(2025, 1, 20, 17, 1, 17, 0);
            // 
            // txtHoras
            // 
            this.txtHoras.Location = new System.Drawing.Point(247, 197);
            this.txtHoras.Name = "txtHoras";
            this.txtHoras.Size = new System.Drawing.Size(406, 20);
            this.txtHoras.TabIndex = 91;
            // 
            // txtDescripcion
            // 
            this.txtDescripcion.Location = new System.Drawing.Point(247, 152);
            this.txtDescripcion.Name = "txtDescripcion";
            this.txtDescripcion.Size = new System.Drawing.Size(406, 20);
            this.txtDescripcion.TabIndex = 90;
            // 
            // btnSalir
            // 
            this.btnSalir.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.btnSalir.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnSalir.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.btnSalir.Location = new System.Drawing.Point(578, 284);
            this.btnSalir.Name = "btnSalir";
            this.btnSalir.Size = new System.Drawing.Size(75, 23);
            this.btnSalir.TabIndex = 89;
            this.btnSalir.Text = "Salir";
            this.btnSalir.UseVisualStyleBackColor = false;
            // 
            // btnAlta
            // 
            this.btnAlta.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.btnAlta.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnAlta.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.btnAlta.Location = new System.Drawing.Point(247, 284);
            this.btnAlta.Name = "btnAlta";
            this.btnAlta.Size = new System.Drawing.Size(75, 23);
            this.btnAlta.TabIndex = 88;
            this.btnAlta.Text = "Alta";
            this.btnAlta.UseVisualStyleBackColor = false;
            // 
            // txtTitulo
            // 
            this.txtTitulo.Location = new System.Drawing.Point(247, 107);
            this.txtTitulo.Name = "txtTitulo";
            this.txtTitulo.Size = new System.Drawing.Size(406, 20);
            this.txtTitulo.TabIndex = 87;
            // 
            // label4
            // 
            this.label4.BackColor = System.Drawing.Color.Transparent;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label4.Location = new System.Drawing.Point(57, 242);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(133, 20);
            this.label4.TabIndex = 86;
            this.label4.Text = "Fecha de Inicio";
            this.label4.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label3
            // 
            this.label3.BackColor = System.Drawing.Color.Transparent;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label3.Location = new System.Drawing.Point(133, 197);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(57, 20);
            this.label3.TabIndex = 85;
            this.label3.Text = "Horas";
            this.label3.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label2
            // 
            this.label2.BackColor = System.Drawing.Color.Transparent;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label2.Location = new System.Drawing.Point(87, 152);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(103, 20);
            this.label2.TabIndex = 84;
            this.label2.Text = "Descripción";
            this.label2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label1
            // 
            this.label1.BackColor = System.Drawing.Color.Transparent;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label1.Location = new System.Drawing.Point(136, 107);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(54, 20);
            this.label1.TabIndex = 83;
            this.label1.Text = "Título";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.BackColor = System.Drawing.Color.Transparent;
            this.lblTitulo.Font = new System.Drawing.Font("Microsoft Sans Serif", 21.75F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Underline))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTitulo.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.lblTitulo.Location = new System.Drawing.Point(241, 9);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(427, 33);
            this.lblTitulo.TabIndex = 82;
            this.lblTitulo.Text = "REGISTRO DE PROYECTOS";
            this.lblTitulo.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // dgvProyectos
            // 
            this.dgvProyectos.BackgroundColor = System.Drawing.SystemColors.ActiveCaption;
            this.dgvProyectos.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvProyectos.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Modificar,
            this.Eliminar});
            this.dgvProyectos.GridColor = System.Drawing.SystemColors.ActiveCaption;
            this.dgvProyectos.Location = new System.Drawing.Point(27, 324);
            this.dgvProyectos.Name = "dgvProyectos";
            this.dgvProyectos.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.dgvProyectos.Size = new System.Drawing.Size(740, 221);
            this.dgvProyectos.TabIndex = 81;
            // 
            // Modificar
            // 
            this.Modificar.HeaderText = "Modificar";
            this.Modificar.Image = ((System.Drawing.Image)(resources.GetObject("Modificar.Image")));
            this.Modificar.Name = "Modificar";
            // 
            // Eliminar
            // 
            this.Eliminar.HeaderText = "Eliminar";
            this.Eliminar.Image = ((System.Drawing.Image)(resources.GetObject("Eliminar.Image")));
            this.Eliminar.Name = "Eliminar";
            // 
            // txtIDEmpresa
            // 
            this.txtIDEmpresa.BackColor = System.Drawing.Color.Transparent;
            this.txtIDEmpresa.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtIDEmpresa.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.txtIDEmpresa.Location = new System.Drawing.Point(91, 62);
            this.txtIDEmpresa.Name = "txtIDEmpresa";
            this.txtIDEmpresa.Size = new System.Drawing.Size(110, 20);
            this.txtIDEmpresa.TabIndex = 98;
            this.txtIDEmpresa.Text = "ID Empresa";
            this.txtIDEmpresa.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // comboID
            // 
            this.comboID.FormattingEnabled = true;
            this.comboID.Location = new System.Drawing.Point(247, 66);
            this.comboID.Name = "comboID";
            this.comboID.Size = new System.Drawing.Size(406, 21);
            this.comboID.TabIndex = 99;
            // 
            // Form2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(899, 680);
            this.Controls.Add(this.comboID);
            this.Controls.Add(this.txtIDEmpresa);
            this.Controls.Add(this.TxtErrorFecha);
            this.Controls.Add(this.txtErrorHoras);
            this.Controls.Add(this.txtErrorDescripcion);
            this.Controls.Add(this.txtErrorTitulo);
            this.Controls.Add(this.dateTimePicker1);
            this.Controls.Add(this.txtHoras);
            this.Controls.Add(this.txtDescripcion);
            this.Controls.Add(this.btnSalir);
            this.Controls.Add(this.btnAlta);
            this.Controls.Add(this.txtTitulo);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.lblTitulo);
            this.Controls.Add(this.dgvProyectos);
            this.Margin = new System.Windows.Forms.Padding(2);
            this.Name = "Form2";
            this.Text = "Form2";
            this.Load += new System.EventHandler(this.Form2_Load);
            ((System.ComponentModel.ISupportInitialize)(this.txtHoras)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dgvProyectos)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label TxtErrorFecha;
        private System.Windows.Forms.Label txtErrorHoras;
        private System.Windows.Forms.Label txtErrorDescripcion;
        private System.Windows.Forms.Label txtErrorTitulo;
        private System.Windows.Forms.DateTimePicker dateTimePicker1;
        private System.Windows.Forms.NumericUpDown txtHoras;
        private System.Windows.Forms.TextBox txtDescripcion;
        private System.Windows.Forms.Button btnSalir;
        private System.Windows.Forms.Button btnAlta;
        private System.Windows.Forms.TextBox txtTitulo;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.DataGridView dgvProyectos;
        private System.Windows.Forms.DataGridViewImageColumn Modificar;
        private System.Windows.Forms.DataGridViewImageColumn Eliminar;
        private System.Windows.Forms.Label txtIDEmpresa;
        private System.Windows.Forms.ComboBox comboID;
    }
}