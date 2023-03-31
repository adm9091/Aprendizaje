/*
Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo.
Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/
package clase9;

/**
 *
 * @author adm_9
 */
public class AprendizajeArreg5 {
public static void main(String[] args) {

        // Declaración de variables
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        boolean antisimetrica = true;

        // Comprobar si la matriz es antisimétrica
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != -matriz[j][i]) { //negativo
                    antisimetrica = false;
                    break;
                }
            }
            if (!antisimetrica) {
                break;
            }
        }

        // Mostrar el resultado
        if (antisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz NO es antisimétrica");
         }
    }

}