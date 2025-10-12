# 💼 Sueldo Empleados
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![GitHub last commit](https://img.shields.io/github/last-commit/AnaJotta/Java/main/sueldoEmpleados)](https://github.com/AnaJotta/Java/tree/main/sueldoEmpleados)

_Un sistema de gestión de sueldos de empleados en Java con interfaz de consola._

---

## 📌 Descripción

**Sueldo Empleados** es una aplicación Java que permite **gestionar la información salarial de empleados** mediante una interfaz de consola.  
Incluye operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre una lista en memoria.

Este proyecto combina **Java puro** con una estructura modular y clara separación de responsabilidades.

---

## ✍️ Características

- CRUD completo para empleados (agregar, listar, modificar y eliminar).<br>
- Cálculo de sueldos según diferentes criterios (horas trabajadas, salario base, bonificaciones).<br>
- Validación básica de datos (no permite campos vacíos).<br>
- Uso de colecciones para almacenamiento temporal.<br>
- Interfaz de consola interactiva.<br>
- Modularidad y reutilización del código.<br>

---

## 🛠 Tecnologías usadas

**Lenguaje:** Java (versión 8 o superior)<br>
**Almacenamiento:** En memoria (sin base de datos)<br>
**IDE recomendado:** IntelliJ IDEA, Eclipse o NetBeans<br>
**Sistema operativo:** Multiplataforma (Windows, macOS, Linux)<br>

---

## 🎯 Uso

Al iniciar el programa, se mostrará un menú con opciones:<br>

- Agregar Empleado<br>
- Listar Empleados<br>
- Modificar Empleado<br>
- Eliminar Empleado<br>
- Calcular Sueldo<br>
- Salir<br>

Elige la opción escribiendo el número correspondiente y pulsa Enter.<br>
Introduce los datos solicitados (nombre, horas trabajadas, salario base, bonificaciones).<br>
Las operaciones se realizan sobre una lista en memoria.<br>

---

## 📁 Estructura del proyecto

sueldoEmpleados/<br>
│<br>
├── src/<br>
│   ├── main/<br>
│   │   ├── java/<br>
│   │   │   ├── dominio/          ← Clases del modelo (Empleado.java)<br>
│   │   │   ├── servicio/         ← Lógica de negocio (CRUD, cálculos)<br>
│   │   │   └── presentacion/     ← Interfaz de usuario (consola)<br>
│   │   └── resources/            ← Configuración (si aplica)<br>
│   └── test/                     ← Pruebas unitarias<br>
│<br>
├── pom.xml / build.gradle         ← Archivo de construcción (si aplica)<br>
└── README.md                      ← Este archivo<br>

---

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar la aplicación, por favor sigue estos pasos:<br>

- Realiza un fork de este repositorio<br>
- Crea una nueva rama (`git checkout -b feature/nueva-caracteristica`)<br>
- Realiza tus cambios y haz commit de ellos (`git commit -am 'Añadir nueva característica'`)<br>
- Sube tus cambios a tu fork (`git push origin feature/nueva-caracteristica`)<br>
- Abre un pull request describiendo tus cambios<br>

---

## 💡 Ideas de mejora

✔ Validaciones más robustas: evitar datos vacíos o valores inválidos<br>
✔ Persistencia real con base de datos (MySQL, SQLite)<br>
✔ Interfaz gráfica: añadir GUI con Swing o JavaFX<br>
✔ Filtros de búsqueda: por nombre, departamento o salario<br>
✔ Exportar/Importar datos: permitir JSON o CSV<br>
✔ Registro de actividad: guardar historial de operaciones realizadas<br>
✔ Manejo de errores y logs: implementar logging con Java Logger o Log4j<br>
✔ Tests unitarios: aumentar cobertura de pruebas para la lógica de negocio<br>
✔ Internacionalización: permitir múltiples idiomas en la UI<br>
✔ Documentación del código: Javadoc completo para clases y métodos<br>

---

## 📜 Licencia

Este proyecto está bajo la licencia MIT.<br>

---

## 📬 Contacto

Autor: [Ana Jessica](https://github.com/AnaJotta)<br>
Repositorio principal: [Java](https://github.com/AnaJotta/Java)<br>
Correo / redes: <br> [<img src="https://img.icons8.com/color/48/000000/gmail.png" width="24" />](mailto:anajessicamarinmorales@gmail.com)[<img src="https://img.icons8.com/color/48/000000/linkedin.png" width="24" />](https://www.linkedin.com/in/ana-j-marin-morales/)
