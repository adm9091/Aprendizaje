/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package clase4;
public class EjercPrac1 {

  public static void main(String[] args) {
    int valor = 100;
    boolean resultado = esPar(valor);
    System.out.println("El número es par: " + resultado);
  }

  public static boolean esPar(int numero) {
      return numero % 2 == 0;
  }

}
