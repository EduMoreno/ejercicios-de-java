/**
 * 8.Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
 * determinado año y que muestre a continuación un diagrama de barras horizontales con
 * esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
 * carácter
 *
 * @author Eduardo Moreno
 */

public class Ejercicio8 {
    
  public static void main(String[] args) {
    
  String[] mes = {
    "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio", "Agosto", 
    "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    
    int[] temperatura = new int[12];
    
    for (int n = 0; n < 12; n++) {
      System.out.print("¿Cuál es la temperatura media de " + mes[n] + "?: ");
      temperatura[n] = Integer.parseInt(System.console().readLine());
    }

    for (int a = 0; a < 12; a++) {
     System.out.print(mes[a] + "|");
      for (int n = 0; n < temperatura[a]; n++) {
        System.out.print("=");
      }
       
      System.out.print( " " + temperatura[a] + "ºC \n" );
    }
  }
}
