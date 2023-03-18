/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package aprendizaje 
        ;

import java.util.Scanner;

/**
 *
 * @author adm_9
 */
public class Aprendizaje1 {

    
    public static void main(String[] args) {
       int num1,num2,suma;
       Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1=Integer.parseInt(leer.next());
        System.out.println("Ingrese otro numero");
        num2=Integer.parseInt(leer.next());

        suma=num1+num2;
        System.out.println("la suma de los numeros es:" +suma);
      
                
        
                
                
    }
    
}
