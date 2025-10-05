import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      ArrayList<VideoJuego> listaJuegos = new ArrayList<> ();
              
      VideoJuego juego1 = new VideoJuego(001,"Zelda", "Nintendo 64", 2,"guerra");
      VideoJuego juego2 = new VideoJuego(002,"Minecraft", "Nintendo Switch",4, "creativo");
      VideoJuego juego3 = new VideoJuego(003, "Fortnite", "Xbox", 4, "guerra");
      VideoJuego juego4 = new VideoJuego(004, "Super Mario", "Nintendo 64", 6, "cooperativo");
      VideoJuego juego5 = new VideoJuego(005, "Donkey kong", "PlayStation 4", 2, "cooperativo");
   
      listaJuegos.add(juego1);
      listaJuegos.add(juego2);
      listaJuegos.add(juego3);
      listaJuegos.add(juego4);
      listaJuegos.add(juego5);

      listaJuegos.get(0).setTitulo("Pokemon Diamante");
      listaJuegos.get(0).setCantidadJugadores(4);
      listaJuegos.get(2).setTitulo("Kirby");
      listaJuegos.get(0).setCantidadJugadores(2);



      for (VideoJuego vj : listaJuegos) {

        if (vj.getConsola().equals("Nintendo 64")) {

        System.out.println("Juego nº: " + vj.getCodigo() +
                "= Título: " + vj.getTitulo() + ", consola: "
                + vj.getConsola() + ", nº de jugadores: "
                + vj.getCantidadJugadores() + "; categoría: "
                + vj.getCategoria());
      }


      }

      }

      
    }


