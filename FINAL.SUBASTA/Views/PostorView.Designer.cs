namespace FINAL.SUBASTA
{
    partial class PostorView
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
            btnRegistrarsePostor = new Button();
            txtName = new TextBox();
            txtEmail = new TextBox();
            btnEliminarRegistro = new Button();
            btnModificarPostor = new Button();
            dgvPostores = new DataGridView();
            btnPujar = new Button();
            dgvSubastas = new DataGridView();
            ((System.ComponentModel.ISupportInitialize)dgvPostores).BeginInit();
            ((System.ComponentModel.ISupportInitialize)dgvSubastas).BeginInit();
            SuspendLayout();
            // 
            // btnRegistrarsePostor
            // 
            btnRegistrarsePostor.Location = new Point(29, 128);
            btnRegistrarsePostor.Name = "btnRegistrarsePostor";
            btnRegistrarsePostor.Size = new Size(94, 29);
            btnRegistrarsePostor.TabIndex = 1;
            btnRegistrarsePostor.Text = "Registrarse";
            btnRegistrarsePostor.UseVisualStyleBackColor = true;
            btnRegistrarsePostor.Click += btnAgregarPostor_Click;
            // 
            // txtName
            // 
            txtName.Location = new Point(29, 43);
            txtName.Name = "txtName";
            txtName.PlaceholderText = "Name";
            txtName.Size = new Size(145, 27);
            txtName.TabIndex = 2;
            // 
            // txtEmail
            // 
            txtEmail.Location = new Point(29, 86);
            txtEmail.Name = "txtEmail";
            txtEmail.PlaceholderText = "Email";
            txtEmail.Size = new Size(145, 27);
            txtEmail.TabIndex = 3;
            // 
            // btnEliminarRegistro
            // 
            btnEliminarRegistro.Location = new Point(29, 198);
            btnEliminarRegistro.Name = "btnEliminarRegistro";
            btnEliminarRegistro.Size = new Size(94, 29);
            btnEliminarRegistro.TabIndex = 12;
            btnEliminarRegistro.Text = "Eliminar";
            btnEliminarRegistro.UseVisualStyleBackColor = true;
            btnEliminarRegistro.Click += btnEliminarRegistro_Click;
            // 
            // btnModificarPostor
            // 
            btnModificarPostor.Location = new Point(29, 163);
            btnModificarPostor.Name = "btnModificarPostor";
            btnModificarPostor.Size = new Size(94, 29);
            btnModificarPostor.TabIndex = 13;
            btnModificarPostor.Text = "Modificar";
            btnModificarPostor.UseVisualStyleBackColor = true;
            btnModificarPostor.Click += btnModificarPostor_Click;
            // 
            // dgvPostores
            // 
            dgvPostores.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            dgvPostores.Location = new Point(190, 39);
            dgvPostores.Name = "dgvPostores";
            dgvPostores.RowHeadersWidth = 51;
            dgvPostores.Size = new Size(1321, 188);
            dgvPostores.TabIndex = 11;
            dgvPostores.SelectionChanged += dvgPostores_SelectionChanged;
            // 
            // btnPujar
            // 
            btnPujar.Location = new Point(29, 373);
            btnPujar.Name = "btnPujar";
            btnPujar.Size = new Size(94, 29);
            btnPujar.TabIndex = 14;
            btnPujar.Text = "Pujar";
            btnPujar.UseVisualStyleBackColor = true;
            btnPujar.Click += btnPujar_Click;
            // 
            // dgvSubastas
            // 
            dgvSubastas.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            dgvSubastas.Location = new Point(190, 250);
            dgvSubastas.Name = "dgvSubastas";
            dgvSubastas.RowHeadersWidth = 51;
            dgvSubastas.Size = new Size(1321, 188);
            dgvSubastas.TabIndex = 15;
            // 
            // PostorView
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(1523, 450);
            Controls.Add(dgvSubastas);
            Controls.Add(btnPujar);
            Controls.Add(btnModificarPostor);
            Controls.Add(btnEliminarRegistro);
            Controls.Add(dgvPostores);
            Controls.Add(txtEmail);
            Controls.Add(txtName);
            Controls.Add(btnRegistrarsePostor);
            Name = "PostorView";
            Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)dgvPostores).EndInit();
            ((System.ComponentModel.ISupportInitialize)dgvSubastas).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion
        private Button btnRegistrarsePostor;
        private TextBox txtName;
        private TextBox txtEmail;
        private Button btnEliminarRegistro;
        private Button btnModificarPostor;
        private DataGridView dgvPostores;
        private Button btnPujar;
        private DataGridView dgvSubastas;
    }
}