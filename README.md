# 🌿 VACApp – App de Turismo Responsable

**📝 Detalle:** App informativa sobre turismo en la ciudad, con enfoque en medio ambiente y turismo sostenible.

---

## 🎨 Diseño y estilo

- **Colores:** Verde (`#4CAF50`), Amarillo (`#FFEB3B`), Fondo suave (`#FAFAFA`)  
- **Tipografías:** Títulos en *Roboto Slab Bold*, texto en *Roboto Regular*  
- **Iconos:** claros y simples para hoteles, restaurantes y balnearios  
- **Estilo:** limpio, moderno y accesible

---

**Pantallas incluidas:**
1. Pantalla principal / menú de opciones
2. Listado de hoteles
3. Listado de restaurantes
4. Listado de balnearios
5. Detalle de cada lugar (contacto, requisitos legales, ubicación)
6. Sección de información ambiental / tips sostenibles

---

## 🌱 Área y objetivo

- **Área:** Medio Ambiente  
- **Objetivo:** Fomentar hábitos responsables y promover la participación ciudadana en turismo sostenible

---

## 👨👩👧 Público y casos de uso

- **Público:** Turistas generales y familias, principalmente en Argentina.  
- **Casos de uso:** Buscar hoteles, restaurantes, balnearios y conocer requisitos ambientales y legales.

---

## 📱 Tecnología

- **Android 16 (API 36 – Baklava)**  
- Ventajas: últimas mejoras en seguridad, rendimiento y experiencia de usuario.

---

## 👁️ Frontend (View Layer)

- **Responsable:** 1 persona  
- **Tareas:**
  - Diseñar pantallas (XML o Jetpack Compose)  
  - Implementar navegación entre secciones  
  - Capturar eventos de usuario  
  - Mostrar datos de backend en listas, tarjetas y detalles

---

## 🧠 Backend (Controller + Service + Repository + Model)

- **Responsables:** 2 personas  
- **Tareas:**
  - **Model:** Superclase `LugarTuristico` + subclases `Hotel`, `Restaurante`, `Balneario`  
  - **Repository:** Listas simuladas (top 10 por categoría)  
  - **Service:** Lógica de obtención y procesamiento de datos  
  - **Controller:** Coordina vista y servicio, maneja eventos

---

## 🔄 Flujo de navegación

```text
Pantalla principal
 ├─ Hoteles → Listado → Detalle
 ├─ Restaurantes → Listado → Detalle
 └─ Balnearios → Listado → Detalle
```  

- Cada detalle incluye: contacto, ubicación en mapa y tips ambientales.

## 👥 Integrantes

- Yair Nasif
- Lucas Marques
- Ornela Baldini
