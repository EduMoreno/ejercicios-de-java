/**
 * 2.Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos
 * según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos
 * del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 *
 * @author Eduardo Moreno
 */

public class Ejercicio2 {
    
  public static void main(String[] args) {
  
  char[] simbolo = new char[10];
  
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    
  System.out.print("  Indice "); 

  for ( int n=0; n < 10; n++){
    System.out.print(n + "   ");

  }
    System.out.println();

    System.out.print("  Valor  "); 

  for ( char n=0; n < 10; n++){
    System.out.print(simbolo[n] + "   ");
    if (n==3){
      System.out.print("   ");
    }
  }
 }
}
