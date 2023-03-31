
package clase7;

import java.util.Scanner;

/**
 *
 * @author adm_9
 */
public class Ejercicio11 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        int largo=frase.length();
        String punto=frase.substring(largo-1,largo);
        if (punto.equals(".")){
             codificar(frase);
        } else{
            System.out.println("La frase ingresada no termina en punto");
        }    
    }
   
    public static void codificar(String frase) {
        String frase2;
        frase2="";
        int longitud;
        longitud=frase.length();
        
        for (int i=1; i<=longitud; i++){
            String letra=frase.substring(i-1,i);
            if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") || letra.equals("á") || letra.equals("é") || letra.equals("í") || letra.equals("ó") || letra.equals("ú")){
                switch(letra) {
                    case "a":    
                        frase2=frase2.concat("@");
                        break;
                    case "e":   
                        frase2=frase2.concat("#");
                        break;
                    case "i":  
                        frase2=frase2.concat("$");
                        break;
                    case "o":   
                        frase2=frase2.concat("%");
                        break;
                    case "u":  
                        frase2=frase2.concat("*");
                        break;
                }
            }else {
                frase2=frase2.concat(letra);
            }
        }
        System.out.println(frase2);
}   
}
