# 💻 VentaComputadorasApp
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![GitHub last commit](https://img.shields.io/github/last-commit/AnaJotta/VentaComputadorasApp)](https://github.com/AnaJotta/Java/tree/main/VentaComputadorasApp)

_Un sistema de gestión de ventas de computadoras en Java con conexión a base de datos._

---

## 📌 Descripción

**VentaComputadorasApp** es una aplicación Java que permite **gestionar la información de ventas de computadoras** mediante una interfaz de consola.  
Incluye operaciones CRUD (Crear, Leer, Actualizar y Eliminar) conectadas a una **base de datos relacional**.

Este proyecto combina **Java puro** con **JDBC (Java Database Connectivity)**, demostrando el patrón de diseño MVC (Modelo - Vista - Controlador) y una separación clara de capas.

---

## 🗄️ Arquitectura y Base de Datos

El sistema utiliza una **base de datos MySQL** (puede adaptarse fácilmente a otras, como PostgreSQL).  
A través de JDBC, se realiza la conexión, ejecución de consultas SQL y manejo de transacciones.

**📘 Estructura de la base de datos:**

CREATE DATABASE venta_computadoras;

USE venta_computadoras;

CREATE TABLE computadoras (
    id_computadora INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(100) NOT NULL,
    modelo VARCHAR(100) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    stock INT NOT NULL
);

---

## 🧩 Capa de persistencia (DAO):
Conecta con la base de datos usando JDBC.<br>
Contiene las operaciones CRUD sobre la tabla computadoras.<br>
Usa PreparedStatements para prevenir inyecciones SQL.<br>

---

## 🔗 Configuración de conexión
Asegúrate de editar los parámetros de conexión según tu entorno en la clase de configuración:

java
Copiar código
private static final String URL = "jdbc:mysql://localhost:3306/venta_computadoras";
private static final String USER = "root";
private static final String PASSWORD = "tu_contraseña";

---

## ✍️ Caracteristicas
Conexión directa a base de datos MySQL mediante JDBC.<br>

CRUD completo para computadoras (agregar, listar, modificar y eliminar).<br>

Validación de datos y manejo de excepciones.<br>

Arquitectura por capas: Modelo, DAO, Servicio, UI.<br>

Modularidad y reutilización del código.<br>

Facilidad para migrar a otros motores de base de datos.<br>

---

## 🛠 Tecnologias usadas
Lenguaje: Java (versión 8 o superior)<br>
Base de datos: MySQL<br>
Librerías: JDBC<br>
IDE recomendado: IntelliJ IDEA, Eclipse o NetBeans<br>
Sistema operativo: Multiplataforma (Windows, macOS, Linux)<br>

---

## 🎯 Uso
Al iniciar el programa, se mostrará un menú con opciones:<br>

- Agregar Computadora<br>

- Listar Computadoras<br>

- Modificar Computadora<br>

- Eliminar Computadora<br>

- Salir<br>

Elige la opción escribiendo el número correspondiente y pulsa Enter.<br>
Introduce los datos solicitados (marca, modelo, precio, stock).<br>
Las operaciones se reflejan directamente en la base de datos.<br>

## 📁 Estructura del proyecto
VentaComputadorasApp/<br>
│<br>
├── src/<br>
│ ├── main/<br>
│ │ ├── java/<br>
│ │ │ ├── dominio/ ← Clases del modelo (Computadora.java)<br>
│ │ │ ├── datos/ ← Clases DAO (manejo de base de datos)<br>
│ │ │ ├── servicio/ ← Lógica de negocio (CRUD, validaciones)<br>
│ │ │ └── presentacion/ ← Interfaz de usuario (consola)<br>
│ │ └── resources/ ← Configuración (parámetros de conexión, SQL)<br>
│ └── test/ ← Pruebas unitarias<br>
│<br>
├── pom.xml / build.gradle ← Archivo de construcción (si aplica)<br>
└── README.md ← Este archivo<br>

---

## 🤝 Contribuciones
Las contribuciones son bienvenidas. Si deseas mejorar la aplicación, por favor sigue estos pasos:<br>

Realiza un fork de este repositorio<br>

Crea una nueva rama (git checkout -b feature/nueva-caracteristica)<br>

Realiza tus cambios y haz commit de ellos (git commit -am 'Añadir nueva característica')<br>

Sube tus cambios a tu fork (git push origin feature/nueva-caracteristica)<br>

Abre un pull request describiendo tus cambios<br>

---

## 💡 Ideas de mejora
✔ Validaciones más robustas: evitar datos vacíos o valores inválidos<br>
✔ Mejorar la persistencia: integrar base de datos real (MySQL, SQLite)<br>
✔ Interfaz gráfica: añadir GUI con Swing o JavaFX<br>
✔ Filtros de búsqueda: por marca, modelo o precio<br>
✔ Exportar/Importar datos: permitir JSON o CSV<br>
✔ Registro de actividad: guardar historial de operaciones realizadas<br>
✔ Manejo de errores y logs: implementar logging con Java Logger o Log4j<br>
✔ Tests unitarios: aumentar cobertura de pruebas para la lógica de negocio<br>
✔ Internacionalización: permitir múltiples idiomas en la UI<br>
✔ Documentación del código: Javadoc completo para clases y métodos<br>

---

📜 Licencia
Este proyecto está bajo la licencia MIT.<br>

---

## 📬 Contacto
Autor: [Ana Jotta](https://github.com/AnaJotta)<br>
Repositorio principal: [Java](https://github.com/AnaJotta/Java)<br>
Correo / redes: [![Email](https://img.shields.io/badge/Email-Contact-red?style=flat-square&logo=gmail&logoColor=white)](mailto:anajessicamarinmorales@gmail.com)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=flat-square&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/ana-j-marin-morales/)
