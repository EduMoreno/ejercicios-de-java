/**
 * Crea la clase Fracción . Los atributos serán numerador y denominador . Y algunos de
 * los métodos pueden ser invierte , simplifica , multiplica , divide , etc.
*/


public class Fraccion {
  
  private int signo; 
  private int numerador;
  private int denominador;
  
  public Fraccion(int nume, int deno){
    if (deno == 0) {
      System.out.println("Una fracción no puede tener como denominador el número 0");
    } else {
      if (nume * deno < 0) {
        this.signo = -1;
      } else {
        this.signo = 1;
      }
      this.numerador = Math.abs(nume);
      this.denominador = Math.abs(deno);
    }
  }
  
  int getnumerador(){
    return this.numerador;
  }
  
  int getdenominador(){
    return this.denominador;
  }
  
  public String toString(){
    if(signo == -1){
      return "-" + this.numerador + "/" + this.denominador;
    }else{
      return this.numerador + "/" + this.denominador;
    }
  }
  
  
  public Fraccion multiplica(int i){
    return new Fraccion(this.signo * this.numerador * i, this.denominador * i);
  }
  
  public Fraccion multiplica(Fraccion f) {
    return new Fraccion(this.signo * this.numerador * f.getnumerador(), this.denominador * f.getdenominador());
  }
  
  public Fraccion divide(int n) {
    return new Fraccion(this.signo * this.numerador, this.denominador * n);
  }
  
  public Fraccion divide(Fraccion f) {
    return new Fraccion(this.signo * this.numerador * f.getdenominador(), denominador * f.getnumerador());
  }
    
}
