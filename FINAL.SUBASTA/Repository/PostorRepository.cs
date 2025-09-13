using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FINAL.SUBASTA.Model.Entities;

namespace FINAL.SUBASTA.Repository
{
    public class PostorRepository
    {
        private readonly List<Postor> postores;
        public PostorRepository()
        {
            postores = new List<Postor>();
        }
        public List<Postor> ObtenerTodos()
        {
            return postores;
        }
        public Postor ObtenerPorEmail(string email)
        {
            for (int i = 0; i < postores.Count; i++)
            {
                if (postores[i].Email == email)
                {
                    return postores[i];
                }
            }

            return null;
        }
        public void Agregar(Postor postor)
        {
            postores.Add(postor);

        }
        
        public void Eliminar(string email)
        {
            int indice = -1;
            for (int i = 0; i < postores.Count;i++)
            {
                if (postores[i].Email == email)
                {
                    indice = i;
                    break;
                }
            }
            if (indice >= 0)
            {
                postores.RemoveAt(indice);
            }
        }

        public void ModificarPostor(Postor postor)
        {
            for (int i = 0;i < postores.Count;i++)
            {
                if (postores[i].Email == postor.Email)
                {
                    postores[i].Name = postor.Name;
                    break;
                }
            }
        }
    }

}
