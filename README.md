# 💡 Torox Systems Simulator

Simulación de gestión de sistemas tecnológicos para **ToroxCity**.

Este proyecto está escrito en Java puro y orientado a practicar programación orientada a objetos (POO), incluyendo:
- Clases abstractas
- Herencia
- Polimorfismo
- Encapsulamiento
- CRUD básico en consola

---

## 🔧 Estructura del Proyecto

- `SistemaTorox.java`: clase abstracta base con lógica común para todos los sistemas.
- `SistemaSeguridad.java`: subclase con atributo de nivel de seguridad.
- `SistemaTransporte.java`: subclase con cantidad de unidades de transporte activas.
- `SistemaEnergia.java`: subclase con tipo de fuente energética.
- `GestorDeSistemas.java`: clase que permite crear, almacenar, listar y editar sistemas.
- `Main.java`: punto de entrada, menú en consola para interactuar con el sistema.

---

## 🚀 Cómo correr el proyecto

1. Abre el proyecto en IntelliJ (o tu IDE preferido).
2. Ejecuta la clase `Main`.
3. Usa el menú para:
    - Crear sistemas personalizados
    - Visualizar los sistemas registrados
    - Eliminar o editar sistemas registrados

---

## ✅ Requisitos

- Java 8 o superior

---

## 🧪 Funciones

- Permite edición de sistemas por ID y por nombre
- Permite eliminación de sistemas por ID y por nombre
- Persistencia de datos con archivos o base de datos (por implementar)
- Conexión con un frontend o juego como Roblox (por implementar)

---

**Este proyecto simula la lógica base de un backend y sirve como demostración para perfil Java Jr. orientado a desarrollo de sistemas.**
