using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FINAL.SUBASTA.Model.Entities;

namespace FINAL.SUBASTA.Model.Entities
{
    public class Subasta
    {
        private static int contadorSubastas = 1;
        int numeroSubasta;
        decimal pujaInicial; // precio base
        decimal montoActual; // monto actualizado luego de cada puja
        decimal aumentoPorcentaje; // hay que cambiarlo por pujaDeAumento
        DateTime fechaInicio; // fecha y hora de inicio
        readonly TimeSpan duracion;
        Subastador subastador;
        Articulo articuloPorSubastar;
        Postor postorGanador; // acá se agrega el que va ganando cada vez que él puja (boton pujar click)
        List<Postor> postores;

        //constructor
        public Subasta(decimal pujaInicial, Subastador subastador, Articulo articuloPorSubastar)
        {
     
            this.numeroSubasta = contadorSubastas++;
            this.PujaInicial = pujaInicial;
            this.montoActual = pujaInicial;
            this.AumentoPorcentaje = 5;                   // Fijado por defecto
            this.FechaInicio = DateTime.Now;              // Automático
            this.duracion = TimeSpan.FromHours(24);       // Duración fija
            this.Subastador = subastador;                 // Carga automática del objeto
            this.ArticuloPorSubastar = articuloPorSubastar;
            this.postorGanador = null;                       // Arranca sin postores
        }
        //propiedades
        public int NumeroDeSubasta { get { return numeroSubasta; } }
        public decimal PujaInicial
        {
            get { return pujaInicial; }
            set
            {
                if (value < 1000 || value % 1000 != 0)
                    throw new ArgumentException("La puja inicial debe ser múltiplo de 1000 y mayor o igual a 1000.");
                pujaInicial = value;
            }
        }

        public decimal AumentoPorcentaje { get { return aumentoPorcentaje; } set { aumentoPorcentaje = value; } }
        public DateTime FechaInicio { set { fechaInicio = value; } get { return fechaInicio; } }

        public TimeSpan Duracion { get { return duracion; } } //no puse set por ser READONLY el atributo
        public Subastador Subastador
        {
            set { subastador = value; }
            get { return subastador; }
        }
        public Articulo ArticuloPorSubastar
        {
            get { return articuloPorSubastar; }
            set { articuloPorSubastar = value; }
        }
        public Postor PostorGanador
        {
            get { return postorGanador; }
            set { postorGanador = value; }
        }

        //metodos
        public bool SubastaFinalizada()
        {
            return DateTime.Now > fechaInicio + Duracion;

        }
        public void RegistrarPuja(Postor postor)
        {
            decimal aumento = Math.Ceiling(montoActual * aumentoPorcentaje / 100);
            montoActual += aumento;
            PostorGanador = postor;
        }

    }
}

