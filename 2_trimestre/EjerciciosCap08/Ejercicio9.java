/**
 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
 *
 * @author Eduardo Moreno
 */

public class Ejercicio9{
    
  public static void main(String[] args) {
  
   System.out.print("Introduzca un numero: ");
      int numero = Integer.parseInt(System.console().readLine());
      
   System.out.print("Introduzca los digitos a eliminar: ");
      int digito = Integer.parseInt(System.console().readLine());
     int a;
  int contador = 0;
   
   do {
    a = numero / 10; 
    contador++;
     
    } while( contador <= digito ); 
    System.out.print(a);
 }
}
