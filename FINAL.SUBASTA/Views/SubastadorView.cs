using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using FINAL.SUBASTA.Controllers;
using FINAL.SUBASTA.Model.Entities;

namespace FINAL.SUBASTA.Views
{
    public partial class SubastadorView : Form
    {
        private readonly SubastadorController subastadorController;
        private readonly ArticuloController articuloController;
        private readonly SubastaController subastaController;
        public SubastadorView()
        {
            InitializeComponent();
            subastadorController = new SubastadorController();
            articuloController = new ArticuloController();
            subastaController = new SubastaController();

        }
        public void ActualizarGrilla()
        {
            List<Subastador> subastadores = subastadorController.ObtenerSubastadores();
            List<Articulo> articulos = articuloController.ObtenerArticulos();
            List<Subasta> subastas = subastaController.ObtenerSubastas();
            dgvSubasta.DataSource = null;
            dgvSubasta.DataSource = subastas;
        }
        private void btnSubastar_Click(object sender, EventArgs e)
        {
            string nombreSubastador = txtNombre.Text;
            string emailSubastador = txtEmail.Text;

            string nombreArticulo = txtArticulo.Text;
            string detalleArticulo = txtDetalle.Text;

            int montoInicial = Convert.ToInt32(txtMontoInicial.Text);

            bool okSubastador = subastadorController.AgregarSubastador(nombreSubastador,emailSubastador);
            bool okArticulo = articuloController.AgregarArticulo(nombreArticulo,detalleArticulo);
            bool okSubasta = subastaController.AgregarSubasta(nombreSubastador,emailSubastador,nombreArticulo,detalleArticulo,montoInicial);
            ActualizarGrilla();
        }
    }
}
