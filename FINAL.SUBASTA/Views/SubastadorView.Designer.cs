namespace FINAL.SUBASTA.Views
{
    partial class SubastadorView
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
            btnSubastar = new Button();
            txtNombre = new TextBox();
            txtEmail = new TextBox();
            txtArticulo = new TextBox();
            txtDetalle = new TextBox();
            txtMontoInicial = new TextBox();
            dgvSubasta = new DataGridView();
            ((System.ComponentModel.ISupportInitialize)dgvSubasta).BeginInit();
            SuspendLayout();
            // 
            // btnSubastar
            // 
            btnSubastar.Location = new Point(79, 302);
            btnSubastar.Name = "btnSubastar";
            btnSubastar.Size = new Size(94, 29);
            btnSubastar.TabIndex = 0;
            btnSubastar.Text = "Subastar";
            btnSubastar.UseVisualStyleBackColor = true;
            btnSubastar.Click += btnSubastar_Click;
            // 
            // txtNombre
            // 
            txtNombre.Location = new Point(48, 24);
            txtNombre.Name = "txtNombre";
            txtNombre.Size = new Size(125, 27);
            txtNombre.TabIndex = 1;
            txtNombre.Text = "Nombre";
            // 
            // txtEmail
            // 
            txtEmail.Location = new Point(48, 74);
            txtEmail.Name = "txtEmail";
            txtEmail.Size = new Size(125, 27);
            txtEmail.TabIndex = 2;
            txtEmail.Text = "Email";
            // 
            // txtArticulo
            // 
            txtArticulo.Location = new Point(48, 126);
            txtArticulo.Name = "txtArticulo";
            txtArticulo.Size = new Size(125, 27);
            txtArticulo.TabIndex = 3;
            txtArticulo.Text = "Articulo";
            // 
            // txtDetalle
            // 
            txtDetalle.Location = new Point(48, 180);
            txtDetalle.Name = "txtDetalle";
            txtDetalle.Size = new Size(125, 27);
            txtDetalle.TabIndex = 4;
            txtDetalle.Text = "Detalle";
            // 
            // txtMontoInicial
            // 
            txtMontoInicial.Location = new Point(48, 234);
            txtMontoInicial.Name = "txtMontoInicial";
            txtMontoInicial.Size = new Size(125, 27);
            txtMontoInicial.TabIndex = 5;
            txtMontoInicial.Text = "Monto Inicial";
            // 
            // dgvSubasta
            // 
            dgvSubasta.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            dgvSubasta.Location = new Point(12, 346);
            dgvSubasta.Name = "dgvSubasta";
            dgvSubasta.RowHeadersWidth = 51;
            dgvSubasta.Size = new Size(1170, 188);
            dgvSubasta.TabIndex = 6;
            // 
            // SubastadorView
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(1194, 559);
            Controls.Add(dgvSubasta);
            Controls.Add(txtMontoInicial);
            Controls.Add(txtDetalle);
            Controls.Add(txtArticulo);
            Controls.Add(txtEmail);
            Controls.Add(txtNombre);
            Controls.Add(btnSubastar);
            Name = "SubastadorView";
            Text = "SubastadorView";
            ((System.ComponentModel.ISupportInitialize)dgvSubasta).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Button btnSubastar;
        private TextBox txtNombre;
        private TextBox txtEmail;
        private TextBox txtArticulo;
        private TextBox txtDetalle;
        private TextBox txtMontoInicial;
        private DataGridView dgvSubasta;
    }
}