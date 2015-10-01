/**
 * Operaciones y asignaciones
 *
 * @author Eduardo Moreno
 */

public class Ejercicio6 {
  public static void main(String[] args) {

   double BaseImponible = 89.95;
   double  IVA = 0.21;
   double  Total= BaseImponible * IVA;
   
    System.out.println("Base Imponible    " + BaseImponible);
    System.out.println("IVA    " + IVA);
    System.out.println("Total a pagar " + (BaseImponible + Total) + "€");
  }
}
    
  
