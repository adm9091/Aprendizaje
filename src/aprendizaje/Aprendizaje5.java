/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizaje;

import java.util.Scanner;



public class Aprendizaje5 {
     public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
         System.out.println("Ingrese un numero");
         int num=leer.nextInt();
         int doble= num*2;
         int triple= num*3;
         double raizCuadrada= Math.sqrt(num);
          System.out.println("El doble de " + num + "es" + doble );
          System.out.println("El triple de " + num + "es" + triple);
          System.out.println("La raiz cuadrada de " + num + "es" + raizCuadrada);
    }      
}
