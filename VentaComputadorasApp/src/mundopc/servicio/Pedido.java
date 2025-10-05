package mundopc.servicio;

import mundopc.modelo.Computadora;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final int idPedido;
    private final List<Computadora> computadoras;
    private static int contadorPedidos;

    public Pedido(){
        computadoras = new ArrayList<>();
        this.idPedido = ++contadorPedidos;
    }

    public void agregarComputadora(Computadora computadora){
        computadoras.add(computadora);
    }

    public void mostrarOrden(){
        System.out.println("Pedido #: " + idPedido);
        System.out.println("Total computadoras: " + computadoras.size());
        computadoras.forEach(System.out::println);
    }

}
