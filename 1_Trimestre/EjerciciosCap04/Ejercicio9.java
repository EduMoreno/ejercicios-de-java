/**
 * 9. Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax 2 + bx + c = 0).
 *
 * @author Eduardo Moreno
 */


public class Ejercicio9 {
  public static void main(String[] args) {

   double x1, x2;

    System.out.print("Introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());

      if ((a == 0) && (b == 0) && (c == 0)) {
        System.out.println("Tiene infinitas soluciones.");
    }

       //c distinto de 0

      if ((a == 0) && (b == 0) && (c != 0)) {
        System.out.println("No tiene solucion");
    }

      // a y b distintos de 0

      if ((a != 0) && (b != 0) && (c == 0)) {
        System.out.println("x1 = 0");
        System.out.println("x2 = " + (-b / a));
    }

      //  b y c distintos de 0

      if ((a == 0) && (b != 0) && (c != 0)) {
        System.out.println("x1 = x2 = " + (-c / b));
    }

      //  a, b y c distintos de 0
      
      if ((a != 0) && (b != 0) && (c != 0)) {	

        double discriminante = b*b - (4 * a * c);

        if (discriminante < 0) {
            System.out.println("No tiene solucion");
        }
        
         else {
            System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(4 * a * c));
            System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(4 * a * c));
          }
      }
    
  }
}
























