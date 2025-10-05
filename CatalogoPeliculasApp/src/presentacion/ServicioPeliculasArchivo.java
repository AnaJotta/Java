package presentacion;

import dominio.Peliculas;
import servicio.IServicioPeliculas;

import java.io.*;

public class ServicioPeliculasArchivo  implements IServicioPeliculas {

    private final String NOMBRE_ARCHIVO = "peliculas.txt";

    public ServicioPeliculasArchivo() {
        var archivo = new File(NOMBRE_ARCHIVO);
        try { // si ya existe el archivo no se vuelve a crear
            if (archivo.exists()) {
                System.out.println("El archivo ya existe!");

            } else { // si no existe, se crea vacío
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al abrir el archivo: " + e.getMessage());
        }
    }

    @Override
    public void ListarPeliculas() {
        //volvemos a abrir el archivo
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            System.out.println("Listado de Películas:");
            // Abrimos el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo)); // para que podamos leer el archivo
            // Leemos línea a línea el archivo
            String linea;
            linea = entrada.readLine();
            while (linea != null) {
                var pelicula = new Peliculas(linea);
                System.out.println(pelicula);
                // Antes de terminar el ciclo volvemos a leer la siguiente linea
                linea = entrada.readLine();
            }
            //cerrar el archivo
            entrada.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer el archivo " + e.getMessage());
        }


    }

    @Override
    public void AgregarPelicula(Peliculas peliculas) {
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            // Revisamos si existe el archivo
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            // Agregamos la pelicula (toString)
            salida.println(peliculas);
            salida.close();
            System.out.println("Se agregó al archivo " + peliculas);
        } catch (Exception e) {
            System.out.println("Ocurrió un error al agregar la película: " + e.getMessage());
        }

    }

    @Override
    public void BuscarPelicula(Peliculas peliculas) {
        var archivo = new File(NOMBRE_ARCHIVO);
        try { //abrimos el archivo para lectura línea a línea
            var entrada = new BufferedReader(new FileReader(archivo));
            String lineaTexto;
            lineaTexto = entrada.readLine();
            var indice = 1;
            var encontrada = false;
            var peliculaBuscar = peliculas.getName();
            while ((lineaTexto!=null)) {
                //buscamos sin importar may./ min.
                if (peliculaBuscar != null && peliculaBuscar.equalsIgnoreCase(lineaTexto)) {
                    encontrada = true;
                    break;
                }
                //leemos la siguiente línea antes de la siguiente iteracion
                lineaTexto = entrada.readLine();
                indice++;
            }// fin while
            //imprimimos los resultados de la busqueda
            if (encontrada)
                System.out.println("Película " + lineaTexto + " encontrada - línea: " + indice);
            else
                System.out.println("No se ha encontrado la película "+ peliculas.getName());
            entrada.close();

        } catch (Exception e) {
            System.out.println("Ocurrió un error al buscar la película: " + e.getMessage());
        }
    }
}
