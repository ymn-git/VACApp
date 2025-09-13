using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;
using FINAL.SUBASTA.Model.Entities;
using FINAL.SUBASTA.Services;

namespace FINAL.SUBASTA.Controllers
{
    public class PostorController
    {
        private readonly PostorService service;

        public PostorController()
        {
           service = new KundeServiceAdapter();
        }
        private class KundeServiceAdapter: PostorService;

        public List<Postor> ObtenerPostores()
        {
            return service.ObtenerPostores();
        }

        public bool AgregarPostor(string email, string name)
        {
            Postor postor = new Postor(email,name);
            postor.Email = email;
            postor.Name = name;
            return service.RegistrarPostor(postor);
        }

        public bool EliminarPostor(string email)
        {
            return service.EliminarPostor(email);
        }

        public bool ModificarPostor(string email, string nombre)
        {
            Postor postor = new Postor(email,nombre);
            postor.Email = email;
            postor.Name = nombre;
            return service.ModificarPostor(postor);
        }
    }
}
