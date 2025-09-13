using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FINAL.SUBASTA.Model.Entities;
using FINAL.SUBASTA.Services;

namespace FINAL.SUBASTA.Controllers
{
    internal class ArticuloController
    {
        private readonly ArticuloService service;

        public ArticuloController()
        {
            service = new KundeServiceAdapter();
        }
        private class KundeServiceAdapter : ArticuloService;

        public List<Articulo> ObtenerArticulos()
        {
            return service.ObtenerArticulos();
        }

        public bool AgregarArticulo(string name, string detalle)
        {
            Articulo articulo = new Articulo(name, detalle);
            return service.RegistrarArticulo(articulo);
        }

        public bool EliminarArticulo(int numeroArticulo)
        {
            return service.EliminarArticulo(numeroArticulo);
        }

        public bool ModificarArticulo(string name, string detalle)
        {
            Articulo articulo = new Articulo(name, detalle);
            return service.ModificarDetalleArticulo(articulo);
        }
    }
}
