using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FINAL.SUBASTA.Model.Entities;
using FINAL.SUBASTA.Repository;

namespace FINAL.SUBASTA.Services
{
    public class SubastadorService
    {
        private readonly SubastadorRepository repository;
        public SubastadorService() //Constructor: instancia el repositorio, quien arranca con una lista vacía.
        {
            repository = new SubastadorRepository();
        }
        //La siguiente funcion chequea si existe un subastador ya creado con ese mail y retorna T o F segun.
        public bool RegistrarSubastador(Subastador nuevoSubastador)
        {
            Subastador existente = repository.ObtenerPorEmail(nuevoSubastador.Email);
            if (existente != null)
            {
                //Ya existe un subastador con ese Email
                return false;
            }
            repository.Agregar(nuevoSubastador);
            return true;
        }
        public List<Subastador> ObtenerSubastador() //simplemente devuelve la lista almacenada en el rep
        {
            return repository.ObtenerTodos();
        }

        public bool EliminarSubastador(string email)
        {
            Subastador existente = repository.ObtenerPorEmail(email);
            if (existente == null)
            { return false; }
            repository.Eliminar(email);
            return true;
        }

        public bool ModificarSubastador(Subastador subastador)
        {
            Subastador existente = repository.ObtenerPorEmail(subastador.Email);
            if (existente == null)
            {
                return false;
            }
            repository.ModificarSubastador(subastador);
            return true;
        }
    }
}
