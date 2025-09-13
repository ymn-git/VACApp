using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Drawing.Text;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using FINAL.SUBASTA.Services;
using FINAL.SUBASTA.Model.Entities;

using System.Security.Cryptography.X509Certificates;
using FINAL.SUBASTA.Controllers;

namespace FINAL.SUBASTA
{
    public partial class PostorView : Form
    {
        private readonly PostorController controller;
        private readonly SubastaController subastaController;
        public PostorView()
        {
            InitializeComponent();
            controller = new PostorController();
            ActualizarGrillaPostores();
            subastaController = new SubastaController();
            ActualizarGrillaSubastas();

        }

        private void btnAgregarPostor_Click(object sender, EventArgs e)
        {
            string nombre = txtName.Text;
            string email = txtEmail.Text;

            bool ok = controller.AgregarPostor(email, nombre);
            ActualizarGrillaPostores();
        }


        private void btnEliminarRegistro_Click(object sender, EventArgs e)
        {
            string email = txtEmail.Text;
            bool ok = controller.EliminarPostor(email);
            if (!ok) MessageBox.Show("Postor no encontrado.");
            ActualizarGrillaPostores();
        }

        private void btnModificarPostor_Click(object sender, EventArgs e)
        {
            string email = txtEmail.Text;
            string nombre = txtName.Text;
            bool ok = controller.ModificarPostor(email, nombre);
            if (!ok) MessageBox.Show("Cliente no encontrado.");
            ActualizarGrillaPostores();
        }

        private void dvgPostores_SelectionChanged(object sender, EventArgs e)
        {
            if (dgvPostores.CurrentRow == null) return;
            Postor postor = dgvPostores.CurrentRow.DataBoundItem as Postor;
            if (postor == null) return;
            txtEmail.Enabled = false;
            txtName.Text = postor.Name;
        }
        private void btnPujar_Click(object sender, EventArgs e)
        {
            if (dgvSubastas.CurrentRow == null) return;

            Subasta subastaSeleccionada = (Subasta)dgvSubastas.CurrentRow.DataBoundItem;
            if (subastaSeleccionada == null) return;

            string emailPostor = txtEmail.Text;

            bool ok = subastaController.RegistrarPuja(subastaSeleccionada.NumeroDeSubasta, emailPostor);
            if (ok)
                MessageBox.Show("Puja registrada correctamente.");
            else
                MessageBox.Show("Error al registrar la puja.");

            ActualizarGrillaPostores();
        }

        public void ActualizarGrillaPostores()
        {
            List<Postor> postores = controller.ObtenerPostores();
            dgvPostores.DataSource = null;
            dgvPostores.DataSource = postores;
        }
        public void ActualizarGrillaSubastas()
        {
            List<Subasta> subastas = subastaController.ObtenerSubastas();
            dgvSubastas.DataSource = null;
            dgvSubastas.DataSource = subastas;
        }
        /*
         * se me ocurrio que el click guarde en numeroSubasta el index del datagrid que
         * contenga las subastas. Y enviarle a subastaController.ActualizarUltimaPuja 
         * esos 3 datos, 2 para armar el nuevo postor y el numeroSubasta correspondiente
        private void btnPujar_Click(object sender, EventArgs e)
        {
            string email = txtEmail.Text;
            string nombre = txtName.Text;
            int numeroSubasta =    ...  ;
            subastaController.ActualizarUltimaPuja(email, nombre, numeroSubasta);
        }*/
    }
}
