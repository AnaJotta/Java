import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el dni de la persona (0 para salir)");
    String dni = sc.nextLine();

    System.out.println("Introduzca el nombre de la persona (fin para salir)");
    String nombre = sc.nextLine();

    while (!dni.equals("0") && !nombre.equalsIgnoreCase("fin")) {
      System.out.println("Introduzca la edad de la persona");
      int edad = sc.nextInt();
      sc.nextLine(); // limpiar el buffer del Enter

      if (edad >= 6 && edad <= 10) {
        System.out.println("La categoría es Menores A");
      } else if (edad >= 11 && edad <= 17) {
        System.out.println("La categoría es Menores B");
      } else if (edad >= 18 && edad <= 30) {
        System.out.println("La categoría es Juveniles");
      } else if (edad >= 31 && edad <= 50) {
        System.out.println("La categoría es Adultos");
      } else if (edad >= 51) {
        System.out.println("La categoría es Adultos Mayores");
      } else {
        System.out.println("La persona no tiene la edad mínima para participar");
      }

      System.out.println("--------------------------------");

      // pedir nuevos datos dentro del while
      System.out.println("Introduzca el dni de la persona (0 para salir)");
      dni = sc.nextLine();

      System.out.println("Introduzca el nombre de la persona (fin para salir)");
      nombre = sc.nextLine();
    }

    System.out.println("Programa finalizado.");
    sc.close();
  }
}



