package servicio;

import dominio.Peliculas;
import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculasLista implements IServicioPeliculas {

    private final List<Peliculas> peliculas;

    public ServicioPeliculasLista() {
        this.peliculas = new ArrayList<>();
    }

    @Override
    public void ListarPeliculas() {
        System.out.println("Listado de Películas... ");
        this.peliculas.forEach(System.out::println);

    }

    @Override
    public void AgregarPelicula(Peliculas pelicula) {
        this.peliculas.add(pelicula); // usamos la lista de la clase
        System.out.println("Se agregó la película: " + pelicula);
        System.out.println("--------------------------------------------------------------------------");
    }

    @Override
    public void BuscarPelicula(Peliculas pelicula) {
        System.out.println("--------------------------------------------------------------------------");
        var indice = this.peliculas.indexOf(pelicula); // buscamos en la lista
        if (indice != -1) {
            System.out.println("Película encontrada en el índice: " + (indice+1));
        } else {
            System.out.println("Película no encontrada: " + pelicula);
        }
    }

    public static void main(String[] args) {
        var pelicula1 = new Peliculas("Batman");
        var pelicula2 = new Peliculas("Superman");
        // Creamos el servicio (patron de diseño servicio)
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();
        //Agregar películas a la lista
        servicioPeliculas.AgregarPelicula(pelicula1);
        servicioPeliculas.AgregarPelicula(pelicula2);
        //Listar las películas
        servicioPeliculas.ListarPeliculas();
        //Buscar una película (se debe implementar el método equals y hashcode para que el metodo indexOf
        // funcione correctamente, ya que es para los objetos que ya tenemos en nuestra lista)
        servicioPeliculas.BuscarPelicula(pelicula1);
    }

}
