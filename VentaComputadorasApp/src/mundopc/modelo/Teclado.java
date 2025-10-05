package mundopc.modelo;

public class Teclado extends DispositivosEntrada{
    private final int idTeclado; //constante porque no se podrá modificar el id
    private static int contadorTeclados; //estatico porque se relaciona con la clase y no con los objetos que se crean

    //Constructor

    public Teclado(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        this.idTeclado = ++contadorTeclados;

    }

    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                "} " + super.toString();
    }
}
