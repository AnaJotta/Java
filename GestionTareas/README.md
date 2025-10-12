# 📋 GestiónTareas
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![GitHub last commit](https://img.shields.io/github/last-commit/AnaJotta/CatalogoPeliculasApp)

_Un sistema simple para la gestión de tareas en Java._

---

## 📌 Descripción

Este proyecto ofrece una aplicación sencilla para **crear, modificar, listar y eliminar tareas**.  
Está pensado como ejemplo educativo o como base para proyectos más complejos de gestión de tareas.

Posee una interfaz de consola (o gráfica, según la versión del proyecto) para interactuar con el usuario, persistencia (por ejemplo, con ficheros o base de datos) y lógica de negocio modular.


---

## 🚀 Características

- Crear nuevas tareas con título, descripción, fecha límite y prioridad.  
- Modificar detalles de tareas existentes.  
- Marcar tareas como completadas o pendientes.  
- Eliminar tareas.  
- Listado de todas las tareas, con filtros posibles (por estado, prioridad, fechas).  
- Persistencia local (ficheros o base de datos).  
- Validaciones de datos de entrada (fechas, campos obligatorios, etc.).



---

## 🛠 Tecnologías usadas

- **Lenguaje:** Java (versión 8 o superior)  
- **IDE recomendado:** IntelliJ IDEA, Eclipse o NetBeans  
- **Dependencias:**  
  - Librerías estándar de Java  
  - (Opcional) Bibliotecas para manejo de ficheros, JSON o JDBC  
- **Sistema operativo:** Multiplataforma (Windows, macOS, Linux)

---

## 📥 Instalación

1. Clona este repositorio:
git clone https://github.com/AnaJotta/Java.git

2. Entra al directorio del proyecto:
cd Java/GestionTareas
(Opcional) Si usas Maven:
mvn clean install

3.Compila y ejecuta el proyecto:

### Ejemplo
javac -d bin src/**/*.java
java -cp bin paquete.principal.ClasePrincipal
O simplemente ejecútalo desde tu IDE favorito.



---

## 🎯 Uso
Al iniciar el programa, se mostrará un menú con opciones:

- Crear Tarea

- Ver Tareas

- Modificar Tarea

- Eliminar Tarea

- Marcar como Completada

- Salir

Elige la opción escribiendo el número correspondiente y pulsa Enter.<br>
Sigue las indicaciones (introducir nombre, descripción, fecha, prioridad…).<br>
Los cambios se guardan automáticamente (según tu configuración).<br>

[⬆️ Volver al índice](#🧾-indice)

---

## 📁 Estructura del proyecto
css
Copiar código
GestionTareas/<br>
│
├── src/<br>
│   ├── main/<br>
│   │   ├── java/<br>
│   │   │   ├── modelo/         ← Clases de entidad (Tarea, Usuario, etc.)<br>
│   │   │   ├── persistencia/   ← Clases de acceso a datos (DAO, repositorios)<br>
│   │   │   └── ui/             ← Interfaz de usuario (consola, GUI)<br>
│   │   └── resources/          ← Archivos de configuración o ficheros de datos<br>
│   └── test/                   ← Pruebas unitarias<br>
│
├── pom.xml / build.gradle       ← Archivo de construcción (si aplica)<br>
└── README.md                    ← Este archivo<br>




---


## 👏 Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar la aplicación, por favor sigue estos pasos:

- Realiza un fork de este repositorio
- Crea una nueva rama (git checkout -b feature/nueva-caracteristica).
- Realiza tus cambios y haz commit de ellos (git commit -am 'Añadir nueva característica').
- Sube tus cambios a tu fork (git push origin feature/nueva-caracteristica).
- Abre un pull request describiendo tus cambios.



---

## 📜 Licencia
Este proyecto está bajo la licencia MIT.


---

## 📬 Contacto
Autor: [Ana Jotta](https://github.com/AnaJotta)<br>
Repositorio principal: [Java](https://github.com/AnaJotta/Java)<br>
Correo / redes: [![Email](https://img.shields.io/badge/Email-Contact-red?style=flat-square&logo=gmail&logoColor=white)](mailto:anajessicamarinmorales@gmail.com)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=flat-square&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/ana-j-marin-morales/)



