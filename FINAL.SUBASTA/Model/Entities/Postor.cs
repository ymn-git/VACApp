using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FINAL.SUBASTA.Model.Entities
{
    public class Postor
    {
        string email;
        string name;
        bool subastaGanada;
        Subasta subastaSeleccionada;

        //constructor
        public Postor(string email, string name)
        {
            Email = email;
            Name = name;
            this.subastaGanada = false;
        }
        public Postor(string name) { Name = name; }
        //propiedades
        public string Email { get { return email; } set { email = value; } }
        public string Name { get { return name; }  set { name = value; } }
        public bool SubastaGanada
        {
            get { return subastaGanada; }
            set { subastaGanada = value; }
        }
        public Subasta SubastaSeleccionada
        {
            get { return subastaSeleccionada; }
            set { subastaSeleccionada = value; }
        }

    }
}
