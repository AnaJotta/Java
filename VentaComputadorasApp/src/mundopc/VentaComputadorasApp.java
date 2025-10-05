package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Pedido;

public class VentaComputadorasApp {
    public static void main(String[] args) {
    //Crear objetos
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo= new Monitor("Lenovo", 45);
        System.out.println(monitorLenovo);
        Computadora computadoraLenovo=new Computadora("Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        System.out.println(computadoraLenovo);

        // Objeto computadora Dell
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        // Creamos un pedido
        Pedido pedido1 = new Pedido();
        pedido1.agregarComputadora(computadoraLenovo);
        pedido1.agregarComputadora(computadoraDell);
        pedido1.mostrarOrden();

        // Objeto Computadora IMac
        Monitor monitorMac = new Monitor("Mac", 27);
        Teclado tecladoMac = new Teclado("bluetooth", "Mac");
        Raton ratonMac = new Raton("bluetooth", "Mac");
        Computadora computadoraIMac = new Computadora("iMac", monitorMac, tecladoMac, ratonMac);

        Pedido pedido2 = new Pedido();
        pedido2.agregarComputadora(computadoraIMac);
        pedido2.agregarComputadora(computadoraDell);
        pedido2.agregarComputadora(computadoraLenovo);
        System.out.println();
        pedido2.mostrarOrden();


    }
}