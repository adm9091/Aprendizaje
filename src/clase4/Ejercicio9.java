/*Escriba un programa que lea 20 números. Si el número leído es igual a cero 
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números 
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso 
de la sentencia break.
*/
package clase4;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;

        while (contador < 20) { // se lean los 20 numeros
            System.out.println("Ingrese un número");
            int numero = sc.nextInt();
            if (numero == 0) {
                System.out.println("Se capturo el número 0");
                break;
            }
            if (numero > 0) { //si el numero es + se suma

                suma += numero;
            }
            contador++; //se incremente el contador 

        }
        System.out.println("La suma de los numeros es:" + suma);
    }

}
