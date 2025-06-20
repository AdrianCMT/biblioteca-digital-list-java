# 📚 Sistema de Biblioteca DigitalAdd commentMore actions

Aplicación de línea de comandos desarrollada en Java con enfoque en programación orientada a objetos para la gestión de una biblioteca digital.

## 🎯 Características

- 📌 Registro completo de libros (alta, consulta, modificación y eliminación)
- 🔎 Filtros de búsqueda por título, autor o número ISBN
- 📊 Reportes estadísticos sobre la lectura
- 🖥️ Interfaz amigable mediante consola
- 👥 Soporte para múltiples autores por libro
- ⏰ Registro de horas dedicadas a la lectura

## 🏗️ Estructura del Proyecto

```
project-java-herencia-poo/
├── src/
│   ├── LibraryApp.java
│   └── com/
│       └── sena/
│           └── app/
│               └── models/
│                   └── Book.java
├── bin/
├── docs/
└── README.md
```

## 🚀 Cómo ejecutar

1. Compilar el proyecto:
```bash
javac -d bin src/LibraryApp.java src/com/sena/app/models/Book.java
```

2. Ejecutar la aplicación:
```bash
java -cp bin LibraryApp
```

## 📋 Funcionalidades

➕ Alta de libros: Permite ingresar nuevos registros con datos completos.
📚 Consulta general: Visualiza todos los libros en una tabla organizada.
✏️ Edición: Modifica campos específicos de cualquier libro.
❌ Eliminación: Borra libros existentes con confirmación previa.
🔍 Búsqueda: Encuentra libros según título, autor o ISBN.
📈 Análisis: Muestra totales, libros leídos y tiempo invertido.

## 🔧 Tecnologías

- Java SE
- Programación Orientada a Objetos
- Collections Framework
- Scanner para entrada de usuario

## 👨‍💻 Desarrollo

Proyecto desarrollado usando GitFlow para control de versiones y metodología incremental.