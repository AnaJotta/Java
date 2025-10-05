import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    /*Crea un programa en Java que simule un cajero automático con las siguientes funciones:

    El usuario debe autenticarse con un PIN (ejemplo: 1234).

    Opciones disponibles:

    Consultar saldo

    Depositar dinero

    Retirar dinero (no permitir retirar más del saldo disponible)

    Salir

    Usa un bucle para mostrar el menú hasta que el usuario decida salir.*/

    Scanner sc = new Scanner(System.in);
    int pin = 1234;
    double saldo = 1000.00;
    int intentos = 0;
    boolean autenticado = false;

    while (intentos < 3 && !autenticado) {
      System.out.println("Introduzca el pin: ");
      int ingreso = sc.nextInt();
      if (ingreso == pin) {
        autenticado = true;

      } else {
        intentos++;
        System.out.println("PIN incorrecto");
      }

    }
    if (!autenticado) {
      System.out.println("Cuenta bloqueada");
      return;
    }
    int opcion;

    do {
      System.out.println("\n--- MENU CAJERO ---");
      System.out.println("\n Elija una opción del 1 al 4: ");
      System.out.println("1. Consultar saldo");
      System.out.println("2. Depositar dinero");
      System.out.println("3. Retirar dinero");
      System.out.println("4. Salir");

      opcion = sc.nextInt();


      switch (opcion) {

        case 1:
          System.out.println("Su saldo actual es de: " + saldo + "$");
          break;

        case 2:
          System.out.println("Introduzca la cantidad a ingresar");
          double depos = sc.nextDouble();
          saldo += depos;
          System.out.println("Ingreso exitoso");
          break;

        case 3:
          System.out.println("Introduzca la cantidad a retirar");
          double ret = sc.nextDouble();
          if (ret < saldo) {
            saldo -= ret;
            System.out.println("Retirada exitosa");
          } else {
            System.out.println("Saldo insuficiente");
          }
          break;

        }
      }
    while (opcion !=4);
      System.out.println("Gracias por usar el cajero");


  }
}