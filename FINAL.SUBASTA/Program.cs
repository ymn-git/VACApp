using FINAL.SUBASTA.Views;

namespace FINAL.SUBASTA
{
    internal static class Program
    {
        /// <summary>
        ///  The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            // To customize application configuration such as set high DPI settings or default font,
            // see https://aka.ms/applicationconfiguration.
            ApplicationConfiguration.Initialize();
            Application.Run(new PostorView());
        }
        /* PREGUNTAR SOBRE ESO
        [STAThread]
        static void Main()
        {
            ApplicationConfiguration.Initialize();

            // Crear ambas vistas
            SubastadorView subastadorView = new SubastadorView();
            PostorView postorView = new PostorView();

            // Mostrar ambas ventanas
            subastadorView.Show();
            Application.Run(postorView); // Esta será la principal (bloqueante)
        }
        */
    }
}