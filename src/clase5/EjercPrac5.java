/*
Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.

 */
package clase5;

import java.util.Scanner;


/**
 *
 * @author adm_9
 */
public class EjercPrac5 {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número límite");
    //se establece el limite 
        int limite=sc.nextInt();
        int suma = 0;
        //suma=0;
        
        while (suma<limite){
            System.out.println("Ingrese un número");
             int num = sc.nextInt();
            suma+=num;//suma los numeros ingresados, el bucle finaliza al alcanzar el valor del limite
            System.out.println(suma);
         }

     }  
}
