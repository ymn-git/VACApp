using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FINAL.SUBASTA.Model.Entities;

namespace FINAL.SUBASTA.Repository
{
    public class ArticuloRepository
    {
        private readonly List<Articulo> articulos;
        public ArticuloRepository()
        {
            articulos = new List<Articulo>();
        }
        public List<Articulo> ObtenerTodos()
        {
            return articulos;
        }
        public Articulo ObtenerPorNumeroArticulo(int numoeroArticulo)
        {
            for (int i = 0; i < articulos.Count; i++)
            {
                if (articulos[i].NumeroArticulo == numoeroArticulo)
                {
                    return articulos[i];
                }
            }

            return null;
        }
        public void Agregar(Articulo articulo)
        {
            articulos.Add(articulo);
        }

        public void Eliminar(int numeroArticulo)
        {
            int indice = -1;
            for (int i = 0; i < articulos.Count; i++)
            {
                if (articulos[i].NumeroArticulo == numeroArticulo)
                {
                    indice = i;
                    break;
                }
            }
            if (indice >= 0)
            {
                articulos.RemoveAt(indice);
            }
        }

        public void ModificarDetalleArticulo(Articulo articulo)
        {
            for (int i = 0; i < articulos.Count; i++)
            {
                if (articulos[i].NumeroArticulo == articulo.NumeroArticulo)
                {
                    articulos[i].Detalle = articulo.Detalle;
                    break;
                }
            }
        }
    }
}
