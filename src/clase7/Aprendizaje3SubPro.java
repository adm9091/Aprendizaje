/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;
import java.util.Scanner;

/**
 *
 * @author adm_9
 */
public class Aprendizaje3SubPro {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de euros a convertir:");
        double euros = leer.nextDouble();
        leer.nextLine();
        System.out.println("Introduzca la moneda a la que desea convertir (libras, dolares o yenes):");
        String moneda = leer.nextLine();
        convertirMoneda(euros, moneda);
    }

    public static void convertirMoneda(double euros, String moneda) {
        double cambio = 0;
        String mensaje = "";
        switch (moneda.toLowerCase()) {
            case "libras":
                cambio = euros * 0.86;
                mensaje = euros + " € son " + cambio + " libras";
                break;
            case "dolares":
                cambio = euros * 1.28;
                mensaje = euros + " € son " + cambio + " dolares";
                break;
            case "yenes":
                cambio = euros * 129.8;
                mensaje = euros + " € son " + cambio + " yenes";
                break;
            default:
                System.out.println("Moneda no válida");
                return;
        }
        System.out.println(mensaje);
    }
}
