public class VideoJuego {

  protected int codigo;
  protected String titulo;
  protected String consola;
  protected int cantidadJugadores;
  protected String categoria;

    public VideoJuego() {
  }

  public VideoJuego(int codigo, String titulo, String consola, int cantidadJugadores, String categoria) {
    this.codigo = codigo;
    this.titulo = titulo;
    this.consola = consola;
    this.cantidadJugadores = cantidadJugadores;
    this.categoria = categoria;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getConsola() {
    return consola;
  }

  public void setConsola(String consola) {
    this.consola = consola;
  }

  public int getCantidadJugadores() {
    return cantidadJugadores;
  }

  public void setCantidadJugadores(int cantidadJugadores) {
    this.cantidadJugadores = cantidadJugadores;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

}
