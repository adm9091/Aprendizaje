/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package aprendizaje; 
       

import java.util.Scanner;


public class Aprendizaje4{
     public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
         System.out.println("Ingrese los grados centigrados");
         int celsius=leer.nextInt();
         double fahrenheit= 32+(9.0/5)* celsius;
         System.out.println("El equivalente en grados fahrenheit es: " +fahrenheit);
      
                
        
                
                
    }
    
}
