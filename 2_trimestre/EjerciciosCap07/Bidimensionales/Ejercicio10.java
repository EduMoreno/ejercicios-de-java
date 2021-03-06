/**
 * 10. Realiza el juego de las tres en raya.
 * 
 * @author Eduardo Moreno
 */
public class Ejercicio10 {
  static final String JUGADOR = "•";
  static final String ORDENADOR = "X"; 
   public static void main(String[] args) {

    String [][] tresEnRaya = new String[12][12]; 
    int columnas;
    int filas;
    int movimientos = 0;
    boolean jugadorGana = false;
    boolean maquinaGana = false;
    String nombreFila = "cba";
    String coordenada;
    
    for(filas = 0; filas < 3; filas++){
      for(columnas = 0; columnas < 3; columnas++){
        tresEnRaya[filas][columnas] = " ";
      }
    }
     
    do{
     
      for(filas = 0; filas < 3; filas++){
        System.out.print(nombreFila.charAt(filas));
        for(columnas = 0; columnas < 3; columnas++){
          System.out.print(" " + tresEnRaya[filas][columnas]);
        }
      System.out.println();
      }
      System.out.println("  1 2 3");
      
      System.out.print("Introduze una coordenada: ");
      coordenada = System.console().readLine();
      int nombreFilas = nombreFila.indexOf(coordenada.charAt(0));
      int nombreColumnas = coordenada.charAt(1) - 1 - 48;
      tresEnRaya[nombreFilas][nombreColumnas] = JUGADOR;
      movimientos++;
      
      jugadorGana = (
        (tresEnRaya[0][0] == JUGADOR) && (tresEnRaya[0][1] == JUGADOR) && (tresEnRaya[0][2] == JUGADOR) ||
        (tresEnRaya[1][0] == JUGADOR) && (tresEnRaya[1][1] == JUGADOR) && (tresEnRaya[1][2] == JUGADOR) ||
        (tresEnRaya[2][0] == JUGADOR) && (tresEnRaya[2][1] == JUGADOR) && (tresEnRaya[2][2] == JUGADOR) ||
        (tresEnRaya[0][0] == JUGADOR) && (tresEnRaya[1][0] == JUGADOR) && (tresEnRaya[2][0] == JUGADOR) ||
        (tresEnRaya[0][1] == JUGADOR) && (tresEnRaya[1][1] == JUGADOR) && (tresEnRaya[2][1] == JUGADOR) ||
        (tresEnRaya[0][2] == JUGADOR) && (tresEnRaya[1][2] == JUGADOR) && (tresEnRaya[2][2] == JUGADOR) ||
        (tresEnRaya[0][0] == JUGADOR) && (tresEnRaya[1][1] == JUGADOR) && (tresEnRaya[2][2] == JUGADOR) ||
        (tresEnRaya[0][2] == JUGADOR) && (tresEnRaya[1][1] == JUGADOR) && (tresEnRaya[2][0] == JUGADOR)
      );
      
      if (!jugadorGana && (movimientos < 9)) {
        do {
          nombreFilas = (int)(Math.random() * 3);
          nombreColumnas = (int)(Math.random() * 3);
        } while (!tresEnRaya[nombreFilas][nombreColumnas].equals(" "));
        
        tresEnRaya[nombreFilas][nombreColumnas] = ORDENADOR;
        movimientos++;
        maquinaGana = (
          (tresEnRaya[0][0] == ORDENADOR) && (tresEnRaya[0][1] == ORDENADOR) && (tresEnRaya[0][2] == ORDENADOR) ||
          (tresEnRaya[1][0] == ORDENADOR) && (tresEnRaya[1][1] == ORDENADOR) && (tresEnRaya[1][2] == ORDENADOR) ||
          (tresEnRaya[2][0] == ORDENADOR) && (tresEnRaya[2][1] == ORDENADOR) && (tresEnRaya[2][2] == ORDENADOR) ||
          (tresEnRaya[0][0] == ORDENADOR) && (tresEnRaya[1][0] == ORDENADOR) && (tresEnRaya[2][0] == ORDENADOR) ||
          (tresEnRaya[0][1] == ORDENADOR) && (tresEnRaya[1][1] == ORDENADOR) && (tresEnRaya[2][1] == ORDENADOR) ||
          (tresEnRaya[0][2] == ORDENADOR) && (tresEnRaya[1][2] == ORDENADOR) && (tresEnRaya[2][2] == ORDENADOR) ||
          (tresEnRaya[0][0] == ORDENADOR) && (tresEnRaya[1][1] == ORDENADOR) && (tresEnRaya[2][2] == ORDENADOR) ||
          (tresEnRaya[0][2] == ORDENADOR) && (tresEnRaya[1][1] == ORDENADOR) && (tresEnRaya[2][0] == ORDENADOR)
        );
      }  
      
    }while(!jugadorGana && !maquinaGana && (movimientos < 9));
    
      for(filas = 0; filas < 3; filas++){
        System.out.print(nombreFila.charAt(filas));
        for(columnas = 0; columnas < 3; columnas++){
          System.out.print(" " + tresEnRaya[filas][columnas]);
        }
      System.out.println();
      }
      System.out.println("  1 2 3");
      
    if (jugadorGana) {
      System.out.println("¡Has ganado!");
    } else if (maquinaGana) {
      System.out.println("Gana la maquina.");
    } else {
      System.out.println("Empate");
    }
  }
}
