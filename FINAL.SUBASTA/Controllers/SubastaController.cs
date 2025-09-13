using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FINAL.SUBASTA.Model.Entities;
using FINAL.SUBASTA.Controllers;
using FINAL.SUBASTA.Services;
using FINAL.SUBASTA.Repository;

namespace FINAL.SUBASTA.Controllers
{
    public class SubastaController
    {
        private readonly SubastaService service;
        private readonly PostorService postorService;
        

        public SubastaController()
        {
            service = new KundeServiceAdapter();
            this.postorService = new PostorService();
        }
        private class KundeServiceAdapter : SubastaService;

        public List<Subasta> ObtenerSubastas()
        {
            return service.ObtenerSubastas();
        }

        public bool AgregarSubasta(string nombreSubastador, string emailSubastador, string nombreArticulo, string detalleArticulo, int montoInicial)
        {
            Subastador subastador = new Subastador(nombreSubastador,emailSubastador);
            subastador.Name = nombreSubastador;
            subastador.Email = emailSubastador;

            Articulo articulo = new Articulo(nombreArticulo,detalleArticulo);
            articulo.Name = nombreArticulo;
            articulo.Detalle = detalleArticulo;

            Subasta subasta = new Subasta(montoInicial, subastador, articulo);
            return service.RegistrarSubasta(subasta);
        }
        public bool ModificarSubasta(string nombreSubastador, string emailSubastador, string nombreArticulo, string detalleArticulo, int montoInicial)
        {
            Subastador subastador = new Subastador(nombreSubastador, emailSubastador);
            subastador.Name = nombreSubastador;
            subastador.Email = emailSubastador;

            Articulo articulo = new Articulo(nombreArticulo, detalleArticulo);
            articulo.Name = nombreArticulo;
            articulo.Detalle = detalleArticulo;

            Subasta subasta = new Subasta(montoInicial, subastador, articulo);
            return service.ModificarSubasta(subasta);
        }

        public bool EliminarSubasta(int numeroSubasta)
        {
            return service.EliminarSubasta(numeroSubasta);
        }

        //camino para registrar postor que va ganando
        public bool RegistrarPuja(int numeroSubasta, string emailPostor)
        {
            Subasta subasta = service.ObtenerPorNumero(numeroSubasta);
            Postor postor = postorService.ObtenerPorEmail(emailPostor);

            if (subasta == null || postor == null) return false;

            subasta.RegistrarPuja(postor); // Actualiza monto y postor
            return service.ActualizarUltimaPuja(subasta); // Persiste el cambio
        }


    }
    }

