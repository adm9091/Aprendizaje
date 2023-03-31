

/** * * Crear un programa que dado un número determine si es par o impar. */

package clase4;
import java.util.Scanner;


public class EjercPrac1v2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 5;
        if (num % 2==0){
            System.out.println("El numero es par.");
        }else
            System.out.println("El numero no es par.");
    }
}