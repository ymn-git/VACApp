using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FINAL.SUBASTA.Model.Entities;

namespace FINAL.SUBASTA.Repository
{
    public class    SubastaRepository
    {
        private readonly List<Subasta> subastas;
        public SubastaRepository()
        {
            subastas = new List<Subasta>();
        }
        public List<Subasta> ObtenerTodos()
        {
            return subastas;
        }
        public Subasta ObtenerPorNumeroSubasta(int numeroSubasta)
        {
            for (int i = 0; i < subastas.Count; i++)
            {
                if (subastas[i].NumeroDeSubasta == numeroSubasta)
                {
                    return subastas[i];
                }
            }

            return null;
        }
        public void Agregar(Subasta subasta)
        {
            subastas.Add(subasta);
        }

        public void Eliminar(int numeroSubasta)
        {
            int indice = -1;
            for (int i = 0; i < subastas.Count; i++)
            {
                if (
                    subastas[i].NumeroDeSubasta == numeroSubasta)
                {
                    indice = i;
                    break;
                }
            }
            if (indice >= 0)
            {
                subastas.RemoveAt(indice);
            }
        }

        public void ModificarSubasta(Subasta subasta)
        {
            for (int i = 0; i < subastas.Count; i++)
            {
                if (subastas[i].NumeroDeSubasta == subasta.NumeroDeSubasta)
                {
                    subastas[i].PujaInicial = subasta.PujaInicial;
                    subastas[i].Subastador = subasta.Subastador;
                    subastas[i].ArticuloPorSubastar = subasta.ArticuloPorSubastar;
                    break;
                }
            }
        }
        public void ActualizarUltimaPuja(Subasta subasta)
        {
            for (int i = 0; i < subastas.Count; i++)
            {
                if (subastas[i].NumeroDeSubasta == subasta.NumeroDeSubasta)
                {
                    subastas[i].UltimaPuja = subasta.UltimaPuja;

                    break;
                }
            }
        }
    }
}
