/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.

 */
package clase5;
import java.util.Scanner;
/**
 *
 * @author adm_9
 */
public class EjercPrac2 {
     public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);
         String frase; 
       System.out.println("Ingrese una frase");
      frase=leer.nextLine();
         if (frase.equals("Eureka")){
             System.out.println("Su frase es correcta");
         }else {
             System.out.println("Su frase es incorrecta");
         }
     }
}
