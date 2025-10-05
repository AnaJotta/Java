package presentacion;

import dominio.Peliculas;
import servicio.IServicioPeliculas;
import servicio.ServicioPeliculasLista;

import java.util.Scanner;

public class CatalogoPeliculasApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in);
        // Implementamos el servicio
        //IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasArchivo();
        while (!salir) {
            try {
                mostrarMenu();
                salir = ejecutarOpciones(consola,servicioPeliculas);
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
            System.out.println();
        }//fin while
    }

    private static void mostrarMenu() {
        System.out.println("""
                *** Catálogo de Películas ***
                1. Agregar película
                2. Listar película
                3. Buscar película
                4. Salir
                Introduce una opción:
                """);

    }

    private static boolean ejecutarOpciones(Scanner consola, IServicioPeliculas servicioPeliculas) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion){
            case 1 -> {
                System.out.println("Introduce el nombre de la película:");
                var nombrePelicula = consola.nextLine();
                servicioPeliculas.AgregarPelicula(new Peliculas(nombrePelicula));
            }
            case 2 -> servicioPeliculas.ListarPeliculas();
            case 3 -> {
                System.out.println("Introduce la película a buscar: ");
                var buscar = consola.nextLine();
                servicioPeliculas.BuscarPelicula(new Peliculas(buscar));
            }
            case 4 -> {
                System.out.println("Hasta pronto!");
                salir = true;
            }
            default -> System.out.println("Opción no reconocida: " + opcion);
        }
        return salir;
    }

 }
