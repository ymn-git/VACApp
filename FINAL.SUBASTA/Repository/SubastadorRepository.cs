using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FINAL.SUBASTA.Model.Entities;

namespace FINAL.SUBASTA.Repository
{
    internal class SubastadorRepository
    {
        private readonly List<Subastador> subastadores;
        public SubastadorRepository()
        {
            subastadores = new List<Subastador>();
        }
        public List<Subastador> ObtenerTodos()
        {
            return subastadores;
        }
        public Subastador ObtenerPorEmail(string email)
        {
            for (int i = 0; i < subastadores.Count; i++)
            {
                if (subastadores[i].Email == email)
                {
                    return subastadores[i];
                }
            }

            return null;
        }
        public void Agregar(Subastador subastador)
        {
            subastadores.Add(subastador);
        }

        public void Eliminar(string email)
        {
            int indice = -1;
            for (int i = 0; i < subastadores.Count; i++)
            {
                if (subastadores[i].Email == email)
                {
                    indice = i;
                    break;
                }
            }
            if (indice >= 0)
            {
                subastadores.RemoveAt(indice);
            }
        }

        public void ModificarSubastador(Subastador subastador)
        {
            for (int i = 0; i < subastadores.Count; i++)
            {
                if (subastadores[i].Email == subastador.Email)
                {
                    subastadores[i].Name = subastador.Name;
                    break;
                }
            }
        }
    }
}
