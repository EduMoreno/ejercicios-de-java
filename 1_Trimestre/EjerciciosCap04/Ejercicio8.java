/**
 * 8. Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien,
 *    notable o sobresaliente).
 *
 * @author Eduardo Moreno
 */

public class Ejercicio8 {
  public static void main(String[] args) {

    

    System.out.print("Introduzca  la primera nota:");
    int primera = Integer.parseInt(System.console().readLine()); 
    
    System.out.print("Introduzca  la segunda nota:");
    int segunda = Integer.parseInt(System.console().readLine()); 
   
   System.out.print("Introduzca  la tercera nota:");
    int tercera = Integer.parseInt(System.console().readLine()); 
    
    int resultado = ((primera * segunda) * tercera) / 3;
   
      System.out.println("La media de las 3 notas es " + resultado);
      
      
      
        
    if (resultado < 5) {
      System.out.print("Insuficiente");
    }
    
    if ((resultado >= 5) && (resultado < 6)) {
      System.out.print("Suficiente");
    }
    
    if ((resultado >= 6) && (resultado < 7)) {
      System.out.print("Bien");
    }
    
    if ((resultado >= 7) && (resultado < 9)) {
      System.out.print("Notable");
    }
    
    if ((resultado >= 9) && (resultado == 10)){
      System.out.print("Sobresaliente");
    }
  }
 }































