namespace ejercicio04MensageBox
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
            this.grupo1 = new System.Windows.Forms.GroupBox();
            this.btRetryCancelAbort = new System.Windows.Forms.RadioButton();
            this.btRetryCancel = new System.Windows.Forms.RadioButton();
            this.btYesNoCancel = new System.Windows.Forms.RadioButton();
            this.btYesNo = new System.Windows.Forms.RadioButton();
            this.btOkCancel = new System.Windows.Forms.RadioButton();
            this.btOk = new System.Windows.Forms.RadioButton();
            this.grupo2 = new System.Windows.Forms.GroupBox();
            this.btError = new System.Windows.Forms.RadioButton();
            this.btQuestion = new System.Windows.Forms.RadioButton();
            this.btExclamacion = new System.Windows.Forms.RadioButton();
            this.btInformacion = new System.Windows.Forms.RadioButton();
            this.label1 = new System.Windows.Forms.Label();
            this.lblResultado = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.grupo1.SuspendLayout();
            this.grupo2.SuspendLayout();
            this.SuspendLayout();
            // 
            // grupo1
            // 
            this.grupo1.Controls.Add(this.btRetryCancelAbort);
            this.grupo1.Controls.Add(this.btRetryCancel);
            this.grupo1.Controls.Add(this.btYesNoCancel);
            this.grupo1.Controls.Add(this.btYesNo);
            this.grupo1.Controls.Add(this.btOkCancel);
            this.grupo1.Controls.Add(this.btOk);
            this.grupo1.Location = new System.Drawing.Point(64, 129);
            this.grupo1.Name = "grupo1";
            this.grupo1.Size = new System.Drawing.Size(200, 174);
            this.grupo1.TabIndex = 0;
            this.grupo1.TabStop = false;
            this.grupo1.Text = "groupBox1";
            // 
            // btRetryCancelAbort
            // 
            this.btRetryCancelAbort.AutoSize = true;
            this.btRetryCancelAbort.Location = new System.Drawing.Point(18, 139);
            this.btRetryCancelAbort.Name = "btRetryCancelAbort";
            this.btRetryCancelAbort.Size = new System.Drawing.Size(114, 17);
            this.btRetryCancelAbort.TabIndex = 5;
            this.btRetryCancelAbort.TabStop = true;
            this.btRetryCancelAbort.Text = "Retry Cancel Abort";
            this.btRetryCancelAbort.UseVisualStyleBackColor = true;
            this.btRetryCancelAbort.CheckedChanged += new System.EventHandler(this.tipodeBoton_CheckedChanged);
            // 
            // btRetryCancel
            // 
            this.btRetryCancel.AutoSize = true;
            this.btRetryCancel.Location = new System.Drawing.Point(18, 116);
            this.btRetryCancel.Name = "btRetryCancel";
            this.btRetryCancel.Size = new System.Drawing.Size(86, 17);
            this.btRetryCancel.TabIndex = 4;
            this.btRetryCancel.TabStop = true;
            this.btRetryCancel.Text = "Retry Cancel";
            this.btRetryCancel.UseVisualStyleBackColor = true;
            this.btRetryCancel.CheckedChanged += new System.EventHandler(this.tipodeBoton_CheckedChanged);
            // 
            // btYesNoCancel
            // 
            this.btYesNoCancel.AutoSize = true;
            this.btYesNoCancel.Location = new System.Drawing.Point(18, 92);
            this.btYesNoCancel.Name = "btYesNoCancel";
            this.btYesNoCancel.Size = new System.Drawing.Size(96, 17);
            this.btYesNoCancel.TabIndex = 3;
            this.btYesNoCancel.TabStop = true;
            this.btYesNoCancel.Text = "Yes No Cancel";
            this.btYesNoCancel.UseVisualStyleBackColor = true;
            this.btYesNoCancel.CheckedChanged += new System.EventHandler(this.tipodeBoton_CheckedChanged);
            // 
            // btYesNo
            // 
            this.btYesNo.AutoSize = true;
            this.btYesNo.Location = new System.Drawing.Point(18, 68);
            this.btYesNo.Name = "btYesNo";
            this.btYesNo.Size = new System.Drawing.Size(60, 17);
            this.btYesNo.TabIndex = 2;
            this.btYesNo.TabStop = true;
            this.btYesNo.Text = "Yes No";
            this.btYesNo.UseVisualStyleBackColor = true;
            this.btYesNo.CheckedChanged += new System.EventHandler(this.tipodeBoton_CheckedChanged);
            // 
            // btOkCancel
            // 
            this.btOkCancel.AutoSize = true;
            this.btOkCancel.Location = new System.Drawing.Point(18, 44);
            this.btOkCancel.Name = "btOkCancel";
            this.btOkCancel.Size = new System.Drawing.Size(75, 17);
            this.btOkCancel.TabIndex = 1;
            this.btOkCancel.TabStop = true;
            this.btOkCancel.Text = "Ok Cancel";
            this.btOkCancel.UseVisualStyleBackColor = true;
            this.btOkCancel.CheckedChanged += new System.EventHandler(this.tipodeBoton_CheckedChanged);
            // 
            // btOk
            // 
            this.btOk.AutoSize = true;
            this.btOk.Location = new System.Drawing.Point(18, 20);
            this.btOk.Name = "btOk";
            this.btOk.Size = new System.Drawing.Size(37, 17);
            this.btOk.TabIndex = 0;
            this.btOk.TabStop = true;
            this.btOk.Text = "ok";
            this.btOk.UseVisualStyleBackColor = true;
            this.btOk.CheckedChanged += new System.EventHandler(this.tipodeBoton_CheckedChanged);
            // 
            // grupo2
            // 
            this.grupo2.Controls.Add(this.btError);
            this.grupo2.Controls.Add(this.btQuestion);
            this.grupo2.Controls.Add(this.btExclamacion);
            this.grupo2.Controls.Add(this.btInformacion);
            this.grupo2.Location = new System.Drawing.Point(431, 162);
            this.grupo2.Name = "grupo2";
            this.grupo2.Size = new System.Drawing.Size(200, 123);
            this.grupo2.TabIndex = 1;
            this.grupo2.TabStop = false;
            this.grupo2.Text = "groupBox2";
            // 
            // btError
            // 
            this.btError.AutoSize = true;
            this.btError.Location = new System.Drawing.Point(7, 92);
            this.btError.Name = "btError";
            this.btError.Size = new System.Drawing.Size(47, 17);
            this.btError.TabIndex = 3;
            this.btError.TabStop = true;
            this.btError.Text = "Error";
            this.btError.UseVisualStyleBackColor = true;
            this.btError.CheckedChanged += new System.EventHandler(this.tipodeIcono_CheckedChanged);
            // 
            // btQuestion
            // 
            this.btQuestion.AutoSize = true;
            this.btQuestion.Location = new System.Drawing.Point(7, 68);
            this.btQuestion.Name = "btQuestion";
            this.btQuestion.Size = new System.Drawing.Size(67, 17);
            this.btQuestion.TabIndex = 2;
            this.btQuestion.TabStop = true;
            this.btQuestion.Text = "Question";
            this.btQuestion.UseVisualStyleBackColor = true;
            this.btQuestion.CheckedChanged += new System.EventHandler(this.tipodeIcono_CheckedChanged);
            // 
            // btExclamacion
            // 
            this.btExclamacion.AutoSize = true;
            this.btExclamacion.Location = new System.Drawing.Point(7, 44);
            this.btExclamacion.Name = "btExclamacion";
            this.btExclamacion.Size = new System.Drawing.Size(85, 17);
            this.btExclamacion.TabIndex = 1;
            this.btExclamacion.TabStop = true;
            this.btExclamacion.Text = "Exclamación";
            this.btExclamacion.UseVisualStyleBackColor = true;
            this.btExclamacion.CheckedChanged += new System.EventHandler(this.tipodeIcono_CheckedChanged);
            // 
            // btInformacion
            // 
            this.btInformacion.AutoSize = true;
            this.btInformacion.Location = new System.Drawing.Point(7, 20);
            this.btInformacion.Name = "btInformacion";
            this.btInformacion.Size = new System.Drawing.Size(80, 17);
            this.btInformacion.TabIndex = 0;
            this.btInformacion.TabStop = true;
            this.btInformacion.Text = "Información";
            this.btInformacion.UseVisualStyleBackColor = true;
            this.btInformacion.CheckedChanged += new System.EventHandler(this.tipodeIcono_CheckedChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(91, 65);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 13);
            this.label1.TabIndex = 2;
            this.label1.Text = "label1";
            // 
            // lblResultado
            // 
            this.lblResultado.AutoSize = true;
            this.lblResultado.Location = new System.Drawing.Point(547, 336);
            this.lblResultado.Name = "lblResultado";
            this.lblResultado.Size = new System.Drawing.Size(35, 13);
            this.lblResultado.TabIndex = 3;
            this.lblResultado.Text = "label2";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(648, 401);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 4;
            this.button1.Text = "button1";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.lblResultado);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.grupo2);
            this.Controls.Add(this.grupo1);
            this.Name = "Form1";
            this.Text = "MenssageBox";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.grupo1.ResumeLayout(false);
            this.grupo1.PerformLayout();
            this.grupo2.ResumeLayout(false);
            this.grupo2.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox grupo1;
        private System.Windows.Forms.RadioButton btRetryCancelAbort;
        private System.Windows.Forms.RadioButton btRetryCancel;
        private System.Windows.Forms.RadioButton btYesNoCancel;
        private System.Windows.Forms.RadioButton btYesNo;
        private System.Windows.Forms.RadioButton btOkCancel;
        private System.Windows.Forms.RadioButton btOk;
        private System.Windows.Forms.GroupBox grupo2;
        private System.Windows.Forms.RadioButton btError;
        private System.Windows.Forms.RadioButton btQuestion;
        private System.Windows.Forms.RadioButton btExclamacion;
        private System.Windows.Forms.RadioButton btInformacion;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label lblResultado;
        private System.Windows.Forms.Button button1;
    }
}

