/*
Utilizando un Bucle for, aloja en el vector Equipo,
los nombres de tus compañeros de equipo
 */
package clase9;

import java.util.Scanner;

/**
 *
 * @author adm_9
 */
public class Ejercicio14 {
     public static void main(String[] args) {
       int cantidadCompañeros=3;
       String [] equipo = new String[cantidadCompañeros];
       
       for (int i = 0; i < cantidadCompañeros; i++) {
           System.out.println("Ingrese el nombre "+(i+1)+" :");
           Scanner leer = new Scanner(System.in);
           equipo[i] = leer.next();
       }
       System.out.println("Los nombres de los compañeros son: ");
       for (int i = 0; i < cantidadCompañeros; i++) {
       System.out.println(equipo[i]);
   }
   }
}


