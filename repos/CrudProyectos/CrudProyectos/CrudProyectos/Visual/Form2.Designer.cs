namespace CrudProyectos
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
            this.dateTimePicker2 = new System.Windows.Forms.DateTimePicker();
            this.txtHoras2 = new System.Windows.Forms.NumericUpDown();
            this.txtDescripcion2 = new System.Windows.Forms.TextBox();
            this.txtTitulo2 = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.lblTitulo = new System.Windows.Forms.Label();
            this.btModificarProyecto = new System.Windows.Forms.Button();
            this.btCancelarModificacion = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.txtHoras2)).BeginInit();
            this.SuspendLayout();
            // 
            // TxtErrorFecha
            // 
            this.TxtErrorFecha.AutoSize = true;
            this.TxtErrorFecha.BackColor = System.Drawing.SystemColors.Control;
            this.TxtErrorFecha.ForeColor = System.Drawing.Color.Red;
            this.TxtErrorFecha.Location = new System.Drawing.Point(230, 300);
            this.TxtErrorFecha.Name = "TxtErrorFecha";
            this.TxtErrorFecha.Size = new System.Drawing.Size(0, 13);
            this.TxtErrorFecha.TabIndex = 47;
            // 
            // txtErrorHoras
            // 
            this.txtErrorHoras.AutoSize = true;
            this.txtErrorHoras.BackColor = System.Drawing.SystemColors.Control;
            this.txtErrorHoras.ForeColor = System.Drawing.Color.Red;
            this.txtErrorHoras.Location = new System.Drawing.Point(230, 240);
            this.txtErrorHoras.Name = "txtErrorHoras";
            this.txtErrorHoras.Size = new System.Drawing.Size(0, 13);
            this.txtErrorHoras.TabIndex = 46;
            // 
            // txtErrorDescripcion
            // 
            this.txtErrorDescripcion.AutoSize = true;
            this.txtErrorDescripcion.BackColor = System.Drawing.SystemColors.Control;
            this.txtErrorDescripcion.ForeColor = System.Drawing.Color.Red;
            this.txtErrorDescripcion.Location = new System.Drawing.Point(230, 180);
            this.txtErrorDescripcion.Name = "txtErrorDescripcion";
            this.txtErrorDescripcion.Size = new System.Drawing.Size(0, 13);
            this.txtErrorDescripcion.TabIndex = 45;
            // 
            // txtErrorTitulo
            // 
            this.txtErrorTitulo.AutoSize = true;
            this.txtErrorTitulo.BackColor = System.Drawing.SystemColors.Control;
            this.txtErrorTitulo.ForeColor = System.Drawing.Color.Red;
            this.txtErrorTitulo.Location = new System.Drawing.Point(230, 120);
            this.txtErrorTitulo.Name = "txtErrorTitulo";
            this.txtErrorTitulo.Size = new System.Drawing.Size(0, 13);
            this.txtErrorTitulo.TabIndex = 44;
            // 
            // dateTimePicker2
            // 
            this.dateTimePicker2.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.dateTimePicker2.Location = new System.Drawing.Point(230, 277);
            this.dateTimePicker2.Name = "dateTimePicker2";
            this.dateTimePicker2.Size = new System.Drawing.Size(406, 20);
            this.dateTimePicker2.TabIndex = 43;
            this.dateTimePicker2.Value = new System.DateTime(2025, 1, 20, 17, 1, 17, 0);
            // 
            // txtHoras2
            // 
            this.txtHoras2.Location = new System.Drawing.Point(230, 217);
            this.txtHoras2.Name = "txtHoras2";
            this.txtHoras2.Size = new System.Drawing.Size(406, 20);
            this.txtHoras2.TabIndex = 42;
            // 
            // txtDescripcion2
            // 
            this.txtDescripcion2.Location = new System.Drawing.Point(230, 157);
            this.txtDescripcion2.Name = "txtDescripcion2";
            this.txtDescripcion2.Size = new System.Drawing.Size(406, 20);
            this.txtDescripcion2.TabIndex = 41;
            // 
            // txtTitulo2
            // 
            this.txtTitulo2.Location = new System.Drawing.Point(230, 97);
            this.txtTitulo2.Name = "txtTitulo2";
            this.txtTitulo2.Size = new System.Drawing.Size(406, 20);
            this.txtTitulo2.TabIndex = 40;
            // 
            // label4
            // 
            this.label4.BackColor = System.Drawing.Color.Transparent;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label4.Location = new System.Drawing.Point(40, 277);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(133, 20);
            this.label4.TabIndex = 39;
            this.label4.Text = "Fecha de Inicio";
            this.label4.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label3
            // 
            this.label3.BackColor = System.Drawing.Color.Transparent;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label3.Location = new System.Drawing.Point(115, 217);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(58, 20);
            this.label3.TabIndex = 38;
            this.label3.Text = "Horas";
            this.label3.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label2
            // 
            this.label2.BackColor = System.Drawing.Color.Transparent;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label2.Location = new System.Drawing.Point(69, 157);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(104, 20);
            this.label2.TabIndex = 37;
            this.label2.Text = "Descripción";
            this.label2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label1
            // 
            this.label1.BackColor = System.Drawing.Color.Transparent;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label1.Location = new System.Drawing.Point(119, 97);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(54, 20);
            this.label1.TabIndex = 36;
            this.label1.Text = "Título";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblTitulo
            // 
            this.lblTitulo.BackColor = System.Drawing.Color.Transparent;
            this.lblTitulo.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTitulo.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.lblTitulo.Location = new System.Drawing.Point(249, 20);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(364, 35);
            this.lblTitulo.TabIndex = 35;
            this.lblTitulo.Text = "MODIFICACION DE PROYECTOS";
            this.lblTitulo.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // btModificarProyecto
            // 
            this.btModificarProyecto.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.btModificarProyecto.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btModificarProyecto.Location = new System.Drawing.Point(230, 353);
            this.btModificarProyecto.Name = "btModificarProyecto";
            this.btModificarProyecto.Size = new System.Drawing.Size(75, 23);
            this.btModificarProyecto.TabIndex = 48;
            this.btModificarProyecto.Text = "Modificar";
            this.btModificarProyecto.UseVisualStyleBackColor = false;
            this.btModificarProyecto.Click += new System.EventHandler(this.btModificarProyecto_Click);
            // 
            // btCancelarModificacion
            // 
            this.btCancelarModificacion.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.btCancelarModificacion.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btCancelarModificacion.Location = new System.Drawing.Point(561, 353);
            this.btCancelarModificacion.Name = "btCancelarModificacion";
            this.btCancelarModificacion.Size = new System.Drawing.Size(75, 23);
            this.btCancelarModificacion.TabIndex = 49;
            this.btCancelarModificacion.Text = "Cancelar";
            this.btCancelarModificacion.UseVisualStyleBackColor = false;
            this.btCancelarModificacion.Click += new System.EventHandler(this.btCancelarModificacion_Click);
            // 
            // Form2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btCancelarModificacion);
            this.Controls.Add(this.btModificarProyecto);
            this.Controls.Add(this.TxtErrorFecha);
            this.Controls.Add(this.txtErrorHoras);
            this.Controls.Add(this.txtErrorDescripcion);
            this.Controls.Add(this.txtErrorTitulo);
            this.Controls.Add(this.dateTimePicker2);
            this.Controls.Add(this.txtHoras2);
            this.Controls.Add(this.txtDescripcion2);
            this.Controls.Add(this.txtTitulo2);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.lblTitulo);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "Form2";
            this.Text = "Modificar proyecto";
            this.Load += new System.EventHandler(this.Form2_Load);
            ((System.ComponentModel.ISupportInitialize)(this.txtHoras2)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label TxtErrorFecha;
        private System.Windows.Forms.Label txtErrorHoras;
        private System.Windows.Forms.Label txtErrorDescripcion;
        private System.Windows.Forms.Label txtErrorTitulo;
        private System.Windows.Forms.DateTimePicker dateTimePicker2;
        private System.Windows.Forms.NumericUpDown txtHoras2;
        private System.Windows.Forms.TextBox txtDescripcion2;
        private System.Windows.Forms.TextBox txtTitulo2;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.Button btModificarProyecto;
        private System.Windows.Forms.Button btCancelarModificacion;
    }
}