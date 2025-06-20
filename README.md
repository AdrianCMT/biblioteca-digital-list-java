
# 📋 Especificaciones Técnicas - Biblioteca Digital v1.0.0

## 🏗️ Arquitectura del Sistema

### Estructura de Paquetes
```
src/
├── LibraryApp.java              # Punto de entrada del programa
└── com/sena/app/models/
    └── Book.java                # Clase que representa el modelo de libro
```

### Diagrama de Clases
```
┌─────────────────────────────┐
│            Book             │
├─────────────────────────────┤
│ - id: int                   │
│ - title: String             │
│ - edititionDate: String     │
│ - editorial: String         │
│ - isbn: String              │
│ - authors: List<String>     │
│ - readed: boolean           │
│ - timeReaded: int           │
├─────────────────────────────┤
│ + Book(title, date, ...)    │
│ + getId(): int              │
│ + getTitle(): String        │
│ + setTitle(String): void    │
│ + ... (getters/setters)     │
│ + toString(): String        │
└─────────────────────────────┘
```

## 🔧 Funcionalidades Implementadas

### CRUD Completo
- ✅ **Create**: Registro de libros con validación de campos
- ✅ **Read**: Visualización de libros en formato de tabla
- ✅ **Update**: Modificación de datos específicos de cada libro
- ✅ **Delete**: Eliminación de libros con confirmación del usuario

### Funcionalidades Avanzadas
- 🔍 **Búsqueda**: Filtrado por título, autor o ISBN
- 📊 **Estadísticas**: Información agregada sobre libros leídos y tiempo
- 📋 **Tabla formateada**: Presentación estética y clara de los datos
- 🎯 **Validaciones**: Control sobre entradas incorrectas del usuario

## 📊 Métricas del Proyecto

### Líneas de Código
- **Total estimado**: ~400 líneas
- **Número de clases**: 2 (`LibraryApp`, `Book`)
- **Cantidad de métodos**: Más de 15

### Nivel de Complejidad
- Menú de opciones con navegación en múltiples niveles
- Distintos tipos de búsqueda
- Cálculo de estadísticas como horas leídas, libros leídos, etc.

## 🧪 Datos de Prueba Incluidos

1. **Effective Java** - Joshua Bloch (leído, 15h)  
2. **Clean Code** - Robert C. Martin (leído, 12h)  
3. **Design Patterns** - Gang of Four (no leído)  
4. **Spring in Action** - Craig Walls (leído, 8h)  
5. **Java: The Complete Reference** - Herbert Schildt (no leído)  

## 🚀 Instrucciones de Compilación y Ejecución

### Compilación
```bash
javac -d bin src/LibraryApp.java src/com/sena/app/models/Book.java
```

### Ejecución
```bash
java -cp bin LibraryApp
```

## 🛠️ Tecnologías Utilizadas

- Java SE 8+
- ArrayList y estructuras del Collections Framework
- Scanner para entrada del usuario
- printf para formatear la salida

## 📈 Posibles Mejoras Futuras

1. Persistencia de datos en archivos o base de datos
2. Implementar interfaz gráfica (Swing o JavaFX)
3. Validaciones más estrictas (fechas, ISBN)
4. Clasificación por categorías o géneros
5. Gestión de préstamos de libros
6. Exportación a PDF o Excel
7. Configuración por archivo de propiedades

## 🔒 Consideraciones de Seguridad

- Validación de entradas del usuario
- Manejo de errores con try/catch
- Restricción de tamaños y tipos de entrada
