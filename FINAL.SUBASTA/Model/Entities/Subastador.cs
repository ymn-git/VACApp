using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FINAL.SUBASTA.Model.Entities
{
    public class Subastador
    {
        private string email;
        private string name;

        public Subastador(string email, string name)
        {
            this.email = Email;
            this.name = Name;
        }
        public string Email
        {
            get { return email; }
            set { email = value; }
        }

        public string Name
        {
            get { return name; }
            set { name = value; }
        }
    }
}
