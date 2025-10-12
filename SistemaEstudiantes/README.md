# 🏫 SistemaEstudiantes
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
![GitHub last commit](https://img.shields.io/github/last-commit/AnaJotta/SistemaEstudiantes)

_Un sistema de gestión de estudiantes en Java con conexión a base de datos._

---

## 📌 Descripción

**SistemaEstudiantes** es una aplicación Java que permite **gestionar la información de estudiantes** mediante una interfaz de consola.  
Incluye operaciones CRUD (Crear, Leer, Actualizar y Eliminar) conectadas a una **base de datos relacional**.

Este proyecto combina **Java puro** con **JDBC (Java Database Connectivity)**, demostrando el patrón de diseño MVC (Modelo - Vista - Controlador) y una separación clara de capas.

---

## 🗄️ Arquitectura y Base de Datos

El sistema utiliza una **base de datos MySQL** (puede adaptarse fácilmente a otras, como PostgreSQL).  
A través de JDBC, se realiza la conexión, ejecución de consultas SQL y manejo de transacciones.

**📘 Estructura de la base de datos:**

CREATE DATABASE sistema_estudiantes;

USE sistema_estudiantes;

CREATE TABLE estudiantes (
    id_estudiante INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    telefono VARCHAR(15)

---    

## 🧩 Capa de persistencia (DAO):

Conecta con la base de datos usando JDBC.<br>

Contiene las operaciones CRUD sobre la tabla estudiantes.<br>

Usa PreparedStatements para prevenir inyecciones SQL.<br>

---

## 🔗 Configuración de conexión:
Asegúrate de editar los parámetros de conexión según tu entorno en la clase de configuración:

private static final String URL = "jdbc:mysql://localhost:3306/sistema_estudiantes";
private static final String USER = "root";
private static final String PASSWORD = "tu_contraseña";

---

## ✍️ Caracteristicas

- Conexión directa a base de datos MySQL mediante JDBC.

- CRUD completo para estudiantes (crear, listar, actualizar y eliminar).

- Validación de datos y manejo de excepciones.

- Arquitectura por capas: Modelo, DAO, Servicio, UI.

- Modularidad y reutilización del código.

- Facilidad para migrar a otros motores de base de datos.

---

## 🛠 Tecnologias usadas

**Lenguaje:** Java (versión 8 o superior)

**Base de datos:** MySQL

**Librerías:** JDBC

**IDE recomendado:** IntelliJ IDEA, Eclipse o NetBeans

**Sistema operativo:** Multiplataforma (Windows, macOS, Linux)

---


## 🎯 Uso

Al iniciar el programa, se mostrará un menú con opciones:

- Agregar Estudiante

- Listar Estudiantes

- Modificar Estudiante

- Eliminar Estudiante

- Salir

Elige la opción escribiendo el número correspondiente y pulsa Enter.

Introduce los datos solicitados (nombre, apellido, email, teléfono).

Las operaciones se reflejan directamente en la base de datos.

---

## 📁 Estructura del proyecto

SistemaEstudiantes/<br>
│
├── src/<br>
│   ├── main/<br>
│   │   ├── java/<br>
│   │   │   ├── dominio/          ← Clases del modelo (Estudiante.java)<br>
│   │   │   ├── datos/            ← Clases DAO (manejo de base de datos)<br>
│   │   │   ├── servicio/         ← Lógica de negocio (CRUD, validaciones)<br>
│   │   │   └── presentacion/     ← Interfaz de usuario (consola)<br>
│   │   └── resources/            ← Configuración (parámetros de conexión, SQL)<br>
│   └── test/                     ← Pruebas unitarias<br>
│
├── pom.xml / build.gradle         ← Archivo de construcción (si aplica)<br>
└── README.md                      ← Este archivo<br>


---


## 🤝 Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar la aplicación, por favor sigue estos pasos:

- Realiza un fork de este repositorio
- Crea una nueva rama (git checkout -b feature/nueva-caracteristica).
- Realiza tus cambios y haz commit de ellos (git commit -am 'Añadir nueva característica').
- Sube tus cambios a tu fork (git push origin feature/nueva-caracteristica).
- Abre un pull request describiendo tus cambios.

---

## 💡 Ideas de mejora

✔ Validaciones más robustas: evitar datos vacíos o valores inválidos<br>
✔ Mejorar la persistencia: integrar base de datos real (MySQL, SQLite)<br>
✔ Interfaz gráfica: añadir GUI con Swing o JavaFX<br>
✔ Filtros de búsqueda: por nombre, apellido o edad<br>
✔ Exportar/Importar datos: permitir JSON o CSV<br>
✔ Registro de actividad: guardar historial de operaciones realizadas<br>
✔ Manejo de errores y logs: implementar logging con Java Logger o Log4j<br>
✔ Tests unitarios: aumentar cobertura de pruebas para la lógica de negocio<br>
✔ Internacionalización: permitir múltiples idiomas en la UI<br>
✔ Documentación del código: Javadoc completo para clases y métodos<br>

---

## 📜 Licencia

Este proyecto está bajo la licencia MIT.

---

## 📬 Contacto
Autor: [Ana Jotta](https://github.com/AnaJotta)<br>
Repositorio principal: [Java](https://github.com/AnaJotta/Java)<br>
Correo / redes: [![Email](https://img.shields.io/badge/Email-Contact-red?style=flat-square&logo=gmail&logoColor=white)](mailto:anajessicamarinmorales@gmail.com)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=flat-square&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/ana-j-marin-morales/)
