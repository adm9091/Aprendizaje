/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.

 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author adm_9
 */
public class EjercPrac3 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
            String frase; 
       System.out.println("Ingrese una frase");
      frase=leer.nextLine();
       if (frase.length()!=8){
             System.out.println("Su frase es Incorrecta");
         }else {
             System.out.println("Su frase es Correcta");
         }
     }
}
