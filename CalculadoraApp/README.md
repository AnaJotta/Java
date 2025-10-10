CalculadoraApp

# 🖩 CalculadoraApp

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![GitHub last commit](https://img.shields.io/github/last-commit/AnaJotta/CalculadoraApp)


Una aplicación de consola en **Java** que permite realizar operaciones aritméticas (suma, resta, multiplicación y división) entre dos o más números.

---

## 🛠️ Características

- Menú interactivo en consola.
- Soporte para operar con **varios números** (no solo dos).
- Validaciones básicas (por ejemplo, evitar división entre cero).
- Uso de `Scanner` + conversión de cadenas (`parseDouble`, `parseInt`) para manejar entradas de usuario.

---

🧮 Uso de la calculadora


El programa muestra un menú con opciones:

- 1: Suma
- 2: Resta
- 3: Multiplicación
- 4: División
- 5: Salir

Pasos:

- Escoge una opción (por ejemplo, 1 para sumar).
- Ingresa cuántos números quieres operar (por ejemplo, 3).
- Ingresa los 3 números uno por uno.
- El programa mostrará el resultado conforme a la operación elegida.

---

📌 Notas importantes

- Al leer desde consola se usan métodos como nextLine() que devuelven String, por eso el programa convierte esos valores a int o double usando Integer.parseInt(...) o                       Double.parseDouble(...).
- En división, verifica que el divisor no sea cero para evitar errores.
- Este proyecto está pensado como práctica para entender la lectura de datos por consola, conversión de tipos y estructuras de control en Java.
