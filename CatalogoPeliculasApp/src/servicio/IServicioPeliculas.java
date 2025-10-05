package servicio;

import dominio.Peliculas;

public interface IServicioPeliculas {
    public void ListarPeliculas();

    public void AgregarPelicula(Peliculas peliculas);

    public void BuscarPelicula(Peliculas peliculas);
}
