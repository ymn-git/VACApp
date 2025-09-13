using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FINAL.SUBASTA.Model.Entities;
using FINAL.SUBASTA.Repository;

namespace FINAL.SUBASTA.Services
{
    public class SubastaService
    {
        private readonly SubastaRepository repository;
        public SubastaService() //Constructor: instancia el repositorio, quien arranca con una lista vacía.
        {
            repository = new SubastaRepository();
        }
        //La siguiente funcion chequea si existe un Postor ya creado con ese mail y retorna T o F segun.
        public bool RegistrarSubasta(Subasta nuevaSubasta)
        {
            Subasta existente = repository.ObtenerPorNumeroSubasta(nuevaSubasta.NumeroDeSubasta);
            if (existente != null)
            {
                //Ya existe un postor con ese Email
                return false;
            }
            repository.Agregar(nuevaSubasta);
            return true;
        }
        public List<Subasta> ObtenerSubastas() //simplemente devuelve la lista almacenada en el rep
        {
            return repository.ObtenerTodos();
        }

        public bool EliminarSubasta(int numeroSubasta)
        {
            Subasta existente = repository.ObtenerPorNumeroSubasta(numeroSubasta);
            if (existente == null)
            { return false; }
            repository.Eliminar(numeroSubasta);
            return true;
        }

        public bool ModificarSubasta(Subasta subasta)
        {
            Subasta existente = repository.ObtenerPorNumeroSubasta(subasta.NumeroDeSubasta);
            if (existente == null)
            {
                return false;
            }
            repository.ModificarSubasta(subasta);
            return true;
        }
        public bool ActualizarUltimaPuja(Subasta subasta)
        {
            Subasta existente = repository.ObtenerPorNumeroSubasta(subasta.NumeroDeSubasta);
            if (existente == null)
            {
                return false;
            }
            repository.ActualizarUltimaPuja(subasta);
            return true;
        }

        //camino para registrar postor que va ganando
        public Subasta ObtenerPorNumero(int numeroSubasta)
        {
            return repository.ObtenerPorNumeroSubasta(numeroSubasta);
        }

    }
}
