# 🌿 VACApp – App de Turismo Responsable

**📝 Detalle:** App informativa sobre turismo en la ciudad, con enfoque en medio ambiente y turismo sostenible.

---

**Pantallas incluidas:**
1. Pantalla de inicio / menú de opciones / mensajes de concientización ambiental
2. Opciones: hoteles / gastronomía / playas / parques / actividades
3. Listado de parques
4. Listado de playas
4. Listado de actividades
4. Listado de hoteles
4. Listado de gastronomía
Cada lugar tiene su información (contacto, requisitos legales, ubicación)
---

## 🌱 Área y objetivo

- **Área:** Medio Ambiente  
- **Objetivo:** Fomentar hábitos responsables y promover la participación ciudadana en turismo sostenible

---

##  Público y casos de uso

- **Público:** Turistas generales y familias, principalmente en Argentina.  
- **Casos de uso:** Buscar hoteles, restaurantes, balnearios y conocer requisitos ambientales y legales.

---

## 📱 Tecnología

- **Android 16 (API 36 – Baklava)**  
- Ventajas: últimas mejoras en seguridad, rendimiento y experiencia de usuario.

---

## 👁️ Frontend (View Layer)

- **Tareas:**
  - Diseñar pantallas (XML o Jetpack Compose)  
  - Implementar navegación entre secciones  
  - Capturar eventos de usuario  
  - Mostrar datos de backend en listas, tarjetas y detalles

---

## 🧠 Backend (Controller + Service + Repository + Model)

- **Tareas:**
  - **Model:** Superclase `LugarTuristico` + subclases `Hotel`, `Restaurante`, `Balneario`  
  - **Repository:** Listas simuladas (top 10 por categoría)  
  - **Service:** Lógica de obtención y procesamiento de datos  
  - **Controller:** Coordina vista y servicio, maneja eventos

---

## 🔄 Flujo de navegación

```text
Pantalla de Inicio
 ├─ Opciones 
 ├─ Parques → Listado → Detalle
 ├─ Playas → Listado → Detalle
 ├─ Actividades → Listado → Detalle
 ├─ Hoteles → Listado → Detalle
 └─ Gastronomía → Listado → Detalle
 
```  

- Cada detalle incluye: contacto, ubicación en mapa y tips ambientales.

## 👥 Integrantes

- Yair Nasif
- Lucas Marques
- Ornela Baldini
