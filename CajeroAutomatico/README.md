# 🏧 CajeroAutomatico

Proyecto que simula el funcionamiento de un **cajero automático** con operaciones de saldo, retiro y depósito, con diferentes modos de usuario (cliente / administrador).

---

## 🛠️ Características

- **Autenticación por PIN de 4 dígitos**  
- **Operaciones permitidas:**  
  - Consulta de saldo  
  - Retiro de efectivo  
  - Depósito de fondos  
- **Modo administrador / técnico con funciones especiales:**  
  - Mostrar transacciones registradas  
  - Vaciar registro de transacciones  
  - Rellenar el cajero con efectivo  
  - Alarmas si hay bajo efectivo  
- **Registro de transacciones persistente (por ejemplo en archivo o base de datos)**

---

## 📂 Estructura del proyecto (esquema)

CajeroAutomatico/
│
├── src/ # Código fuente del programa<br>
│ └── … # Clases o scripts según el lenguaje elegido<br>
├── data/ # Archivos de datos, registros, historial<br>
├── docs/ # Documentación adicional (diagramas, requisitos)<br>
└── README.md # Este archivo de presentación<br>

---

## 📋 Uso / Ejecución

1. Clona el repositorio:
   ```bash
   git clone https://github.com/AnaJotta/CajeroAutomatico.git
   
2. En tu IDE o intérprete (según el lenguaje) abre el proyecto.

3.Ejecuta el programa principal, por ejemplo:
java -jar CajeroAutomatico.jar

4. Sigue las instrucciones del menú:
Ingresa el PIN (usuario o admin)
Realiza operaciones de consulta, retiro, depósito o gestión admin

---

## 💡 Ideas de mejora

- Validaciones más estrictas (importe negativo, límites)

- Manejo de múltiples usuarios

- Interfaz gráfica (GUI)

- Integración con base de datos real (MySQL, SQLite)

- Autenticación cifrada

- Logger con niveles (INFO, ERROR, DEBUG)

---

📄 Licencia
Este proyecto está bajo licencia MIT 
