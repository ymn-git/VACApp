using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FINAL.SUBASTA.Model.Entities
{
    public class Articulo
    {
        private static int contadorArticulos = 1;
        int numeroArticulo;
        string name;
        string detalle;

        public Articulo(string name, string detalle)
        {
            Name = name;
            this.detalle = detalle;
            this.numeroArticulo = contadorArticulos++;
        }

        public string Name { get { return name; } set { name = value; } }
        public string Detalle { get { return detalle; } set { detalle = value; } }

        public int NumeroArticulo
        {
            get { return numeroArticulo; }

        }
    }
}
