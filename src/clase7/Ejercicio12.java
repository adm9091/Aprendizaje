
package clase7;

/**
 *
 * @author adm_9
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        EsMultiplo(15, 3); // Ejemplo 
    }
    
    public static void EsMultiplo(int numero1, int numero2) { //Aquí se define un método llamado "EsMultiplo" que es "public" (puede ser accedido desde cualquier lugar), "static" (no necesita una instancia de la clase para ser invocado), no devuelve ningún valor (tiene un tipo de retorno "void"), y recibe dos argumentos de tipo entero llamados "numero1" y "numero2".
        if (numero1 % numero2 == 0) { //evaluar si el residuo de la división entre numero1 y numero2 es igual a cero, lo que indica que numero1 es múltiplo de numero2
            System.out.println(numero1 + " es múltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " no es múltiplo de " + numero2);
         }
    }
}