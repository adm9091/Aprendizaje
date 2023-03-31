/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Substring y equals() de Java.
 */
package clase5;
import java.util.Scanner;
/**
 *
 * @author adm_9
 */
public class EjercPrac4 {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String frase = sc.nextLine();
       System.out.println("Ingrese una frase");
       frase=sc.nextLine();//se utiliza para leer lo que sale en pantalla
       if (frase.substring (0, 1).toUpperCase().equals("A")){
             System.out.println("Su frase es Correcta");
         }else {
             System.out.println("Su frase es Incorrecta");
         }
     }
}
