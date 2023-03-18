/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package aprendizaje 
        ;

import java.util.Scanner;


public class Aprendizaje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Scanner leer= new Scanner(System.in);
        String nombre;
          System.out.println("Ingrese su nombre");   
          nombre=leer.next();
          
          System.out.println("Hola bienvenido su nombre es " +nombre );
                
    }
    
}