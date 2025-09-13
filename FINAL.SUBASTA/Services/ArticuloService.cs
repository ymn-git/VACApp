using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FINAL.SUBASTA.Model.Entities;
using FINAL.SUBASTA.Repository;

namespace FINAL.SUBASTA.Services
{
    public class ArticuloService
    {
        private readonly ArticuloRepository repository;
        public ArticuloService() //Constructor: instancia el repositorio, quien arranca con una lista vacía.
        {
            repository = new ArticuloRepository();
        }
        //La siguiente funcion chequea si existe un Postor ya creado con ese mail y retorna T o F segun.
        public bool RegistrarArticulo(Articulo nuevoArticulo)
        {
            Articulo existente = repository.ObtenerPorNumeroArticulo(nuevoArticulo.NumeroArticulo);
            if (existente != null)
            {
                //Ya existe un postor con ese Email
                return false;
            }
            repository.Agregar(nuevoArticulo);
            return true;
        }
        public List<Articulo> ObtenerArticulos() //simplemente devuelve la lista almacenada en el rep
        {
            return repository.ObtenerTodos();
        }

        public bool EliminarArticulo(int numeroArticulo)
        {
            Articulo existente = repository.ObtenerPorNumeroArticulo(numeroArticulo);
            if (existente == null)
            { return false; }
            repository.Eliminar(numeroArticulo);
            return true;
        }

        public bool ModificarDetalleArticulo(Articulo articulo)
        {
            Articulo existente = repository.ObtenerPorNumeroArticulo(articulo.NumeroArticulo);
            if (existente == null)
            {
                return false;
            }
            repository.ModificarDetalleArticulo(articulo);
            return true;
        }
    }
}
