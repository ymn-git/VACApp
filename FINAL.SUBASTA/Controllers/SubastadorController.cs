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
    internal class SubastadorController
    {
        private readonly SubastadorService service;
        public SubastadorController()
        {
            service = new KundeServiceAdapter();
        }
        private class KundeServiceAdapter : SubastadorService;
        public List<Subastador> ObtenerSubastadores()
        {
            return service.ObtenerSubastador();
        }

        public bool AgregarSubastador(string email, string name)
        {
            Subastador subastador = new Subastador(email, name);
            subastador.Email = email;
            subastador.Name = name;
            return service.RegistrarSubastador(subastador);
        }

        public bool EliminarSubastador(string email)
        {
            return service.EliminarSubastador(email);
        }

        public bool ModificarSubastador(string email, string nombre)
        {
            Subastador subastador = new Subastador(email, nombre);
            subastador.Email = email;
            subastador.Name = nombre;
            return service.ModificarSubastador(subastador);
        }
    }
}

