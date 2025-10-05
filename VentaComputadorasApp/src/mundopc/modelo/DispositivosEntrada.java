package mundopc.modelo;

public class DispositivosEntrada {
    private String tipoDeEntrada;
    private String marca;

    //Constructor
    public DispositivosEntrada(String tipoDeEntrada, String marca) {
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivosEntrada{" +
                "tipoDeEntrada='" + tipoDeEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
