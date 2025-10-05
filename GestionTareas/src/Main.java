import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {


        ArrayList<Tarea> tareas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
          System.out.println("\n--- MENÚ ---");
          System.out.println("1. Agregar tarea");
          System.out.println("2. Listar tareas");
          System.out.println("3. Marcar tarea como 'En progreso'");
          System.out.println("4. Completar tarea");
          System.out.println("5. Salir");
          System.out.print("Elige una opción: ");

          if (!sc.hasNextInt()) {
            System.out.println("Entrada no válida.");
            sc.next(); // consumir entrada errónea
            continue;
          }
          opcion = sc.nextInt();
          sc.nextLine();

          switch (opcion) {
            case 1:
              System.out.print("Título: ");
              String titulo = sc.nextLine();
              System.out.print("Descripción: ");
              String desc = sc.nextLine();
              System.out.print("Prioridad (1-5): ");
              int prioridad;
              if (sc.hasNextInt()) {
                prioridad = sc.nextInt();
                sc.nextLine();
              } else {
                System.out.println("Prioridad no válida, se asigna 3.");
                sc.next();
                prioridad = 3;
              }
              tareas.add(new Tarea(titulo, desc, prioridad));
              System.out.println("Tarea añadida.");
              break;
            case 2:
              if (tareas.isEmpty()) {
                System.out.println("No hay tareas.");
              } else {
                for (int i = 0; i < tareas.size(); i++) {
                  System.out.println(i + " -> " + tareas.get(i));
                }
              }
              break;
            case 3:
              System.out.print("Número de tarea a marcar 'En progreso': ");
              if (sc.hasNextInt()) {
                int num = sc.nextInt();
                sc.nextLine();
                if (num >= 0 && num < tareas.size()) {
                  tareas.get(num).iniciar();
                  System.out.println("Tarea marcada como 'En progreso'.");
                } else {
                  System.out.println("Índice de tarea inválido.");
                }
              } else {
                System.out.println("Entrada no válida.");
                sc.next();
              }
              break;
            case 4:
              System.out.print("Número de tarea a completar: ");
              if (sc.hasNextInt()) {
                int num2 = sc.nextInt();
                sc.nextLine();
                if (num2 >= 0 && num2 < tareas.size()) {
                  tareas.get(num2).completar();
                  System.out.println("Tarea completada.");
                } else {
                  System.out.println("Índice de tarea inválido.");
                }
              } else {
                System.out.println("Entrada no válida.");
                sc.next();
              }
              break;
            case 5:
              System.out.println("Saliendo...");
              break;
            default:
              System.out.println("Opción no válida.");
          }
        } while (opcion != 5);

        sc.close();
      }
    }

