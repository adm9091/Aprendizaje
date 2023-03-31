/*Escriba un programa que valide si una nota está entre 0 y 10,
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
package clase4;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = -1;
        while (nota <0 || nota >10){
            System.out.println("Ingrese una nota entre 0 y 10 ");
            nota = sc.nextDouble();
            
            if (nota <0 || nota>10){
                System.out.println("Nota invalida");
            }
        
    }
                System.out.println("la nota ingresada es:" + nota);      

    }

}