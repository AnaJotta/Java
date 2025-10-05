package mundopc.modelo;

public class Raton extends DispositivosEntrada{
    private final int idRaton; //constante porque no se podrá modificar el id
    private static int contadorRatones; //estatico porque se relaciona con la clase y no con los objetos que se crean

    //Constructor


    public Raton(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        this.idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                "} " + super.toString();
    }
}
