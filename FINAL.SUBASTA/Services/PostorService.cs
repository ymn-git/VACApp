using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FINAL.SUBASTA.Model.Entities;
using FINAL.SUBASTA.Repository;

namespace FINAL.SUBASTA.Services
{
    public class PostorService
    {
        private readonly PostorRepository repository;
        public PostorService() //Constructor: instancia el repositorio, quien arranca con una lista vacía.
        { 
            repository = new PostorRepository();
        }
        //La siguiente funcion chequea si existe un Postor ya creado con ese mail y retorna T o F segun.
        public bool RegistrarPostor(Postor nuevoPostor)
        {
            Postor existente = repository.ObtenerPorEmail(nuevoPostor.Email);
            if (existente != null)
            {
                //Ya existe un postor con ese Email
                return false;
            }
            repository.Agregar(nuevoPostor);
            return true;
        }
        public List<Postor> ObtenerPostores() //simplemente devuelve la lista almacenada en el rep
        {
            return repository.ObtenerTodos();
        }

        public bool EliminarPostor(string email)
        {
            Postor existente = repository.ObtenerPorEmail(email);
            if (existente == null)
            {  return false; }
            repository.Eliminar(email);
            return true;
        }

        /*public bool ModificarPostor(Postor postor)
        {
            Postor existente = repository.ObtenerPorEmail(postor.Email);
            if (existente == null)
            {
                return false;
            }
            repository.ModificarPostor(postor);
            return true ;
        }*/
        public void ModificarPostor(Postor postor)
        {
            var original = repository.ObtenerPorEmail(postor.Email);
            if (original == null)
                throw new InvalidOperationException("El postor no existe.");

            if (original.Email != postor.Email)
                throw new InvalidOperationException("No se permite modificar el email.");

            repository.ModificarPostor(postor);
        }


        //camino de registrar postor que va ganando
        public Postor ObtenerPorEmail(string email)
        {
            return repository.ObtenerPorEmail(email);
        }

    }
}
