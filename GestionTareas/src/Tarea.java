public class Tarea {

  //Registrar tareas con:
  private String titulo;
  private String descripcion;
  private String estado; //(Pendiente, En progreso, Completada)
  private int prioridad; // (1 a 5)

  public Tarea(String titulo, String descripcion, int prioridad) {
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.estado = "Pendiente";
    if (prioridad < 1 || prioridad > 5) prioridad = 3;
    this.prioridad = prioridad;
  }

  public void iniciar() {
    if (!"Completada".equalsIgnoreCase(estado)) {
      this.estado = "En progreso";
    }
  }

  public void completar() {
    this.estado = "Completada";
  }

  @Override
  public String toString() {
    return String.format("[Tarea: %s, Descripción de la tarea: %s, Estado: %s, Prioridad: %d]",
            titulo, descripcion, estado, prioridad);
  }


}
