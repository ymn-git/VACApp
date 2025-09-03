IDEA:
Nombre (VACApp)
Detalle: app informativa de turismo de la ciudad

FORMATO:
La app presenta un menu de opciones sobre áreas de turismo de la ciudad. El usuario puede seleccionar una de las opciones y se despliega un listado con toda la info correspondiente y su respectivo contacto.
Se trabaja con modelo MVC almacenando las opciones en Repositorios (dejando la opcion a conectar base de datos)
Segun el area de turismo seleccionada la app brindara info relativa a los requerimientos legales que implica la misma con respecto al medioambiente.

MODALIDAD DE TRABAJO EN EQUIPO:
Idealmente se trabajará por medio de GitHub, en su defecto se subirá a un repositorio una vez finalizado.

AREA:
Medio Ambiente
objetivo: Fomentar habitos responsables y participación ciudadana en el cuidado ambiental y/o turismo

PUBLICO Y CASOS DE USO:
Turismo general/familiar principalmente de Argentina

TECNOLOGÍA SELECCIONADA:
Android 16 (API nivel 36), también conocido como Baklava, es la versión más reciente del sistema operativo móvil de Google. Elegir esta versión permite que la app esté alineada con las últimas innovaciones del ecosistema Android, incluyendo mejoras en rendimiento, seguridad y experiencia de usuario.

👁️ Frontend (View Layer)
Responsable: 1 persona
Tareas:
- Diseñar las pantallas (XML o Jetpack Compose).
- Implementar navegación entre secciones (hoteles, restaurantes, balnearios).
- Capturar eventos de usuario (clics, selección de categoría).
- Mostrar los datos que vienen del backend en listas, tarjetas, etc.

🧠 Backend (Controller + Service + Repository + Model)
Responsables: 2 personas
Tareas:
- Model: Crear la superclase LugarTuristico y las subclases (Hotel, Restaurante, Balneario).
- Repository: Generar las listas de objetos simulados (los 10 mejores de cada tipo).
- Service: Encapsular la lógica para obtener y procesar los datos.
- Controller: Coordinar entre la vista y el servicio, responder a eventos.
