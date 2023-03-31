/*
 Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author adm_9
 */
public class Ejercicio6 {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       int num1, num2;
       Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1=leer.nextInt();
        System.out.println("Ingrese otro numero");
        num2=leer.nextInt();
        if (num1>25&& num2>25){
            System.out.println("ambos numeros son mayores que 25");
        }else if (num1>25|| num2>25){
            System.out.println("uno de ellos es mayor a 25");
        }else 
            System.out.println("ninguno ellos es mayor a 25");
        
       
    


                
        
                
                
    }
    
}