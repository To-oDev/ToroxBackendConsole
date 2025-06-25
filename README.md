# 💡 Torox Systems Simulator

Simulación de gestión de sistemas tecnológicos para una ciudad futurista: **ToroxCity**.

Este proyecto está escrito en Java puro y orientado a practicar programación orientada a objetos (POO), incluyendo:
- Clases abstractas
- Herencia
- Polimorfismo
- Encapsulamiento
- CRUD básico en consola

---

## 🔧 Estructura del Proyecto

- `SistemaTorox.java`: clase abstracta base con lógica común para todos los sistemas.
- `SistemaSeguridad.java`: subclase con atributo de nivel de amenaza.
- `SistemaTransporte.java`: subclase con cantidad de unidades de transporte.
- `SistemaEnergia.java`: subclase con tipo de fuente energética.
- `GestorDeSistemas.java`: clase que permite crear, almacenar, listar y controlar sistemas.
- `Main.java`: punto de entrada, menú en consola para interactuar con el sistema.

---

## 🚀 Cómo correr el proyecto

1. Abre el proyecto en IntelliJ (o tu IDE preferido).
2. Ejecuta la clase `Main`.
3. Usa el menú para:
    - Crear sistemas personalizados
    - Visualizar los sistemas registrados

---

## ✅ Requisitos

- Java 8 o superior
- (Opcional) Maven, si deseas convertirlo en proyecto con dependencias más adelante

---

## 🧪 Ideas para extender

- Permitir edición de sistemas por ID
- Permitir eliminación
- Persistencia de datos con archivos o base de datos
- Conexión con un frontend o juego como Roblox

---

**Este proyecto simula la lógica base de un backend y sirve como demostración para perfiles Java Jr. orientados a desarrollo de sistemas.**
