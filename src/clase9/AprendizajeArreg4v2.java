/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota
por B y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package clase9;

/**
 *
 * @author adm_9
 */
public class AprendizajeArreg4v2 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matriztras = new int[4][4];
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print("[" + matriz[i][j] + "]");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("MATRIZ TRASPUESTA");
        //System.out.println(" ");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                matriztras[j][i] = matriz[i][j];
                System.out.print("[" + matriz[j][i] + "]");
            }
        }
    }
}
     
