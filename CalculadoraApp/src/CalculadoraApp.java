import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        var salir = false;

        System.out.println("**** Aplicación Calculadora Números *****");

        while (!salir) {
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    salir = true;
                } else {
                    System.out.println("Opción errónea: " + operacion);
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
            System.out.println(); // salto de línea
        }
    }

    private static void mostrarMenu() {
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                """);
        System.out.println("¿Qué operación quieres realizar?");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.print("¿Cuántos números quieres operar? ");
        int n = Integer.parseInt(consola.nextLine());
        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = Double.parseDouble(consola.nextLine());
        }

        double resultado = numeros[0]; // inicializamos con el primer número

        switch (operacion) {
            case 1 -> { // Suma
                for (int i = 1; i < n; i++) {
                    resultado += numeros[i];
                }
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> { // Resta
                for (int i = 1; i < n; i++) {
                    resultado -= numeros[i];
                }
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> { // Multiplicación
                for (int i = 1; i < n; i++) {
                    resultado *= numeros[i];
                }
                System.out.println("Resultado Multiplicación: " + resultado);
            }
            case 4 -> { // División
                for (int i = 1; i < n; i++) {
                    if (numeros[i] == 0) {
                        System.out.println("Error: No se puede dividir entre 0.");
                        return;
                    }
                    resultado /= numeros[i];
                }
                System.out.println("Resultado División: " + resultado);
            }
        }
    }
}
