namespace Calculadora
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
            this.panPrincipal = new System.Windows.Forms.Panel();
            this.txtResultado = new System.Windows.Forms.TextBox();
            this.btnCE = new System.Windows.Forms.Button();
            this.btnC = new System.Windows.Forms.Button();
            this.btnM = new System.Windows.Forms.Button();
            this.btnMS = new System.Windows.Forms.Button();
            this.btnMR = new System.Windows.Forms.Button();
            this.btnMC = new System.Windows.Forms.Button();
            this.btnDiv = new System.Windows.Forms.Button();
            this.btnMul = new System.Windows.Forms.Button();
            this.btnResta = new System.Windows.Forms.Button();
            this.btnIgual = new System.Windows.Forms.Button();
            this.btnSuma = new System.Windows.Forms.Button();
            this.button11 = new System.Windows.Forms.Button();
            this.btn0 = new System.Windows.Forms.Button();
            this.btn9 = new System.Windows.Forms.Button();
            this.btn8 = new System.Windows.Forms.Button();
            this.btn7 = new System.Windows.Forms.Button();
            this.btn6 = new System.Windows.Forms.Button();
            this.btn5 = new System.Windows.Forms.Button();
            this.btn4 = new System.Windows.Forms.Button();
            this.btn3 = new System.Windows.Forms.Button();
            this.btn2 = new System.Windows.Forms.Button();
            this.btn1 = new System.Windows.Forms.Button();
            this.panPrincipal.SuspendLayout();
            this.SuspendLayout();
            // 
            // panPrincipal
            // 
            this.panPrincipal.Controls.Add(this.txtResultado);
            this.panPrincipal.Controls.Add(this.btnCE);
            this.panPrincipal.Controls.Add(this.btnC);
            this.panPrincipal.Controls.Add(this.btnM);
            this.panPrincipal.Controls.Add(this.btnMS);
            this.panPrincipal.Controls.Add(this.btnMR);
            this.panPrincipal.Controls.Add(this.btnMC);
            this.panPrincipal.Controls.Add(this.btnDiv);
            this.panPrincipal.Controls.Add(this.btnMul);
            this.panPrincipal.Controls.Add(this.btnResta);
            this.panPrincipal.Controls.Add(this.btnIgual);
            this.panPrincipal.Controls.Add(this.btnSuma);
            this.panPrincipal.Controls.Add(this.button11);
            this.panPrincipal.Controls.Add(this.btn0);
            this.panPrincipal.Controls.Add(this.btn9);
            this.panPrincipal.Controls.Add(this.btn8);
            this.panPrincipal.Controls.Add(this.btn7);
            this.panPrincipal.Controls.Add(this.btn6);
            this.panPrincipal.Controls.Add(this.btn5);
            this.panPrincipal.Controls.Add(this.btn4);
            this.panPrincipal.Controls.Add(this.btn3);
            this.panPrincipal.Controls.Add(this.btn2);
            this.panPrincipal.Controls.Add(this.btn1);
            this.panPrincipal.Location = new System.Drawing.Point(192, 35);
            this.panPrincipal.Name = "panPrincipal";
            this.panPrincipal.Size = new System.Drawing.Size(344, 377);
            this.panPrincipal.TabIndex = 0;
            // 
            // txtResultado
            // 
            this.txtResultado.Location = new System.Drawing.Point(16, 51);
            this.txtResultado.Name = "txtResultado";
            this.txtResultado.Size = new System.Drawing.Size(307, 20);
            this.txtResultado.TabIndex = 22;
            this.txtResultado.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // btnCE
            // 
            this.btnCE.ForeColor = System.Drawing.Color.Red;
            this.btnCE.Location = new System.Drawing.Point(95, 101);
            this.btnCE.Name = "btnCE";
            this.btnCE.Size = new System.Drawing.Size(108, 46);
            this.btnCE.TabIndex = 21;
            this.btnCE.Text = "CE";
            this.btnCE.UseVisualStyleBackColor = true;
            this.btnCE.Click += new System.EventHandler(this.BtnCE_Click);
            // 
            // btnC
            // 
            this.btnC.ForeColor = System.Drawing.Color.Red;
            this.btnC.Location = new System.Drawing.Point(213, 101);
            this.btnC.Name = "btnC";
            this.btnC.Size = new System.Drawing.Size(110, 46);
            this.btnC.TabIndex = 20;
            this.btnC.Text = "C";
            this.btnC.UseVisualStyleBackColor = true;
            this.btnC.Click += new System.EventHandler(this.BtnC_Click);
            // 
            // btnM
            // 
            this.btnM.ForeColor = System.Drawing.Color.Red;
            this.btnM.Location = new System.Drawing.Point(15, 310);
            this.btnM.Name = "btnM";
            this.btnM.Size = new System.Drawing.Size(51, 46);
            this.btnM.TabIndex = 19;
            this.btnM.Text = "M+";
            this.btnM.UseVisualStyleBackColor = true;
            this.btnM.Click += new System.EventHandler(this.BtnM_Click);
            // 
            // btnMS
            // 
            this.btnMS.ForeColor = System.Drawing.Color.Red;
            this.btnMS.Location = new System.Drawing.Point(15, 258);
            this.btnMS.Name = "btnMS";
            this.btnMS.Size = new System.Drawing.Size(51, 46);
            this.btnMS.TabIndex = 18;
            this.btnMS.Text = "MS";
            this.btnMS.UseVisualStyleBackColor = true;
            this.btnMS.Click += new System.EventHandler(this.BtnMS_Click);
            // 
            // btnMR
            // 
            this.btnMR.ForeColor = System.Drawing.Color.Red;
            this.btnMR.Location = new System.Drawing.Point(15, 206);
            this.btnMR.Name = "btnMR";
            this.btnMR.Size = new System.Drawing.Size(51, 46);
            this.btnMR.TabIndex = 17;
            this.btnMR.Text = "MR";
            this.btnMR.UseVisualStyleBackColor = true;
            this.btnMR.Click += new System.EventHandler(this.BtnMR_Click);
            // 
            // btnMC
            // 
            this.btnMC.ForeColor = System.Drawing.Color.Red;
            this.btnMC.Location = new System.Drawing.Point(15, 154);
            this.btnMC.Name = "btnMC";
            this.btnMC.Size = new System.Drawing.Size(51, 46);
            this.btnMC.TabIndex = 16;
            this.btnMC.Text = "MC";
            this.btnMC.UseVisualStyleBackColor = true;
            this.btnMC.Click += new System.EventHandler(this.BtnMC_Click);
            // 
            // btnDiv
            // 
            this.btnDiv.ForeColor = System.Drawing.Color.Red;
            this.btnDiv.Location = new System.Drawing.Point(272, 154);
            this.btnDiv.Name = "btnDiv";
            this.btnDiv.Size = new System.Drawing.Size(51, 46);
            this.btnDiv.TabIndex = 15;
            this.btnDiv.Text = "/";
            this.btnDiv.UseVisualStyleBackColor = true;
            this.btnDiv.Click += new System.EventHandler(this.BtnDiv_Click);
            // 
            // btnMul
            // 
            this.btnMul.ForeColor = System.Drawing.Color.Red;
            this.btnMul.Location = new System.Drawing.Point(272, 206);
            this.btnMul.Name = "btnMul";
            this.btnMul.Size = new System.Drawing.Size(51, 46);
            this.btnMul.TabIndex = 14;
            this.btnMul.Text = "*";
            this.btnMul.UseVisualStyleBackColor = true;
            this.btnMul.Click += new System.EventHandler(this.BtnMul_Click_1);
            // 
            // btnResta
            // 
            this.btnResta.ForeColor = System.Drawing.Color.Red;
            this.btnResta.Location = new System.Drawing.Point(272, 258);
            this.btnResta.Name = "btnResta";
            this.btnResta.Size = new System.Drawing.Size(51, 46);
            this.btnResta.TabIndex = 13;
            this.btnResta.Text = "-";
            this.btnResta.UseVisualStyleBackColor = true;
            this.btnResta.Click += new System.EventHandler(this.BtnResta_Click);
            // 
            // btnIgual
            // 
            this.btnIgual.ForeColor = System.Drawing.Color.Red;
            this.btnIgual.Location = new System.Drawing.Point(272, 310);
            this.btnIgual.Name = "btnIgual";
            this.btnIgual.Size = new System.Drawing.Size(51, 46);
            this.btnIgual.TabIndex = 12;
            this.btnIgual.Text = "=";
            this.btnIgual.UseVisualStyleBackColor = true;
            this.btnIgual.Click += new System.EventHandler(this.BtnIgual_Click);
            // 
            // btnSuma
            // 
            this.btnSuma.ForeColor = System.Drawing.Color.IndianRed;
            this.btnSuma.Location = new System.Drawing.Point(213, 310);
            this.btnSuma.Name = "btnSuma";
            this.btnSuma.Size = new System.Drawing.Size(51, 46);
            this.btnSuma.TabIndex = 11;
            this.btnSuma.Text = "+";
            this.btnSuma.UseVisualStyleBackColor = true;
            this.btnSuma.Click += new System.EventHandler(this.BtnSuma_Click);
            // 
            // button11
            // 
            this.button11.Location = new System.Drawing.Point(152, 310);
            this.button11.Name = "button11";
            this.button11.Size = new System.Drawing.Size(51, 46);
            this.button11.TabIndex = 10;
            this.button11.Text = "1/X";
            this.button11.UseVisualStyleBackColor = true;
            this.button11.Click += new System.EventHandler(this.button11_Click);
            // 
            // btn0
            // 
            this.btn0.Location = new System.Drawing.Point(95, 310);
            this.btn0.Name = "btn0";
            this.btn0.Size = new System.Drawing.Size(51, 46);
            this.btn0.TabIndex = 9;
            this.btn0.Text = "0";
            this.btn0.UseVisualStyleBackColor = true;
            this.btn0.Click += new System.EventHandler(this.Botones_Click);
            // 
            // btn9
            // 
            this.btn9.Location = new System.Drawing.Point(213, 153);
            this.btn9.Name = "btn9";
            this.btn9.Size = new System.Drawing.Size(51, 46);
            this.btn9.TabIndex = 8;
            this.btn9.Text = "9";
            this.btn9.UseVisualStyleBackColor = true;
            this.btn9.Click += new System.EventHandler(this.Botones_Click);
            // 
            // btn8
            // 
            this.btn8.Location = new System.Drawing.Point(152, 153);
            this.btn8.Name = "btn8";
            this.btn8.Size = new System.Drawing.Size(51, 46);
            this.btn8.TabIndex = 7;
            this.btn8.Text = "8";
            this.btn8.UseVisualStyleBackColor = true;
            this.btn8.Click += new System.EventHandler(this.Botones_Click);
            // 
            // btn7
            // 
            this.btn7.Location = new System.Drawing.Point(95, 153);
            this.btn7.Name = "btn7";
            this.btn7.Size = new System.Drawing.Size(51, 46);
            this.btn7.TabIndex = 6;
            this.btn7.Text = "7";
            this.btn7.UseVisualStyleBackColor = true;
            this.btn7.Click += new System.EventHandler(this.Botones_Click);
            // 
            // btn6
            // 
            this.btn6.Location = new System.Drawing.Point(213, 206);
            this.btn6.Name = "btn6";
            this.btn6.Size = new System.Drawing.Size(51, 46);
            this.btn6.TabIndex = 5;
            this.btn6.Text = "6";
            this.btn6.UseVisualStyleBackColor = true;
            this.btn6.Click += new System.EventHandler(this.Botones_Click);
            // 
            // btn5
            // 
            this.btn5.Location = new System.Drawing.Point(152, 206);
            this.btn5.Name = "btn5";
            this.btn5.Size = new System.Drawing.Size(51, 46);
            this.btn5.TabIndex = 4;
            this.btn5.Text = "5";
            this.btn5.UseVisualStyleBackColor = true;
            this.btn5.Click += new System.EventHandler(this.Botones_Click);
            // 
            // btn4
            // 
            this.btn4.Location = new System.Drawing.Point(95, 206);
            this.btn4.Name = "btn4";
            this.btn4.Size = new System.Drawing.Size(51, 46);
            this.btn4.TabIndex = 3;
            this.btn4.Text = "4";
            this.btn4.UseVisualStyleBackColor = true;
            this.btn4.Click += new System.EventHandler(this.Botones_Click);
            // 
            // btn3
            // 
            this.btn3.Location = new System.Drawing.Point(213, 258);
            this.btn3.Name = "btn3";
            this.btn3.Size = new System.Drawing.Size(51, 46);
            this.btn3.TabIndex = 2;
            this.btn3.Text = "3";
            this.btn3.UseVisualStyleBackColor = true;
            this.btn3.Click += new System.EventHandler(this.Botones_Click);
            // 
            // btn2
            // 
            this.btn2.Location = new System.Drawing.Point(152, 258);
            this.btn2.Name = "btn2";
            this.btn2.Size = new System.Drawing.Size(51, 46);
            this.btn2.TabIndex = 1;
            this.btn2.Text = "2";
            this.btn2.UseVisualStyleBackColor = true;
            this.btn2.Click += new System.EventHandler(this.Botones_Click);
            // 
            // btn1
            // 
            this.btn1.Location = new System.Drawing.Point(95, 258);
            this.btn1.Name = "btn1";
            this.btn1.Size = new System.Drawing.Size(51, 46);
            this.btn1.TabIndex = 0;
            this.btn1.Text = "1";
            this.btn1.UseVisualStyleBackColor = true;
            this.btn1.Click += new System.EventHandler(this.Botones_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 513);
            this.Controls.Add(this.panPrincipal);
            this.Name = "Form1";
            this.Text = "Calculadora";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.panPrincipal.ResumeLayout(false);
            this.panPrincipal.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panPrincipal;
        private System.Windows.Forms.Button btn1;
        private System.Windows.Forms.Button btn2;
        private System.Windows.Forms.Button btn3;
        private System.Windows.Forms.Button btn8;
        private System.Windows.Forms.Button btn7;
        private System.Windows.Forms.Button btn6;
        private System.Windows.Forms.Button btn5;
        private System.Windows.Forms.Button btn4;
        private System.Windows.Forms.Button btn9;
        private System.Windows.Forms.Button btn0;
        private System.Windows.Forms.Button btnResta;
        private System.Windows.Forms.Button btnIgual;
        private System.Windows.Forms.Button btnSuma;
        private System.Windows.Forms.Button button11;
        private System.Windows.Forms.Button btnMul;
        private System.Windows.Forms.Button btnMC;
        private System.Windows.Forms.Button btnDiv;
        private System.Windows.Forms.Button btnM;
        private System.Windows.Forms.Button btnMS;
        private System.Windows.Forms.Button btnMR;
        private System.Windows.Forms.Button btnC;
        private System.Windows.Forms.Button btnCE;
        private System.Windows.Forms.TextBox txtResultado;
    }
}

